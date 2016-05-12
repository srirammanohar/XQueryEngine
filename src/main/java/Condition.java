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
		else if((xql!=null) && (xqr != null) && op.equals("eq")  ) {
			
			this.xql.evaluatexqQuery(node, hmap);
			ArrayList<Node> ret_list = new ArrayList<Node>();
			ret_list = hmap.get(this.xql);
			this.xqr.evaluatexqQuery(node, hmap);
			ArrayList<Node> ret_right = new ArrayList<Node>();
			ret_right = hmap.get(this.xqr); 
			System.out.println(ret_right.size() + " " + ret_list.size());
			if(ret_right.size()!= ret_list.size()) return false;
			else {
				
				for(int i =0 ; i<ret_list.size() ; i++ ){
					
					if(! ret_list.get(i).isEqualNode(ret_right.get(i))) {
						return false;}
					
				}
					
			}
			return true;
		
		
		}
		else if((xql!=null) && (xqr != null) && op.equals("is") ) {
			
			this.xql.evaluatexqQuery(node, hmap);
			ArrayList<Node> ret_list = new ArrayList<Node>();
			ret_list = hmap.get(this.xql);
			this.xqr.evaluatexqQuery(node, hmap);
			ArrayList<Node> ret_right = new ArrayList<Node>();
			ret_right = hmap.get(this.xqr); 
			System.out.println(ret_right.size() + " " + ret_list.size());
			if(ret_right.size()!= ret_list.size()) return false;
			else {
				
				for(int i =0 ; i<ret_list.size() ; i++ ){
					
					if(! ret_list.get(i).isSameNode(ret_right.get(i))) {
						return false;}
					
				}
					
			}
			return true;
		}
		
		
		
		return false;
		
	}
	
	
}
