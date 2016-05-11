import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Condition {
public xqQuery xql;
public xqQuery xqr;
public String op;
public List<String> varlist;
public String var;
public List<xqQuery> xqQuerylist;
public Condition condleft;
public Condition condright;


	public Condition() {
		// TODO Auto-generated constructor stub
	}


	public Condition(xqQuery xql1, xqQuery xqr2, String oper) {
		
		xql=xql1;
		xqr=xqr2;
		op=oper;
		varlist=new ArrayList<String>();
		var="";
		xqQuerylist=new ArrayList<xqQuery>();
		condleft=null;
		condright=null;
	}


	public Condition(xqQuery xql2, String oper) {
		
		xql=xql2;
		op=oper;
		xqr=null;
		varlist=new ArrayList<String>();
		var="";
		xqQuerylist=new ArrayList<xqQuery>();
		condleft=null;
		condright=null;
		
	}


	public Condition(Condition c1, String str) {
		condleft=c1;
		op=str;
		xqr=null;
		xql=null;
		varlist=new ArrayList<String>();
		var="";
		xqQuerylist=new ArrayList<xqQuery>();
		condright=null;
		
	}


	public Condition(Condition c1, Condition c2, String str) {
		condleft=c1;
		condright=c2;
		op=str;
		xqr=null;
		xql=null;
		varlist=new ArrayList<String>();
		var="";
		xqQuerylist=new ArrayList<xqQuery>();
		
	}


	public Condition(List<xqQuery> lxq, List<String> variable_list, Condition c, String st) {
		
		// TODO Auto-generated constructor stub
		condleft=c;
		condright=null;
		op=st;
		xqr=null;
		xql=null;
		//varlist=new ArrayList<String>();
		varlist = variable_list;
		var="";
		//xqQuerylist=new ArrayList<xqQuery>();
		xqQuerylist = lxq;
		
		
		
	}

	boolean evalCondition(Node node, HashMap<Object, ArrayList<Node>> hmap) {
		
		ArrayList<Node> return_list = new ArrayList<Node>();
		ArrayList<Node>  filter_list_left = new ArrayList<Node>();
		ArrayList<Node> filter_list_right = new ArrayList<Node>();
		
		
		
		if(op.equals("()") &&  condleft !=null && condright == null){
			
			return condleft.evalCondition(node, hmap);		
		}
		
		else if(op.equals("not") &&  condleft !=null && condright == null) {
			
			return !condleft.evalCondition(node, hmap);		
	
		}
		
		else if(op.equals("or") &&  condleft !=null && condright != null) {
			
			return (condleft.evalCondition(node, hmap) || condright.evalCondition(node, hmap)) ;		
	
		}
		else if(op.equals("and") &&  condleft !=null && condright != null) {
			
			return (condleft.evalCondition(node, hmap) && condright.evalCondition(node, hmap)) ;		
	
		}
		
		else if(op.equals("empty") &&  xql !=null ) {
			
			this.xql.evaluatexqQuery(node, hmap);		
			return_list = hmap.get(this.xql);
			return return_list.isEmpty();
	
		}
		else if((xql!=null) && (xqr != null) && op.equals("eq") ) {
			NodeList x = node.getChildNodes();
			int iter;
			for(int i=0; i< x.getLength();i++){
			
					this.xql.evaluatexqQuery(x.item(i), hmap);
					 filter_list_left.addAll(hmap.get(this.xql)) ;
					 this.xqr.evaluatexqQuery(x.item(i), hmap);
					 filter_list_right.addAll(hmap.get(this.xqr));
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
		else if((xql!=null) && (xqr != null) && op.equals("is") ) {
			
			NodeList x = node.getChildNodes();
			int iter;
			for(int i=0; i< x.getLength();i++){
			
					this.xql.evaluatexqQuery(x.item(i), hmap);
					 filter_list_left.addAll(hmap.get(this.xql)) ;
					 this.xqr.evaluatexqQuery(x.item(i), hmap);
					 filter_list_right.addAll(hmap.get(this.xqr));
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
		
		
		
		return false;
		
	}
	
	
}
