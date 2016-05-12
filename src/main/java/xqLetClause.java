import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.w3c.dom.Node;

public class xqLetClause {
	List<xqQuery> xqletlist;
	List<xqVariable>   varlist;
	
	public xqLetClause() {
		// TODO Auto-generated constructor stub
	}

	public xqLetClause(List<xqQuery> lxq, List<xqVariable> variable_list) {
		// TODO Auto-generated constructor stub
		
		xqletlist = lxq;
		varlist = variable_list;
		
		
		
		
	}
  public void  evaluatelet(Node n, HashMap<Object, ArrayList<Node>> hmap) {
	  System.out.println("Inside Let Class");
	  ArrayList<xqVariable> retu_list = new ArrayList<xqVariable>();
	  ArrayList<ArrayList<Node>> global_list = new ArrayList<ArrayList<Node>> ();
	  ArrayList<Node> inner = new ArrayList<Node>();
	  ArrayList<Node> finale = new ArrayList<Node>();
	  for(int i=0 ; i<xqletlist.size() ; i++) {
		  
		  xqletlist.get(i).evaluatexqQuery(n, hmap);
		  inner  = hmap.get(xqletlist.get(i));
		  global_list.add(inner);
		  finale.addAll(inner);
		  
	  }
	  System.out.println(global_list.size()+ ".......................LET" + global_list);
	  evaluateLetHelp(n,hmap,global_list,0);
	  System.out.println(finale);
	  hmap.put(this, finale);
	  
	  
	  
  }
	public void evaluateLetHelp(Node n, HashMap<Object, ArrayList<Node>> hmap , ArrayList<ArrayList<Node>> xqlet , int pos){
		
		if(pos == xqlet.size()) return;
		else {
			 System.out.println("ffffrejnkmmmmmmmmmmmmmmmmmm" + this.varlist.get(pos)+ xqlet.get(pos));
			 hmap.put(this.varlist.get(pos),xqlet.get(pos));
			 evaluateLetHelp(n,hmap,xqlet,pos+1);
			
		}}
	
	
	
	
	
}
