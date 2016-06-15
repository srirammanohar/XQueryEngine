import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.w3c.dom.Node;

public class xqForClause {

	public static ArrayList<Node> glob_ret_list = new ArrayList<Node>();
	public List<xqQuery> xqlist;
	public List<xqVariable> varlist;
	
	
	public xqForClause() {
		// TODO Auto-generated constructor stub
	}

	public xqForClause(List<xqQuery> lxq, List<xqVariable> variable_list) {
		// TODO Auto-generated constructor stub
		//System.out.println("Inside for clause constructor");
		xqlist = lxq;
		//System.out.println(lxq.toString());
		varlist = variable_list;
	}
  
	ArrayList<Node> evalxqForClause(HashMap<Object, ArrayList<Node>> hmap , Node n , xqWhereClause xqwhere, xqLetClause xqlet, xqReturnClause xqret ) {
		
		ArrayList<xqVariable> retu_list = new ArrayList<xqVariable>();
		ArrayList<ArrayList<Node>> global_list = new ArrayList<ArrayList<Node>> (this.xqlist.size());
		ArrayList<Node> inner = new ArrayList<Node>();
		//glob_ret_list.clear();
		//System.out.println(this.xqlist.size());
		
		evaluate_help(hmap,n,global_list, inner, xqlet,xqwhere,xqret,0);
		
		ArrayList<Node> temp_list=new ArrayList<Node>(inner);
		//temp_list.addAll(inner);
		//System.out.println("GLOBALRETURNLIST\t\t\t\t\t\t\t\t\t"+glob_ret_list);
		inner=new ArrayList<Node>();
		
		return temp_list;
		
		
		
	}

	
	
	public void evaluate_help(HashMap<Object, ArrayList<Node>> hmap, Node node, ArrayList<ArrayList<Node>> lista, ArrayList<Node> a, xqLetClause xqlet, xqWhereClause xqwhere, xqReturnClause xqret , int pos) {
		ArrayList<Node> xquery_result = new ArrayList<Node>();
		
		ArrayList<Node> returnclause_list = new ArrayList<Node>();

		
		//System.out.println("Inside Evaluate Help" + pos + lista.size());
		if(pos == xqlist.size())
		{	boolean where_result = true;
			//System.out.println("Inside for base case");
			if(xqlet!=null)  {
				
				ArrayList<Node> letlist = a;
				xqlet.evaluatelet(node, hmap,letlist,xqwhere,xqret);
				a = letlist;
			
			}
			
			
			else{
			
			if (xqwhere != null)
			{
				where_result = xqwhere.evaluateWhere(hmap, node);
				//if(where_result)
				//System.out.println("Came from where !!!!!!!!!!!!!!!!"+where_result);
				
			}
			if(where_result == true)
			{
				xqret.evalxqRet(node, hmap);
				returnclause_list = hmap.get(xqret);
				//System.out.println(returnclause_list+"Return size");
				if(returnclause_list!=null)
				{	//System.out.println("Adding node");
					for(int k=0;k<returnclause_list.size();k++)
					{   
						a.add((Node)returnclause_list.get(k));
					}
				}
			}
		}}
		//else if(pos >= this.xqlist.size()) return;
		else
		{	
			//System.out.println("Faulting" + pos + xqlist.toString());
			this.xqlist.get(pos).evaluatexqQuery(node, hmap);
	         if(hmap.containsKey(this.xqlist.get(pos)))
			 xquery_result = hmap.get(this.xqlist.get(pos));
			lista.add(xquery_result);
			if(lista.get(pos) == null) return;
			for(int j=0;j<lista.get(pos).size();j++)
			{	
				ArrayList<Node> temp = new ArrayList<Node>();
				temp.add(lista.get(pos).get(j));
				hmap.put(this.varlist.get(pos), temp);
				evaluate_help(hmap,node,lista, a,xqlet,xqwhere,xqret,pos+1);
			}
			lista.remove(pos);
		}
	}
/*	public void evaluate_help(HashMap<Object, ArrayList<Node>> hmap, Node node, xqWhereClause input_where,
			xqLetClause input_let, xqReturnClause input_return, ArrayList<ArrayList<Node>> forclause_list,ArrayList<Node> final_list,int i)
	{
		
		if(i == this.xqlist.size())
		{
			boolean where_result = true;
			if(input_let != null)
				input_let.evaluatelet(node, hmap, final_list, input_where, input_return);
			else
			{
				if (input_where != null)
				{    
					where_result = input_where.evaluateWhere(hmap, node);
					//System.out.println("Inside where");
				}
				if(where_result == true)
				{
					
					ArrayList<Node> returnclause_list = new ArrayList<Node>();
							input_return.evalxqRet(node, hmap);
							hmap.get(input_return);
			
					System.out.println("Size " + returnclause_list.size());
						for(int k=0;k<returnclause_list.size();k++)
						{
							final_list.add((Node)returnclause_list.get(k));
						}
				}	
			}

		}
		else
		{
			this.xqlist.get(i).evaluatexqQuery(node, hmap);
			ArrayList<Node> xquery_result = hmap.get(this.xqlist.get(i));
			
			forclause_list.add(xquery_result);
			for(int j=0;j<forclause_list.get(i).size();j++)
			{	
				
				ArrayList<Node> temp = new ArrayList<Node>();
			
				temp.add(forclause_list.get(i).get(j));
				
				hmap.put(this.varlist.get(i), temp);
				
				evaluate_help(hmap,node,input_where,input_let,input_return,forclause_list,final_list,i+1);
			
			}
			forclause_list.remove(i);
			
		}
	}

	public ArrayList<Node> evalxqForClause(HashMap<Object, ArrayList<Node>> evaluator_hashmap,Node node,
			xqWhereClause input_where,xqLetClause input_let,xqReturnClause input_return)
	{
		ArrayList<ArrayList<Node>> forclause_list = new ArrayList<ArrayList<Node>>(xqlist.size());
		ArrayList<xqVariable> result_list = new ArrayList<xqVariable>();
		ArrayList<Node> final_list = new ArrayList<Node>();
		
		this.evaluate_help(evaluator_hashmap,node,input_where,input_let,input_return,forclause_list,final_list,0);
		System.out.println("FOR OUTPUT " + final_list);
		ArrayList<Node> temp_list = new ArrayList<Node>(final_list);
		final_list=new ArrayList<Node>();
		return temp_list;
	}*/
	
	
	
}
