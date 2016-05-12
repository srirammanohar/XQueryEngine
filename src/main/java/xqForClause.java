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
		xqlist = lxq;
		varlist = variable_list;
	}
  
	ArrayList<Node> evalxqForClause(HashMap<Object, ArrayList<Node>> hmap , Node n , xqLetClause xqlet, xqWhereClause xqwhere, xqReturnClause xqret ) {
		
		ArrayList<xqVariable> retu_list = new ArrayList<xqVariable>();
		ArrayList<ArrayList<Node>> global_list = new ArrayList<ArrayList<Node>> (this.xqlist.size());
		ArrayList<Node> inner = new ArrayList<Node>();
		//glob_ret_list.clear();
		System.out.println(this.xqlist.size());
		
	evaluate_help(hmap,n,global_list,xqlet,xqwhere,xqret,0);
		
		
		return glob_ret_list;
		
		
		
	}

	
	
	public void evaluate_help(HashMap<Object, ArrayList<Node>> hmap, Node node, ArrayList<ArrayList<Node>> lista, xqLetClause xqlet, xqWhereClause xqwhere, xqReturnClause xqret , int pos) {
		ArrayList<Node> xquery_result = new ArrayList<Node>();
		
		System.out.println("Inside Evaluate Help" + pos + lista.size());
		if(pos == xqlist.size())
		{
			boolean where_result = true;
		 if(xqlet!=null) xqlet.evaluatelet(node, hmap);
			
			if (xqwhere != null)
			{
				where_result = xqwhere.evaluateWhere(hmap, node);
				
			}
			if(where_result == true)
			{
				ArrayList<Node> returnclause_list = new ArrayList<Node>();
						xqret.evalxqRet(node, hmap);
						returnclause_list = hmap.get(xqret);
				//if(returnclause_list!=null)
				//{
					for(int k=0;k<returnclause_list.size();k++)
					{   System.out.println("Inside return list");
						glob_ret_list.add((Node)returnclause_list.get(k));
					}
				//}
			}
		}
		//else if(pos >= this.xqlist.size()) return;
		else
		{	System.out.println("Sizeeeeeeeeeeeeee" + pos+""+lista.size());
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
				evaluate_help(hmap,node,lista,xqlet,xqwhere,xqret,pos+1);
			}
		}
	}
	
	
	
}
