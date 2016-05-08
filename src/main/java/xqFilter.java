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
		expr = null;
		
		
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

	public void evalFilter(Node node,HashMap<Object, ArrayList<Node>> hmap) {
		// TODO Auto-generated method stub
		ArrayList<Node> return_list = new ArrayList<Node>();
		ArrayList<Node> global_list = new ArrayList<Node>();
		ArrayList<Node> filter_list_left = new ArrayList<Node>();
		ArrayList<Node> filter_list_right = new ArrayList<Node>();

		
		
		Object obj;

		
		if(this.expr.equals("") && (this.left!=null) && (this.right==null)&& (this.left_filter == null) && (this.right_filter == null)) {
			
			this.left.evalxqRelativePath(node, hmap);		
			return_list = hmap.get(this.left);
			
			Object var = this;
			if(return_list!= null)
			hmap.put(var, return_list);
			
			
			
		
		}	
		
		else if (this.expr.equals("=") || (this.expr.equals("eq"))){
			System.out.println("Inside filter equal evaluation");
			 this.left.evalxqRelativePath(node, hmap);
			 filter_list_left = hmap.get(this.left);
			 this.right.evalxqRelativePath(node, hmap);
			 filter_list_right = hmap.get(this.right);
			 for (int i=0; i<filter_list_left.size(); i++){
				 
				 for(int j=0;j<filter_list_right.size();j++){
					 
					 
					 
				 }
				 
				 
				 
				 
				 
			 }
			
			
		}
		
		
	}
	

}
