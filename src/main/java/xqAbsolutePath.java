import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.*;
import org.xml.sax.SAXException;
public class xqAbsolutePath {

	public headerFile fName;
	public xqRelativePath rel_path;
	String sl;
	Stack<Node> s = new Stack<Node>();
	public  xqAbsolutePath(headerFile file,  xqRelativePath rp, String slash) {
		// TODO Auto-generated constructor stub
		
		 sl=slash;
		 fName = file;
		 rel_path = rp;
		
		
		
	}
	
	public void evalxqAbsolutePath(HashMap<Object, ArrayList<Node>> hmap){
		
		ArrayList<Node> nodes = new ArrayList<Node>();
		ArrayList<Node> returnnode = new ArrayList<Node>();
		ArrayList<Node> child = new ArrayList<Node>();
		NodeList childnodes = null;
		ArrayList<Node> curr_list = new ArrayList<Node>();
		Document newdoc = null;
		try {
			newdoc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new FileInputStream(fName.file));
		} 
		catch(Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        
        ArrayList<Node> root=new ArrayList<Node>();
        root.add(newdoc.getDocumentElement());
        if(sl.equals("/")){
        	//System.out.println("Inside Slash");
        	childnodes = root.get(0).getChildNodes();
        	//System.out.println(childnodes.toString());
        	for(int i =0 ; i<childnodes.getLength();i++){
        		
        		//System.out.println(childnodes.toString());
        		if(childnodes.item(i).getNodeName().toString()!= "#text" )
        			child.add(childnodes.item(i));
        	//	System.out.println("check3" + childnodes.item(i).getNodeName().toString());
        		
        	}
        
        	
		
        	for (int i =0 ; i<child.size();i++){
        		if (child.get(i).getNodeName().toString() != "#text")
        		{
        			//System.out.println(child.get(i).getNodeName().toString() + "childnode");
        			rel_path.evalxqRelativePath(child.get(i) , hmap);
        			   if(hmap.containsKey(rel_path))
        					returnnode = hmap.get(rel_path);
        			   for(int k=0 ; k<returnnode.size();k++) {
        				   curr_list.add(returnnode.get(k));
        			
        				   
        			   }
        			   /* 
        			    if(hmap.containsKey(this)) {
        			    	curr_list = hmap.get(this);
        			    	curr_list.addAll(returnnode);
        			    	hmap.put(this, curr_list);
        			    }*/
        			        
        			 							
        		}
        	}
        }
        else{
        	//System.out.println("The Size of root is"+ root.get(0));
        	s.push(root.get(0));
        	rel_path.evalxqRelativePath(root.get(0),hmap);
        	
        	while(!s.isEmpty()){
        		Node cur =  s.pop();
        		NodeList lj = cur.getChildNodes();
        		
        		ArrayList<Node> l=new ArrayList<Node>();
        		for(int i =0 ; i<lj.getLength();i++){
            		
            		l.add(lj.item(i));
            		
            	}
        		
        		for(int i=0; i< l.size();i++){
        			if (l.get(i).getNodeName() != "#text")
            		{
            			//System.out.println( "calling childnode");

        			rel_path.evalxqRelativePath(l.get(i),hmap);
        			s.push(l.get(i));
        			if(hmap.containsKey(rel_path))
    					returnnode = hmap.get(rel_path);
    			   for(int k=0 ; k<returnnode.size();k++) {
    				   curr_list.add(returnnode.get(k));
        			
            		}
        			
        	}
        		
			
				   
			   }
        		
        		
        		
        	}
 	
        }
       if(hmap.containsKey(rel_path))
		returnnode = hmap.get(rel_path);
		System.out.println(returnnode.size());
		hmap.put(this, curr_list);

	
	

	}}
