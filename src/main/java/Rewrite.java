import java.util.ArrayList;
import java.util.Stack;

import org.antlr.v4.runtime.misc.Pair;
import org.w3c.dom.Node;

public class Rewrite {

	Graph g;
	public Rewrite(Graph gr) {
		// TODO Auto-generated constructor stub
		this.g = gr;
		
	}
	  String reWrite(){	  
		  
		  return "";
		  
	  }
	
	  String writingForWhere(Vertex root){
		  String for_lit = "for ";
		  String where_lit = "where ";
		  String for_value = new String();
		  String where_value = " ";
		  ArrayList<String> ret_list = new ArrayList<String>();
		  ArrayList<Vertex> children = new ArrayList<Vertex>();
		  Stack<Vertex> stack = new Stack<Vertex>();
		  stack.push(root);
		  int count = 0;
		  while(!stack.isEmpty()){
			  //System.out.println("Inside stack" + root.a);
			  Vertex v = stack.pop();
			  if(g.ret_attr.contains(v.a))
				  ret_list.add(v.a);
			  children = g.getChildren(v);
			  if(v.aux == 0){
				  //System.out.println(v.a + " " + "in" + " " + v.parent.a + "/" + g.edges.get(v).weight + "\n");
				  
					  for_value=  for_value.concat(v.a + " " + "in" + " " + v.parent.a + "/" + g.edges.get(v).weight+","+"\n");
				  
			  }
				
			  else{
				  if(where_value==" " )
					 where_value = where_value.concat(v.parent.a + " " + "eq " + v.a);
				  else
					where_value =   where_value.concat("\n" + "and" +v.parent.a + " " + "eq " + v.a );
			  }	
			  count++;
			  if(!children.isEmpty())
			  for(int i= 0; i< children.size();i++){
				  stack.push(children.get(i));	  
			  }	  
			  
		  }
		  
		  String returning="";
		  if(where_value!=" ")
			  returning=returning.concat(for_lit + for_value.substring(0,for_value.length()-2) + "\n"+where_lit + where_value +"\nreturn\n"+writingForReturn(ret_list));
		  else
			  returning=returning.concat(for_lit + for_value.substring(0, for_value.length()-2) +"\nreturn\n"+writingForReturn(ret_list));
		  
		  
		  //System.out.println("Final answer is : \n"+returning);
		  
		  
		  return returning;
	  }
  
		  String writingForReturn(ArrayList<String> tag_elements){
			 int count=0; 
			 String return_string="<tuple>\n\t{";
			 
			for(int i=0;i<tag_elements.size();i++){
				String appender=tag_elements.get(i).substring(1, tag_elements.get(i).length());
				if (count==tag_elements.size()-1)
					return_string=return_string.concat("\t<"+ appender+"> { $"+ appender + " } </"+appender +">\n");
				else
					return_string=return_string.concat("\t<"+ appender+"> { $"+ appender + " } </"+appender +">,\n");
				count++;
			}
			return_string=return_string.concat("\t}\n</tuple>");
			return return_string;
			  
		  }
  
   
		 ArrayList<String> extractString(String returnstr){
			 System.out.println(returnstr+"entering.............");
			  ArrayList<String> templist=new ArrayList<String>();
			  String[] workstr;
			  workstr=returnstr.split(",");
			  for( int i=0;i<workstr.length;i++){
				  String[] wordset;
				  wordset=workstr[i].split(" ");
				  for(int j=0;j<wordset.length;j++){
					  if(wordset[j].startsWith("$")){
						  String[] req_elem;
						  req_elem=wordset[j].split("/");
						  templist.add(req_elem[0]);
						  System.out.println("extracted string "+req_elem[0]);
					  }
				  }
			  }
			  
			  return templist;	 	  
		     }
		 
		 String joinSubstring(String s1,String s2, String join_attr){
			 String s = "join ( \n";
			 s=s.concat(s1+",\n"+s2+",\n"+join_attr+"\n)");
			 return s;
				
			}
		 String getJoinattr(Vertex v1,Vertex v2){
			 String joiner="";
			 String v1list="";
			 String v2list="";
			 System.out.println("Aux edges.........." + g.aux_edges.size()+ v1.a+ v2.a);
			 for(Pair<Vertex,Vertex> hashpair : g.aux_edges){
				 	System.out.println(hashpair.a.a+hashpair.b.a);
				 	if((g.getRoot(hashpair.a).a.equals(v1.a) && g.getRoot(hashpair.b).a.equals(v2.a))){
				 		if (v1list.isEmpty()){
				 			v1list=hashpair.a.a.substring(1,hashpair.a.a.length());
				 		}
				 		else
				 			v1list=v1list.concat(","+ hashpair.a.a.substring(1,hashpair.a.a.length()));
				 		
				 		if (v2list.isEmpty()){
				 			v2list=hashpair.b.a.substring(1,hashpair.b.a.length());
				 		}
				 		else
				 			v2list=v2list.concat(","+ hashpair.b.a.substring(1,hashpair.b.a.length()));				 						 		
				 	}
				 	if(g.getRoot(hashpair.a).a.equals(v2.a) && g.getRoot(hashpair.b).a.equals(v1.a)){
				 		if (v1list.isEmpty()){
				 			v1list=hashpair.b.a.substring(1,hashpair.b.a.length());
				 		}
				 		else
				 			v1list=v1list.concat(","+ hashpair.b.a.substring(1,hashpair.b.a.length()));
				 		
				 		if (v2list.isEmpty()){
				 			v2list=hashpair.a.a.substring(1,hashpair.a.a.length());
				 		}
				 		else
				 			v2list=v2list.concat(","+ hashpair.a.a.substring(1,hashpair.a.a.length()));
				 		
				 	}
				 	
				}
			 if(!v1list.isEmpty() && !v2list.isEmpty())
			 joiner=joiner.concat("[ "+v1list+" ] , [ "+v2list+" ]");
			/* else
				for( Pair<Vertex,Vertex> hashpair : g.aux_edges){
					if(g.getRoot(hashpair.a).a.equals(v2.a) || g.getRoot(hashpair.b).a.equals(v2.a)){
						joiner=getJoinattr(g.getRoot(hashpair.a),g.getRoot(hashpair.b));
					}
				}*/
				 
		        
			 return joiner;
		 }

	
}
