import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.w3c.dom.Node;

public class xqLetClause {
	List<xqQuery> xqletlist;
	List<xqVariable>  varlist;
	
	public xqLetClause() {
		// TODO Auto-generated constructor stub
	}

	public xqLetClause(List<xqQuery> lxq, List<xqVariable> variable_list) {
		// TODO Auto-generated constructor stub
		
		xqletlist = lxq;
		varlist = variable_list;
		
		
		
		
	}
  public void  evaluatelet_old(Node n, HashMap<Object, ArrayList<Node>> hmap) {
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
	  evaluateLetHelp_old(n,hmap,global_list,0);
	  System.out.println(finale);
	  hmap.put(this, finale);
	  
	  
	  
  }
	public void evaluateLetHelp_old(Node n, HashMap<Object, ArrayList<Node>> hmap , ArrayList<ArrayList<Node>> xqlet , int pos){
		
		if(pos == xqlet.size()) return;
		else {
			 System.out.println("ffffrejnkmmmmmmmmmmmmmmmmmm" + this.varlist.get(pos)+ xqlet.get(pos));
			 hmap.put(this.varlist.get(pos),xqlet.get(pos));
			 evaluateLetHelp_old(n,hmap,xqlet,pos+1);
			
		}}
	
	
	public void  evaluatelet(Node n, HashMap<Object, ArrayList<Node>> hmap ,ArrayList<Node> nlist,
		  	xqWhereClause whr, xqReturnClause ret) {
	 
	  System.out.println("Inside Let Class..........");
	  ArrayList<xqVariable> variable_list = new ArrayList<xqVariable>();
	  ArrayList<ArrayList<Node>> global_list = new ArrayList<ArrayList<Node>> (this.xqletlist.size());
	  ArrayList<Node> inner = new ArrayList<Node>();
	  ArrayList<Node> finale = new ArrayList<Node>();
	 // finale = nlist;
	  this.evaluateLetHelp(n,hmap,0,nlist,whr,ret,global_list);
	  //hmap.put(this, nlist);
	  System.out.println("............................"+nlist.size());
	  nlist = new ArrayList<Node> ();
	 	  
  }
	private void evaluateLetHelp(Node n, HashMap<Object, ArrayList<Node>> hmap, int pos, ArrayList<Node> nlist,
		xqWhereClause whr, xqReturnClause ret ,ArrayList<ArrayList<Node>> global_list ) {
	// TODO Auto-generated method stub
		
		ArrayList<Node> list1 = new ArrayList<Node>();
		ArrayList<Node> list2 = new ArrayList<Node>();
		ArrayList<Node> list3 = new ArrayList<Node>();


		if(pos == this.xqletlist.size()){
			boolean where_result = true;
			if (whr != null)  {
				where_result = whr.evaluateWhere(hmap, n);
			if(where_result)
			{
				 ret.evalxqRet(n, hmap);
				 list1 = hmap.get(ret);

				 for(int i=0;i<list1.size();i++){
			       nlist.add((Node)list1.get(i));

				 }
				}
			}}
		else {
			this.xqletlist.get(pos).evaluatexqQuery(n, hmap);
			 list2 = hmap.get(this.xqletlist.get(pos));
			global_list.add(list2);

			for(int j=0;j<global_list.get(pos).size();j++)

			{   

				Node n1 = global_list.get(pos).get(j);				
				list3.clear();
			 	list3.add(n1);
			 	hmap.put(this.varlist.get(pos), list3);
			 	evaluateLetHelp(n,hmap,pos+1,nlist,whr,ret,global_list);
			 }
			global_list.remove(pos);
			}
		}
	}
	
	

