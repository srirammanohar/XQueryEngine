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
		ArrayList<ArrayList<Node>> global_list = new ArrayList<ArrayList<Node>> ();
		ArrayList<Node> inner = new ArrayList<Node>();
		
		for(int i =0 ; i<xqlist.size(); i++) {
			System.out.println(xqlist.get(i).toString() + "String obj");
			xqlist.get(i).evaluatexqQuery(n, hmap);
			inner = hmap.get(xqlist.get(i));
			System.out.println(inner.toString() + "hgfbdnm");
			glob_ret_list.addAll(inner);
			global_list.add(inner);
		
		   // hmap.put(varlist.get(i), hmap.get(xqlist.get(i)));
			
		//	retu_list.add(varlist.get(i));
			
		}
		
		evaluate(hmap,n,global_list,xqlet,xqwhere,xqret,0);
		
		
		return glob_ret_list;
		
		
		
	}

	public void evaluate(HashMap<Object, ArrayList<Node>> hmap, Node node, ArrayList<ArrayList<Node>> lista, xqLetClause xqlet, xqWhereClause xqwhere, xqReturnClause xqret , int pos ) {
		
		
		ArrayList<Node> curr_list = new ArrayList<Node>();
		
		if(pos == lista.size()) {
			 System.out.println("Inserting variavble" + "\t \t" + lista.size()  );
			xqret.evalxqRet(node,hmap);
			curr_list = hmap.get(xqret);
			glob_ret_list.addAll(curr_list);
		}
		else
		{
			for(int j=0;j<lista.get(pos).size();j++)
			{   System.out.println("Inserting variavble" + this.varlist.get(pos).name + "\t \t"  );
				ArrayList<Node> temp = new ArrayList<Node>();
				temp.add(lista.get(pos).get(j));
				hmap.put(this.varlist.get(pos), temp);
				System.out.println("Inserting variavble" + this.varlist.get(pos).name + "\t \t" + temp );
				evaluate(hmap,node,lista,xqlet,xqwhere,xqret,pos+1);
			}
		}
	}
	
	
}
