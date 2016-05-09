import java.util.ArrayList;
import java.util.List;

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

}
