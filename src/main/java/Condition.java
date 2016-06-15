import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Condition {
public xqQuery xql;
public xqQuery xqr;
public String op;
public List<xqVariable> varlist;
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
		varlist=new ArrayList<xqVariable>();
		var="";
		xqQuerylist=new ArrayList<xqQuery>();
		condleft=null;
		condright=null;
	}


	public Condition(xqQuery xql2, String oper) {
		
		xql=xql2;
		op=oper;
		xqr=null;
		varlist=new ArrayList<xqVariable>();
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
		varlist=new ArrayList<xqVariable>();
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
		varlist=new ArrayList<xqVariable>();
		var="";
		xqQuerylist=new ArrayList<xqQuery>();
		
	}


	public Condition(List<xqQuery> lxq, ArrayList<xqVariable> variable_list, Condition c, String st) {
		
		
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
			//System.out.println("Evaluating or condition !!" + condleft.evalCondition(node, hmap) + condright.evalCondition(node, hmap));
			
			return (this.condleft.evalCondition(node, hmap) || this.condright.evalCondition(node, hmap)) ;		
	
		}
		else if(op.equals("and") &&  condleft !=null && condright != null) {
			
			return (condleft.evalCondition(node, hmap) && condright.evalCondition(node, hmap)) ;		
	
		}
		
		else if(op.equals("empty") &&  xql !=null ) {
			
			this.xql.evaluatexqQuery(node, hmap);		
			return_list = hmap.get(this.xql);
			System.out.println("Empty.............................................."+return_list.isEmpty());
			
			if(return_list.size()>0)
				return false;
			return true;
			//return return_list.isEmpty();
	
		}
		else if((xql!=null) && (xqr != null) && op.equals("eq")  ) {
			
			//System.out.println("Inside eq................................"+this.xql.toString());

			this.xql.evaluatexqQuery(node, hmap);
			ArrayList<Node> ret_list = new ArrayList<Node>();
			ret_list = hmap.get(this.xql);
			this.xqr.evaluatexqQuery(node, hmap);
			ArrayList<Node> ret_right = new ArrayList<Node>();
			ret_right = hmap.get(this.xqr); 
			//System.out.println(ret_right + "............right..................");
			//System.out.println(ret_list + ".................left.............");
			//if(ret_right.size()!= ret_list.size()) return false;
			//else {
			for(int j=0;j<ret_list.size();j++){
				for(int i =0 ; i<ret_right.size() ; i++ ){
					
					if( ret_list.get(j).isEqualNode(ret_right.get(i))) 
					{//System.out.println("LEFT VALUE:\t"+ret_list.get(j)+"RIGHTVALUE:\t"+ret_right.get(i));
						return true;
											
					}					
			}
			}
			
			return false;
			
		}
		else if((xql!=null) && (xqr != null) && op.equals("is") ) {
			
			this.xql.evaluatexqQuery(node, hmap);
			ArrayList<Node> ret_list = new ArrayList<Node>();
			ret_list = hmap.get(this.xql);
			this.xqr.evaluatexqQuery(node, hmap);
			ArrayList<Node> ret_right = new ArrayList<Node>();
			ret_right = hmap.get(this.xqr); 
			System.out.println(ret_right.size() + " " + ret_list.size());
			//if(ret_right.size()!= ret_list.size()) return false;
			//else {
			for(int j=0;j<ret_right.size();j++){
				for(int i =0 ; i<ret_list.size() ; i++ ){
					
					if(ret_list.get(i).isSameNode(ret_right.get(j))) {
						return true;}					
				}
					
			}
			return false;
		}
		
		else if(this.op.equals("some")){
			//System.out.println("Inside some10.......");
			ArrayList<ArrayList<Node>> condition_list = new ArrayList<ArrayList<Node>>();			
			return conditionhelp(node,hmap,condition_list,0);
					
		}
			
		return false;
		
	}
	public boolean conditionhelp(Node node,HashMap<Object, ArrayList<Node>> hmap,ArrayList<ArrayList<Node>> cond_list,int pos)
	{
			//System.out.println("Inside calculate condition");
			if(pos == this.xqQuerylist.size())
			{
				//System.out.println("Inside condition base case" + this.condleft.evalCondition(node, hmap));
				return this.condleft.evalCondition(node, hmap);
			}
			else
			{
					 this.xqQuerylist.get(pos).evaluatexqQuery(node, hmap);
					 ArrayList<Node> xq_result = hmap.get(this.xqQuerylist.get(pos));
					System.out.println("Result list size " + xq_result.size());
					cond_list.add(xq_result);
					System.out.println("Size " + cond_list.get(pos).size());
				for(int j=0;j<cond_list.get(pos).size();j++)
				{
	
				ArrayList<Node> temp = new ArrayList<Node>();
				temp.add(cond_list.get(pos).get(j));
				
				hmap.put(this.varlist.get(pos), temp);
	
				//System.out.println("i= " + i + "j = " + j);
				if(conditionhelp(node,hmap,cond_list,pos+1) == true)
					return true;
				}
				cond_list.remove(pos);
			}
			return false;

		}



	
}
