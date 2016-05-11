import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class xqQuery {
public  xqVariable var;
public String str_constant;
public   xqQuery xql;
public   xqQuery xqr;
public xqAbsolutePath xap;
public xqRelativePath xqrpl;
public xqForClause  xqfor;
public xqWhereClause xqwhere;
public xqLetClause xqlet;
public xqReturnClause xqret;
public String left;
public String right;
public xqQueryPath xqxp;
public String operand;


	
	public xqQuery( String str) {
		// TODO Auto-generated constructor stub
		this.var = null;
		str_constant = str;
		xql = null;
		xqr = null;
		xap = null;
		xqrpl = null;
		
		xqfor = null;
		xqwhere = null;
		xqlet = null;
		xqret = null;
		left = null;
		right =null;
		xqxp = null;
		operand = null;
		}
	
	public xqQuery( xqVariable v) {
		this.operand = null;
		this.var = v;
		xql = null;
		xqr = null;
		xap = null;
		xqrpl = null;
		
		xqfor = null;
		xqwhere = null;
		xqlet = null;
		xqret = null;
		left = null;
		right =null;
		xqxp = null;
		str_constant = null;
		}
	
	public xqQuery(xqAbsolutePath xapath ) {
		this.var = null;
		this.str_constant = null;
		xql = null;
		xqr = null;
		xap = xapath;
		xqrpl = null;
		
		xqfor = null;
		xqwhere = null;
		xqlet = null;
		xqret = null;
		left = null;
		right =null;
		xqxp = null;
		operand = null;
		}
	public xqQuery(xqQuery xquery, String oper ) {
		this.var = null;
		this.str_constant = null;
		xql = xquery;
		xqr = null;
		xap =  null;
		xqrpl = null;
		
		xqfor = null;
		xqwhere = null;
		xqlet = null;
		xqret = null;
		left = null;
		right =null;
		xqxp = null;
		operand = oper;
		}
	public xqQuery(xqQuery xquery, String oper , xqQuery rgt ) {
		this.var = null;
		this.str_constant = null;
		xql = xquery;
		xqr = rgt;
		xap =  null;
		xqrpl = null;
		
		xqfor = null;
		xqwhere = null;
		xqlet = null;
		xqret = null;
		left = null;
		right =null;
		xqxp = null;
		operand = oper;
		}

	public xqQuery(String string, xqQuery xqap) {
		// TODO Auto-generated constructor stub
		this.var = null;
		this.str_constant = null;
		xql = xqap;
		xqr = null;
		xap =  null;
		xqrpl = null;
		
		xqfor = null;
		xqwhere = null;
		xqlet = null;
		xqret = null;
		left = null;
		right =null;
		xqxp = null;
		operand = string;
	}

	public xqQuery(xqQuery left2, xqQuery right2) {
		// TODO Auto-generated constructor stub
		this.var = null;
		this.str_constant = null;
		xql = left2;
		xqr = right2;
		xap =  null;
		xqrpl = null;
		
		xqfor = null;
		xqwhere = null;
		xqlet = null;
		xqret = null;
		left = null;
		right =null;
		xqxp = null;
		operand = null;
		
	}

	public xqQuery(xqQuery xqap, String operand2, xqRelativePath xrp) {
		// TODO Auto-generated constructor stub
		this.var = null;
		this.str_constant = null;
		xql = xqap;
		xqr = null;
		xap =  null;
		xqrpl = xrp;
		
		xqfor = null;
		xqwhere = null;
		xqlet = null;
		xqret = null;
		left = null;
		right =null;
		xqxp = null;
		operand = operand2;	
		
	}

	public xqQuery(xqForClause xqfc, xqReturnClause xqrc) {
		// TODO Auto-generated constructor stub
		this.var = null;
		this.str_constant = null;
		xql = null;
		xqr = null;
		xap =  null;
		xqrpl = null;
		
		xqfor = xqfc;
		xqwhere = null;
		xqlet = null;
		xqret = xqrc;
		left = null;
		right =null;
		xqxp = null;
		operand = null;
		
		
	}

	public xqQuery(xqForClause xqfc, xqWhereClause xqwc, xqReturnClause xqrc) {
		// TODO Auto-generated constructor stub
		this.var = null;
		this.str_constant = null;
		xql = null;
		xqr = null;
		xap =  null;
		xqrpl = null;
		
		xqfor = xqfc;
		xqwhere = xqwc;
		xqlet = null;
		xqret = xqrc;
		left = null;
		right =null;
		xqxp = null;
		operand = null;
	}

	public xqQuery(xqForClause xqfc, xqLetClause xqlc, xqReturnClause xqrc) {
		// TODO Auto-generated constructor stub
		this.var = null;
		this.str_constant = null;
		xql = null;
		xqr = null;
		xap =  null;
		xqrpl = null;
		
		xqfor = xqfc;
		xqwhere = null;
		xqlet = xqlc;
		xqret = xqrc;
		left = null;
		right =null;
		xqxp = null;
		operand = null;
	}

	public xqQuery(xqForClause xqfc, xqWhereClause xqwc, xqLetClause xqlc, xqReturnClause xqrc) {
		// TODO Auto-generated constructor stub
		this.var = null;
		this.str_constant = null;
		xql = null;
		xqr = null;
		xap =  null;
		xqrpl = null;
		
		xqfor = xqfc;
		xqwhere = xqwc;
		xqlet = xqlc;
		xqret = xqrc;
		left = null;
		right =null;
		xqxp = null;
		operand = null;
		
	}

	public xqQuery(xqLetClause let, xqQuery xq) {
		// TODO Auto-generated constructor stub
		this.var = null;
		this.str_constant = null;
		xql = xq;
		xqr = null;
		xap =  null;
		xqrpl = null;
		
		xqfor = null;
		xqwhere = null;
		xqlet = let;
		xqret = null;
		left = null;
		right =null;
		xqxp = null;
		operand = null;
	}

	public xqQuery(String string, String left2, String right2, xqQuery xqap) {
		
		this.var = null;
		this.str_constant = string;
		xql = xqap;
		xqr = null;
		xap =  null;
		xqrpl = null;
		
		xqfor = null;
		xqwhere = null;
		xqlet = null;
		xqret = null;
		left = left2;
		right =right2;
		xqxp = null;
		operand = null;
		
		
		
		
		// TODO Auto-generated constructor stub
	}

	public void evaluatexqQuery(Node n, HashMap<Object , ArrayList<Node>> hmap ){
		
		
		System.out.println("Inside evaluate xquery");
        
		ArrayList<Node> return_list = new ArrayList<Node>();
		ArrayList<Node>curr_list = new ArrayList<Node>();
		ArrayList<Node> c_list = new ArrayList<Node>();
		 Object obj =this;
		 Stack<Node> stack_rp = new Stack<Node>();
		
		
		if(str_constant!=null && operand == null &&  var == null && xql==null && xqr ==null && xap==null && xqrpl == null
		&& xqfor==null && xqwhere==null && xqlet==null && xqret ==null && left ==null && right== null &&xqxp==null && operand==null )
		{
			Util u = new Util();
			Node d = u.make_text(str_constant);
			ArrayList<Node>  dlist = new ArrayList<Node>();
			dlist.add(d);
			hmap.put(this, dlist);
			
			
		}
		
	 if(this.var!=null){
		this.var.evaluatexqVariable(n, hmap);	
		return_list = hmap.get(this.var);
		 obj =this;
		hmap.put(obj, return_list);
			
			
		}
	 if(xap != null) {
			System.out.println("Inside Eval Absolute Path");
			this.xap.evalxqAbsolutePath(hmap);
			return_list = hmap.get(this.xap);
			obj = this;
			hmap.put(obj, return_list);
			
		}
		
		 if(operand == "()" && this.xql != null) {
			
			this.xql.evaluatexqQuery(n, hmap);
			ArrayList<Node> arr_list = hmap.get(this.xql);
			Object ob = this;
			hmap.put(ob, arr_list );
			
			
		}
	 if(this.xql != null && this.xqr !=null) {
		 
		 this.xql.evaluatexqQuery(n, hmap);
		 return_list = hmap.get(this.xql);
		 this.xqr.evaluatexqQuery(n, hmap);
		 curr_list = hmap.get(this.xqr);
		 return_list.addAll(curr_list);
		 hmap.put(this, return_list);
		 
		 
	 }
		
		
		
	
	
	 if(this.xqrpl !=null && this.xql != null && this.operand == "/") {
		 
		 this.xql.evaluatexqQuery(n, hmap);
		 return_list = hmap.get(this.xql);
		 for(int i=0 ;i <return_list.size();i++) {
			 NodeList x = return_list.get(i).getChildNodes();
			 for(int j=0 ; j<x.getLength(); j++ ) {
				 
				 this.xqrpl.evalxqRelativePath(x.item(j), hmap);
				 curr_list = hmap.get(this.xqrpl);
				 return_list.addAll(curr_list);
				 
			 }
			 
			 
			 
		 }
		 
		 obj = this;
		hmap.put(obj, return_list);
		 
		 
		 
	 }
	 
 if(this.xqrpl !=null && this.xql != null && this.operand == "//") {
		 
	 Node curr_node = null;
		NodeList c;
		this.xql.evaluatexqQuery(n, hmap);
		curr_list =  hmap.get(this.xql);
	for(int i=0; i< curr_list.size();i++)
		stack_rp.push(curr_list.get(i));
	while (!stack_rp.isEmpty()) {
			 curr_node =  stack_rp.pop();
			 this.xqrpl.evalxqRelativePath(curr_node, hmap);
			 c = curr_node.getChildNodes();
			 return_list = hmap.get(this.right);
			for(int j=0;j<return_list.size();j++)
				{
					c_list.add(return_list.get(j));
				}
			 for(int i =0; i< c_list.size();i++) {
				 stack_rp.push(c_list.get(i));	 		 
			 }
		}
		
		hmap.put(this, c_list);
		 
		 
		 
	 }
	 
	 
	
 if(left != null && this.right != null && this.xql != null && this.operand.equals("<>{}</>") ) {
		
	 this.xql.evaluatexqQuery(n, hmap);
		ArrayList<Node> arr_list = hmap.get(this.xql);
		Util u = new Util();
		Node d = u.makeElement(left , arr_list);
		ArrayList<Node>  dlist = new ArrayList<Node>();
		dlist.add(d);
		Object ob = this;
		hmap.put(ob, dlist);
		
	}
	
	 if(this.xqfor !=null ) {
		
		 ArrayList<Node> arr_list = new  ArrayList<Node>() ;
		 arr_list = this.xqfor.evalxqForClause(hmap, n, this.xqlet, this.xqwhere, this.xqret);
		
		
	}
}}
