import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class xqRelativePath {
    
	public String tagname=new String();
	public String slash;
	public xqRelativePath left;
	public xqRelativePath right;
	public xqFilter filter;
	private Element e;

	public xqRelativePath(String t) {
		tagname = t;
		slash = null;
		left = right = null;
		System.out.println("Inside rp tag" + t);

		filter = null;
		
	}
	
	public xqRelativePath( xqRelativePath l, xqRelativePath r){
		
		left =l;
		right = r;
		tagname = null;
		slash = null;
		filter = null;
		
	}
	public xqRelativePath( xqRelativePath r){
		
		left =r;
		right = null;
		tagname = null;
		slash = null;
		filter = null;
		
	}
	public xqRelativePath( xqRelativePath l, String sl , xqRelativePath r ){
		
		left =l;
		right = r;
		
		tagname = null;
		slash = sl;
		filter = null;
		
	}
	
	public xqRelativePath( xqRelativePath l, xqFilter f  ){
		
		left =l;
		right = null;
		
		tagname = null;
		slash = null;
		filter = f;
		
	}
	
	
	
	
	

	public void evalxqRelativePath(Node node, HashMap<Object, ArrayList<Node>> hmap) {
		// TODO Auto-generated method stub
		System.out.println( "relative path");
		 Object obj =this;
		 Stack<Node> stack_rp = new Stack<Node>();
		 ArrayList<Node> children = new ArrayList<Node>();
		 ArrayList<Node> childrenright = new ArrayList<Node>();
	    	ArrayList<Node> ale = new ArrayList<Node>();

		
		ArrayList<Node> global_list = new ArrayList<Node>();
		if((this.tagname !=null )&& (this.tagname.startsWith("@"))){
         if(node.getNodeType() ==1 ){
          Element e = (org.w3c.dom.Element) node;
			if(e.hasAttribute(tagname)) {
					    	//ArrayList<Node> ale = new ArrayList<Node>();
					    	ale.add(node);
					    	hmap.put(this,ale);
					    }
			}
		}
		else if(node.getNodeName().equals(this.tagname))
		{
		obj=this;
		System.out.println("Entering tagname");
	    	ale.add(node);
	    	hmap.put(this,ale);
		}
		
	
		else if((this.tagname!=null) && (this.tagname.equals("*"))) {
			
				//ArrayList<Node> ale = new ArrayList<Node>();
		    	ale.add(node);
		    	hmap.put(this,ale);
			
		}
		else if((this.tagname!=null) && (this.tagname.equals(".")))
		{
			
				System.out.println("Entering for .");
				//ArrayList<Node> ale = new ArrayList<Node>();
		    	ale.add(node);
		    	hmap.put(this,ale);
		}
		else if((this.tagname!=null) && (this.tagname.equals(".."))){
			obj=this;
			//	ArrayList<Node> ale = new ArrayList<Node>();
		    	ale.add(node.getParentNode());
		    	hmap.put(obj,ale);
			}
			
		else if((this.slash!=null)&& (this.slash.equals("/"))){
			
			System.out.println("Enter rp slash");
			this.left.evalxqRelativePath(node, hmap);
			
			 children = (ArrayList<Node>)hmap.get(this.left);
		//	System.out.println(children.size() + "SIZE OF");
			for(int i=0 ; i<children.size(); i++)
			{
			//	System.out.println("Iteration"+ i);
				NodeList childofchild = children.get(i).getChildNodes();
				//System.out.println(childofchild.getLength() + "sss");
				for(int j=0; j<childofchild.getLength(); j++)
				{
					if(childofchild.item(j).getNodeName().contains("#text")) continue;
					//System.out.println();
					System.out.println("latest check" + childofchild.item(j).getNodeName() + " ");
							System.out.println( childofchild.item(j).getTextContent() + "Sucks");
					this.right.evalxqRelativePath(childofchild.item(j), hmap);
					childrenright = hmap.get(this.right);
					
					if(childrenright != null)
					{
						//System.out.println(childrenright.size()+ "right size");
						for(int k =0 ;k<childrenright.size();k++)
						{
							global_list.add(childrenright.get(k));
							//System.out.println("Check size " + global_list.size());
						}
					}	
				}	
			}
			obj=this;
			//System.out.println("Globallistsize" + global_list.size());
			hmap.put(obj, global_list);
			
		}
		
		else if((this.slash!=null) && (this.slash.equals("//"))) {
			Node curr_node = null;
			//ArrayList<Element> curr_node_children;
			System.out.println("Inside double slash");
			NodeList c;
			System.out.println(this.left.tagname + "  TAGNAME");
			this.left.evalxqRelativePath(node, hmap);
			children =  hmap.get(this.left);
			System.out.println(children.size());
			for(int i=0; i< children.size();i++)
			stack_rp.push(children.get(i));
			
			while (!stack_rp.isEmpty()) {
				 curr_node =  stack_rp.pop();
				 this.right.evalxqRelativePath(curr_node, hmap);
				 c = curr_node.getChildNodes();
				 childrenright = hmap.get(this.right);
					for(int j=0;j<childrenright.size();j++)
					{
						global_list.add(childrenright.get(j));
					}
				 for(int i =0; i< c.getLength();i++) {
					 if(!c.item(i).getNodeName().contains("#text"))
					 stack_rp.push(c.item(i));	 		 
				 }
			}
			
			hmap.put(this, global_list);
		
		}
		else if(this.filter != null){
			
			this.filter.evalFilter(node,hmap);	
			
			}
		else if((this.tagname!=null) && (this.tagname.equals(","))){
			this.left.evalxqRelativePath(node, hmap);
			ArrayList<Node> left_children= hmap.get(this.left);
			
			this.right.evalxqRelativePath(node, hmap);
			ArrayList<Node> right_children= hmap.get(this.right);
			
		//	left_children.
			ArrayList<Node> result= new ArrayList<Node>();
			
			result.addAll(left_children);
			result.addAll(right_children);
			hmap.put(this, result);	
			
		}
		
		else if(node.getNodeType()==3) {
			
			if(node.getTextContent().equals(tagname)){
				
				
				//	ArrayList<Node> ale = new ArrayList<Node>();
			    	ale.add(node);
			    	hmap.put(this,ale);
				
				System.out.println("fgbhnjdmxkw,");
				
			}			
			
		}
		
		
		else{
			//ArrayList<Node> ale = new ArrayList<Node>();
	    	hmap.put(this,ale);			
			
		}
		
	}
	
	
	
}
