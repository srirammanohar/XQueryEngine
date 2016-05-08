import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class xqRelativePath {
    public Stack<Node> stack_rp;
	public String tagname;
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
		//System.out.println("Inside Relative PAth" + node.getNodeName().toString());
		if(this.tagname.startsWith("@")){
         if(node.getNodeType() ==1 ){
          Element e = (org.w3c.dom.Element) node;
			if(e.hasAttribute(tagname)) {
				  if(hmap.get(this)!=null) {
						ArrayList<Node> ale = hmap.get(this);
						ale.add(node);
						hmap.put(this,ale );}
					    else{
					    	ArrayList<Node> ale = new ArrayList<Node>();
					    	ale.add(node);
					    	hmap.put(this,ale);
					    }
			}
		}}
		else if(node.getNodeName().toString().equals(this.tagname))
		{
	    if(hmap.get(this)!=null) {
		ArrayList<Node> ale = hmap.get(this);
		ale.add(node);
		hmap.put(this,ale );}
	    
	    else{
	    	ArrayList<Node> ale = new ArrayList<Node>();
	    	ale.add(node);
	    	hmap.put(this,ale);
	    }
	    
	   
		System.out.println(tagname + "is tagname");
		System.out.println(node.getNodeName().toString() + "getTextContent");
		}
		
	
		else if(this.tagname.equals("*")) {
			if(hmap.get(this)!=null){
				ArrayList<Node> arr=new ArrayList<Node>();
				arr.add(node);
				hmap.put(this, arr);
			}
			else{
				ArrayList<Node> ale = new ArrayList<Node>();
		    	ale.add(node);
		    	hmap.put(this,ale);
			}
		}
		else if(this.tagname.equals(".")){
			if(hmap.get(this)!=null){
				ArrayList<Node> arr=new ArrayList<Node>();
				arr.add(node);
				hmap.put(this, arr);
			}
			else{
				ArrayList<Node> ale = new ArrayList<Node>();
		    	ale.add(node);
		    	hmap.put(this,ale);
			}
		}
		else if(this.tagname.equals("..")){
			if(hmap.get(this)!=null){
				ArrayList<Node> arr=new ArrayList<Node>();
				arr.add(node.getParentNode());
				hmap.put(this, arr);
			}
			else{
				ArrayList<Node> ale = new ArrayList<Node>();
		    	ale.add(node.getParentNode());
		    	hmap.put(this,ale);
			}
			
		}
		else if(this.tagname.equals("/")){
			
			this.left.evalxqRelativePath(node, hmap);
			ArrayList<Node> children =  hmap.get(this.left);
			for(int i=0 ; i<children.size(); i++) {
				
				this.right.evalxqRelativePath(children.get(i), hmap);
				
			}			
			
		}
		
		else if(this.tagname.equals("\\")) {
			Node curr_node = null;
			//ArrayList<Element> curr_node_children;
			NodeList c;
			
			this.left.evalxqRelativePath(node, hmap);
			ArrayList<Node> children =  hmap.get(this.left);
			for(int i=0; i< children.size();i++)
			stack_rp.push(children.get(i));
			
			while (!stack_rp.isEmpty()) {
				 curr_node =  stack_rp.pop();
				 this.right.evalxqRelativePath(curr_node, hmap);
				 c = curr_node.getChildNodes();
				
				 for(int i =0; i< c.getLength();i++) {
					 stack_rp.push((Element)c.item(i));	 		 
				 }
			}
		
		}
		else if(this.filter != null){
			
			this.filter.evalFilter(node,hmap);	
			
			}
		else if(this.tagname.equals(",")){
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
				
				if(hmap.get(this)!=null){
					ArrayList<Node> arr=new ArrayList<Node>();
					arr.add(node);
					hmap.put(this, arr);
				}
				else{
					ArrayList<Node> ale = new ArrayList<Node>();
			    	ale.add(node);
			    	hmap.put(this,ale);
				}
				System.out.println("fgbhnjdmxkw,");
				
			}
				
			
			
			
			
		}
		
	}
	
	
	
}
