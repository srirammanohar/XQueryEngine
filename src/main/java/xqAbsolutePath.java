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
	
	public boolean ignore_textnode(Node node)
	{
		return (node.getNodeType()==Node.TEXT_NODE && 
				(node.getNodeValue().toString().contains("\n") ||
				node.getNodeValue().toString().contains("\t")||
				node.getNodeValue().toString().contains("\r")));
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
			e.printStackTrace();
		} 
        
        ArrayList<Node> root=new ArrayList<Node>();
        root.add(newdoc.getDocumentElement());
        if(sl.equals("/")){
        	childnodes = root.get(0).getChildNodes();
        	for(int i =0 ; i<childnodes.getLength();i++){
        		if(!ignore_textnode(childnodes.item(i)))
        			child.add(childnodes.item(i));        		
        	}
        		
        	for (int i =0 ; i<child.size();i++){
        		//if (child.get(i).getNodeName().toString() != "#text")
        		if(!ignore_textnode(child.get(i)))
        		{
        			rel_path.evalxqRelativePath(child.get(i) , hmap);
        			   if(hmap.containsKey(rel_path))
        					returnnode = hmap.get(rel_path);
        			   for(int k=0 ; k<returnnode.size();k++) {
        				   if(!ignore_textnode(returnnode.get(k)))
        				   curr_list.add(returnnode.get(k));
        			        				   
        			   }  
        			   //System.out.println("Size inside loop is " + curr_list.size());
        		}
        	}
        }
        else{
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
        			//if (l.get(i).getNodeName() != "#text")
        			if(!ignore_textnode(l.get(i)))
            		{
        			rel_path.evalxqRelativePath(l.get(i),hmap);
        			s.push(l.get(i));
        			if(hmap.containsKey(rel_path))
    					returnnode = hmap.get(rel_path);
        			for(int k=0 ; k<returnnode.size();k++) {
        			if(!ignore_textnode(returnnode.get(k)))
    				   curr_list.add(returnnode.get(k));       			
            		}      			
            		}			
				   
			   }       		
        		
        	}
 	
        }
       if(hmap.containsKey(rel_path))
		returnnode = hmap.get(rel_path);
		//System.out.println("Size returned from ab path is"+curr_list.size()+""+curr_list);
		
		ArrayList<Node> new_list=new ArrayList<Node>();
		Util util=new Util();
		new_list= util.remove_duplicates(curr_list);
		//System.out.println("Size returned from ab path is"+new_list.size()+""+new_list);
		hmap.put(this, new_list);
	
	

	}}
