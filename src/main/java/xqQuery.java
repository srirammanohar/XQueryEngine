import java.util.ArrayList;
import java.util.HashMap;

import org.w3c.dom.Node;

public class xqQuery {
public  String var;
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
	
	public xqQuery( String str1, String str2) {
		this.var = str2;
		this.str_constant = str1;
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
		
		
		
		
		
		
		
		
		
		
		
	}
	
	


}
