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
		//System.out.println("Inside rp tag constructor" + t);

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
	
	
	public boolean ignore_textnode(Node node)
	{
		return (node.getNodeType()==Node.TEXT_NODE && 
				(node.getNodeValue().toString().contains("\n") ||
				node.getNodeValue().toString().contains("\t")||
				node.getNodeValue().toString().contains("\r")));
	}
	
	

	public void evalxqRelativePath(Node node, HashMap<Object, ArrayList<Node>> hmap) {
		// TODO Auto-generated method stub
		//System.out.println( "relative path evaluation main");
		//System.out.println("String in this rp is " + this.slash);
		//System.out.println("tagname in this rp is " + this.tagname);
		 Object obj =this;
		 Stack<Node> stack_rp = new Stack<Node>();
		 ArrayList<Node> children = new ArrayList<Node>();
		 ArrayList<Node> childrenright = new ArrayList<Node>();
	     ArrayList<Node> ale = new ArrayList<Node>();
	     ArrayList<Node> global_list = new ArrayList<Node>();
	     ArrayList<Node> gb_list = new ArrayList<Node>();

		
		if((this.tagname !=null )&& (this.tagname.startsWith("@"))){
			obj=this;
			System.out.println("Inside attribute evaluation");  
	       // Element e = (org.w3c.dom.Element) node;
			if(node.hasAttributes() )
	        if(node.getAttributes().getNamedItem(this.tagname.substring(1, this.tagname.length()))!=null){
			//if(e.hasAttribute(this.tagname.substring(1, this.tagname.length()))) {
				System.out.println("Inside attribute tagname evaluation");
				ale.add(node);
			}
			 hmap.put(obj,ale);
		}
		
		else if(node.getNodeName().equals(this.tagname))
		{
			obj=this;
			System.out.println("Inside tagname");
	    	ale.add(node);
	    	hmap.put(this,ale);
		}	
		else if((this.tagname!=null)&& (this.tagname.equals("text()"))){
			if (node.getNodeType()==Node.TEXT_NODE && (!ignore_textnode(node))){
				System.out.println("Inside text()");
				ale.add(node);}
			obj=this;
			hmap.put(obj, ale);
			
			
		}
	
		else if((this.tagname!=null) && (this.tagname.equals("*"))) {
				obj=this;
				System.out.println("Inside star evaluation");
				//ArrayList<Node> ale = new ArrayList<Node>();
		    	ale.add(node);
		    	hmap.put(obj,ale);
			
		}
		else if((this.tagname!=null) && (this.tagname.equals(".")))
		{
				obj=this;
				System.out.println("Entering for .");
				//ArrayList<Node> ale = new ArrayList<Node>();
		    	ale.add(node);
		    	hmap.put(obj,ale);
		}
		else if((this.tagname!=null) && (this.tagname.equals(".."))){
			obj=this;
			System.out.println("Inside .. evaluation");
			//	ArrayList<Node> ale = new ArrayList<Node>();
		    	ale.add(node.getParentNode());
		    	hmap.put(obj,ale);
			}
			
		else if((this.slash!=null)&& (this.slash.equals("/"))){
			
			System.out.println("Inside rp slash");
			this.left.evalxqRelativePath(node, hmap);
			
			 children = (ArrayList<Node>)hmap.get(this.left);
			System.out.println(children.size() + "SIZE OF");
			for(int i=0 ; i<children.size(); i++)
			{
				NodeList childofchild = children.get(i).getChildNodes();	
				for(int j=0; j<childofchild.getLength(); j++)
				{
					//if(childofchild.item(j).getNodeName().contains("#text")) continue;
				   if(ignore_textnode(childofchild.item(j))) continue;
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
			System.out.println("Inside double slash evaluation");
			//ArrayList<Element> curr_node_children;
			//System.out.println("Inside double slash");
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
					// if(!c.item(i).getNodeName().contains("#text"))
					if(!ignore_textnode(c.item(i)))
					 
					 stack_rp.push(c.item(i));	 		 
				 }
			}
			
			hmap.put(this, global_list);
		
		}
	/*	else if(this.filter != null && false){

			this.left.evalxqRelativePath(node, hmap);
			
			children=hmap.get(this.left);
			ale.clear();
			
			for(int i=0; i<children.size();i++){
				boolean flag = true;
				NodeList leftchildren = children.get(i).getChildNodes();
				for(int j=0;j<leftchildren.getLength();j++)
				{
					
				    flag =  this.filter.evalFilter(leftchildren.item(j), hmap);
					//if(hmap.containsKey(this.filter)){
					//gb_list = hmap.get(this.filter);
					// if(flag) {
				    //ale.add(children.get(i));
					//	break;
					
					}
					//}
					  
					 
					if(flag) break;
				    
				}
				
			if(flag == true) ale.add(children.get(i));
			}
			 hmap.put(this,ale);
			
		
			
			}
		*/
		else if(this.filter != null) {
			boolean flag;
			this.left.evalxqRelativePath(node, hmap);
			children = hmap.get(this.left);
			for(int i=0 ; i< children.size(); i++){
				flag = this.filter.evalFilter(children.get(i), hmap);
				if(flag) {
					ale.add(children.get(i));
				}
				
		
			}
			hmap.put(this,ale);		
		}
		
		else if((this.slash!=null) && (this.slash.equals(","))){
			System.out.println("Inside comma evaluation");
			this.left.evalxqRelativePath(node, hmap);
			ArrayList<Node> left_children= hmap.get(this.left);
			this.right.evalxqRelativePath(node, hmap);
			ArrayList<Node> right_children= hmap.get(this.right);
			ArrayList<Node> result= new ArrayList<Node>();
			
			result.addAll(left_children);
			result.addAll(right_children);
			hmap.put(this, result);	
			
		}
				
		
		
		else{
			//ArrayList<Node> ale = new ArrayList<Node>();
	    	hmap.put(this,ale);			
			
		}
		
	}
	
	
	
}
