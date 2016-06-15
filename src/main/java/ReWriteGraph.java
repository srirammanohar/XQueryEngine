import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.misc.Pair;
import org.w3c.dom.Node;

public class ReWriteGraph {

	public static void main(String args[]) {
		
	
	String main_str = "";	
	Graph g = new Graph();
	String token= "";
	String query = "for $b1 in doc(input)/book,\n"+
					"$aj in $b1/author/first/node,\n" +
					"$a1 in $b1/author,\n"+ 
					"$af1 in $a1/first/node,\n"+ 
					"$al1 in $a1/last/node,\n"+ 
					"$b2 in doc(input)/book,\n"+ 
					"$a21 in $b2/author,\n"+ 
					"$af21 in $a21/first/node,\n" + 
					"$al21 in $a21/last/node,\n" +
					"$a22 in $b2/author,\n" + 
					"$af22 in $a22/first/node,\n" + 
					"$al22 in $a22/last/node,\n" + 
					"$b3 in doc(input)/book,\n" + 
					"$a3 in $b3/author,\n" + 
					"$af3 in $a3/first/node,\n" + 
					"$al3 in $a3/last/node,\n" + 
					"where $aj eq \"John\" AND\n" + 
					"$af1 eq $af21 AND\n" +
					"$al1 eq $al21 AND\n" + 
					"$af22 eq $af3 AND\n" + 
					"$al22 eq $al3\n" +
					"return <triplet> { $b1 , $b2, $b3 } </triplet>\n" ;
	
	String filename="testinput.txt";
	String query1="";
	String content = null;

	try {
		 content = new Scanner(new File(filename)).useDelimiter("\\Z").next();
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	System.out.println(content);
	String[] split_token = content.split("\n");
    Vertex a = null;
    Vertex test = null;
    Vertex v = null;
	for(int i=0 ; i< split_token.length; i++) {
		
        List<String> matchList = new ArrayList<String>();
        String match[] =  split_token[i].split(" ");
		for(int k=0; k<match.length;k++){
			matchList.add(match[k]);
		}
	    String exp = "";

		for(int j=0;j<matchList.size();j++) {
			
	        	if(matchList.get(j).contains("for") ) {
	        		exp = "for";

	        	}
	        	else if(matchList.get(j).equals("where")  ){
	        		exp = "where";

	        	}
	        	else if(matchList.get(j).contains("let"))
	        		exp = "let";
	        	else if(matchList.get(j).equals("in") ) {
	        		exp = "in";

	        	
	        	}
	        	else if(matchList.get(j).equals("eq")||matchList.get(j).equals("=")  ){
	        		exp = "eq";
	        		}
	        	else if(matchList.get(j).equals("and") ){
	        		exp = "and";
	        		}
	        	else if(matchList.get(j).equals("return")) {
	        		exp = "return";
	        		break; }
	        	else {
	        		if(exp.equals("for") || ( (j==0) && matchList.get(0).startsWith("$")) && matchList.get(1).equals("in")) {
	        			if(g.contains(matchList.get(j)))
	        				a = g.getVertex(matchList.get(j));
	        			else
	        				a = new Vertex(matchList.get(j));
	        				}
	        				
	        		else if(exp.equals("in")) {
	        			//System.out.println(matchList.get(j) + exp + " sssdocccc");
	        				String s[]= matchList.get(j).split("/",2);
	        				
	        				if(g.contains(s[0]))
	        					v= g.getVertex(s[0]);
	        				else
	        					v = new Vertex(s[0]);
	        				if(s[0].contains("doc"))
								g.setRoot(v);
	        				//System.out.println(exp);
	        				a.setParent(v);
	        				Pair p = new Pair(a,v);
	        				if(s[1].contains(",")){
	        					s[1]=s[1].substring(0, s[1].length()-1);
	        				}
	        				Edge e = new Edge(p , s[1]);
	        				//System.out.println(s[1]+"llllll");
	        				g.addVertex(v);
	        				g.addVertex(a);
	        				g.addEdge(e); }
	        		
	        		else if(exp.equals("where")||(exp.toLowerCase().equals("and") && (j!=0))|| ( (j==0) && matchList.get(0).startsWith("$") && (matchList.get(1).equals("eq")||matchList.get(1).equals("=")))) {
        					a = g.getVertex(matchList.get(j));
        			      // System.out.println(" Matching where" + matchList.get(j));		
	        		
	        		}
        			
	        		else if(exp.equals("eq")) {
	        			if(g.contains(matchList.get(j)))
	        				{v = g.getVertex(matchList.get(j));
	        				Pair p = new Pair(a,v);
	        				g.addRetAttr(a.a);
	        				g.addRetAttr(v.a);
	        				
	        				g.addAuxilaryEdge(p);
	        				
	        				if(test == null)
	        				test = a;
	        				
	        				
	        				}
	        			else {
	        				v= new Vertex(matchList.get(j),1);
	        				v.setParent(a);
	        				Pair p = new Pair(v,a);
	        				Edge e = new Edge(p, " ");
	        				g.addEdge(e);
	        				
	        				
	        			}}}    }
		
	
	           if(exp.equals("return")){
	        	   String s = split_token[i];
	        	   for(int j=i+1;j<split_token.length;j++,i++)
	        		   s= s.concat("\n" +split_token[j] );
	        	   g.ret_string =s;
	        	 
	        	 String a1[] =  s.split("\\s(?=\\{)|(?<=\\})\\s");
	        	 for(int k=0; k<a1.length ; k++) {
	        		 //System.out.println(a1[k] + "a1[k].........." );
	        		 if(a1[k].startsWith("{"))
	        			 main_str  = main_str+ a1[k].substring(1, a1[k].length()-1);
	        		 System.out.println(main_str + "MAIIN STRING"+"\n");
	        	 }
	        	   
	           }
	           }
					g.printGraph();
					Vertex r1= null;
					//if(test!=null)  r1 = g.getRoot(test);
					
			Vertex main_root=g.root;
			ArrayList<Vertex> subtree=g.getChildren(main_root);
			//System.out.println(main_root.a);
			ArrayList<String> sub_string=new ArrayList<String>();
			Rewrite final_string = new Rewrite(g);
			ArrayList<String> retlist=new ArrayList<String>();
			
			retlist=final_string.extractString(main_str);
			for(int i =0;i<subtree.size();i++){				
				
				//String s = final_string.reWrite();	        
				for(int j=0; j<retlist.size();j++){
					g.addRetAttr(retlist.get(j));	        	
				}				
				 sub_string.add(final_string.writingForWhere(subtree.get(i)));				
			}
			
		
			String joinedquery="";
			int counter=0;
			HashSet<Pair<Vertex,Vertex>> root_hash=new HashSet<Pair<Vertex,Vertex>>();
			for( Pair<Vertex,Vertex> hashpair : g.aux_edges){
				Pair p= new Pair(g.getRoot(hashpair.a),g.getRoot(hashpair.b));
				root_hash.add(p);
			}
			
			for( Pair<Vertex,Vertex> hashpair : root_hash){
				
				
				
				int index1 =0;
				int index2=0;
				for(int i=0;i<subtree.size();i++){
					if(subtree.get(i).a.equals(hashpair.a.a))
						index1=i;
					if(subtree.get(i).a.equals(hashpair.b.a))
						index2=i;
				}
				
				if(counter==0){
					String j_attr= final_string.getJoinattr(subtree.get(index1), subtree.get(index2));
					joinedquery=final_string.joinSubstring(sub_string.get(index1), sub_string.get(index2), j_attr);}
				else{
					
					String j_attr= final_string.getJoinattr(subtree.get(index1), subtree.get(index2));
					joinedquery=final_string.joinSubstring(joinedquery, sub_string.get(index2), j_attr);}
				counter++;
			}

			for(int k=0;k<retlist.size();k++){
				String replacestr="$tuple/";
				g.ret_string=g.ret_string.replace(retlist.get(k), replacestr.concat((retlist.get(k).substring(1, retlist.get(k).length())+"/*")) );
				
			}
			
			g.ret_string = g.ret_string.replaceFirst("\\{","\\{ (");
			g.ret_string=g.ret_string.replaceAll(",", ") , (");
			int pos = g.ret_string.lastIndexOf("}");
			String temp=g.ret_string.substring(pos);
			String tempnew=") ";
			tempnew=tempnew.concat(temp);
			g.ret_string= g.ret_string.replace(temp,tempnew);
			
			System.out.println("\n"+g.ret_string);
			String rewritten_query="for $tuple in ";
			rewritten_query=rewritten_query.concat(joinedquery+"\n"+g.ret_string);
			
			File file = new File("Rewritten_query.txt");

			if (!file.exists()) {
				try {
					file.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			FileWriter fw = null;
			try {
				fw = new FileWriter(file.getAbsoluteFile());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			BufferedWriter bw = new BufferedWriter(fw);
			try {
				bw.write(rewritten_query);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	    }

	
			
}



