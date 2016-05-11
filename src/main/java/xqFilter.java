import java.util.ArrayList;
import java.util.HashMap;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class xqFilter {
	
	xqRelativePath left;
	xqRelativePath right;
	xqFilter      left_filter;
	xqFilter      right_filter;
	String expr= new String();

	public xqFilter(xqRelativePath left_rp) {
		// TODO Auto-generated constructor stub
		left = left_rp;
		right = null;
		left_filter = null;
		right_filter = null;
		expr = "";
		System.out.println("Inside filter rp constructor "+left.tagname);
		
	}
	
	public xqFilter(xqRelativePath left_rp,xqRelativePath right_rp , String str) {
		// TODO Auto-generated constructor stub
		
		left = left_rp;
		right = right_rp;
		left_filter = null;
		right_filter = null;
		expr = str;
		
		
		
	}
	public xqFilter(xqFilter leftfilter,xqFilter rightfilter, String str ) {
		// TODO Auto-generated constructor stub
		
		left = null;
		right = null;
		left_filter = leftfilter;
		right_filter = rightfilter;
		expr = str;
		
		
		
	}
	public xqFilter(xqFilter leftfilter ) {
		// TODO Auto-generated constructor stub
		
		left = null;
		right = null;
		left_filter = leftfilter;
		right_filter = null;
		expr = "";
		
		
	}
	public xqFilter(xqFilter leftfilter, String expression ) {
		// TODO Auto-generated constructor stub
		
		left = null;
		right = null;
		left_filter = leftfilter;
		right_filter = null;
		expr = expression;
		
		
	}
	
	public boolean compare(Node a, Node b) {
		if(( a == null) && ( b == null)) return true;
		if((a != null) && (b == null)) return false;
		if((a==null) && (b != null)) return false;
		else{
			
			if(!a.getNodeValue().equals(b.getNodeValue())) return false;
			if(!a.getTextContent().equals(b.getTextContent()))return false;
			if(a.getChildNodes().getLength()!=b.getChildNodes().getLength()) return false;
			NodeList leftlist = a.getChildNodes();
			NodeList rightlist = b.getChildNodes();
			//for()
			
			
			
			
			
			
			
		}
		
		
		
		return false;
		
		
		
		
		
		
		
	}

	public boolean evalFilter(Node node,HashMap<Object, ArrayList<Node>> hmap) {
		// TODO Auto-generated method stub
		ArrayList<Node> return_list = new ArrayList<Node>();
		ArrayList<Node> global_list = new ArrayList<Node>();
		ArrayList<Node> filter_list_left = new ArrayList<Node>();
		ArrayList<Node> filter_list_right = new ArrayList<Node>();

		
		
		Object obj;
		
		if(this.expr.equals("") && (this.left!=null) && (this.right==null)&& (this.left_filter == null) && (this.right_filter == null)) {
			
			NodeList x = node.getChildNodes();
			for(int i=0; i< x.getLength();i++){
				this.left.evalxqRelativePath(x.item(i), hmap);
				 return_list = hmap.get(this.left);
				 if(return_list.size() >0) { 
					 return true;
					 
				   
				 }}
			return false;
				 
			}
		else if ((this.expr.equals("=") || this.expr.equals("eq") ) && (this.left!=null) && (this.right!=null)){	
		
		NodeList x = node.getChildNodes();
		int iter;
		for(int i=0; i< x.getLength();i++){
		
				this.left.evalxqRelativePath(x.item(i), hmap);
				 filter_list_left.addAll(hmap.get(this.left)) ;
				 this.right.evalxqRelativePath(x.item(i), hmap);
				 filter_list_right.addAll(hmap.get(this.right));
				 }

        if(filter_list_left.size() != filter_list_right.size()) return false;
         iter = filter_list_left.size();
			    for(int j=0; j< iter  ; j++){
			    	 
			    	 System.out.println("INSIDE THE LOOP");
			    	 if(!filter_list_left.get(j).isEqualNode(filter_list_right.get(j)) && filter_list_right.get(j)!=null){
			    		//if(!filter_list_left.get(j).getTextContent().toString().equals(filter_list_right.get(j).getTextContent().toString())){ 
			    		 return false;   	
			    	 }
			     }
			    return true;						
		}
		else if ((this.expr.equals("==") || this.expr.equals("is") ) && (this.left!=null) && (this.right!=null)){	
			
			NodeList x = node.getChildNodes();
			int iter;
			for(int i=0; i< x.getLength();i++){
			
					this.left.evalxqRelativePath(x.item(i), hmap);
					 filter_list_left.addAll(hmap.get(this.left)) ;
					 this.right.evalxqRelativePath(x.item(i), hmap);
					 filter_list_right.addAll(hmap.get(this.right));
					 }

	        if(filter_list_left.size() != filter_list_right.size()) return false;
	         iter = filter_list_left.size();
				    for(int j=0; j< iter  ; j++){
				    	 
				    	 System.out.println("INSIDE THE LOOP");
				    	 if(!filter_list_left.get(j).isSameNode(filter_list_right.get(j)) && filter_list_right.get(j)!=null){
				    		//if(!filter_list_left.get(j).getTextContent().toString().equals(filter_list_right.get(j).getTextContent().toString())){ 
				    		 return false;   	
				    	 }
				     }
				    return true;						
			}
			
		
		else if(this.expr.equals("and")  && (this.left_filter!=null) && (this.right_filter!=null))
		{
		   boolean flag_left = this.left_filter.evalFilter(node, hmap);
		   boolean flag_right = this.right_filter.evalFilter(node, hmap);
		  return flag_left && flag_right;
			
		}
		else if(this.expr.equals("or")  && (this.left_filter!=null) && (this.right_filter!=null))
		{
		   boolean flag_left = this.left_filter.evalFilter(node, hmap);
		   boolean flag_right = this.right_filter.evalFilter(node, hmap);
		  return flag_left || flag_right;
			
		}
		else if(this.expr.equals("not")  && (this.left_filter!=null) )
		{
		    return !this.left_filter.evalFilter(node, hmap);
		  
			
		}


		/*
		if(this.expr.equals("") && (this.left!=null) && (this.right==null)&& (this.left_filter == null) && (this.right_filter == null)) {
			
			this.left.evalxqRelativePath(node, hmap);		
			return_list = hmap.get(this.left);
			System.out.println(this.left.tagname + "Inside eval filter");
			Object var = this;
			if(return_list.size()!=0){
				System.out.println("Return list is null" + return_list.size() );
				return true;
			}
			else 
			{
				System.out.println("Return list is not null" + node.getNodeValue());
				return false;
			}
		}	
		
		else if ((this.expr.equals("=") || this.expr.equals("eq") ) && (this.left!=null) && (this.right!=null)){
			     System.out.println("Inside eq");
				 this.left.evalxqRelativePath(node, hmap);
				 filter_list_left = hmap.get(this.left);
				 System.out.println("Left list size" + filter_list_left.size());
				 this.right.evalxqRelativePath(node, hmap);
				 filter_list_right = hmap.get(this.right);
				 System.out.println("Right size" + filter_list_right.size());
				 if(filter_list_left.size() != filter_list_right.size()) return false;
				 for(int i =0; i< filter_list_left.size();i++)
				 {
					 
					 if(!filter_list_left.get(i).isEqualNode(filter_list_right.get(i))) return false;
					 
				 }
				 return true;
				 
				 
			 }*/
		
		return true;
		}
		
		
	}
	


