import java.io.FileInputStream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class xqQuery {
public  xqVariable var;
public String str_constant ;
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
public xqJoinAttr xqjl;
public xqJoinAttr xqjr;


	
	public xqQuery( String str) {
		// TODO Auto-generated constructor stub
		this.var = null;
		this.str_constant = str;
		//System.out.println("Inside the constructor ................" + str_constant);
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
		operand = "";
		xqjl = null;
		xqjr = null;
		}
	
	public xqQuery( xqVariable v) {
		
		this.operand = "";
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
		str_constant = "";
		xqjl = null;
		xqjr =null;
		}
	
	public xqQuery(xqAbsolutePath xapath ) {
		this.var = null;
		this.str_constant = "";
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
		operand = "";
		xqjl = null;
		xqjr = null;
		}
	public xqQuery(xqQuery xquery, String oper ) {
		this.var = null;
		this.str_constant = "";
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
		xqjl = null;
		xqjr = null;
		}
	public xqQuery(xqQuery xquery, String oper , xqQuery rgt ) {
		this.var = null;
		this.str_constant = "";
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
		xqjl = null;
		xqjr = null;
		}

	public xqQuery(String string, xqQuery xqap) {
		// TODO Auto-generated constructor stub
		this.var = null;
		this.str_constant = "";
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
		xqjl = null;
		xqjr = null;
	}

	public xqQuery(xqQuery left2, xqQuery right2) {
		// TODO Auto-generated constructor stub
		this.var = null;
		this.str_constant = "";
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
		operand = "";
		xqjl = null;
		xqjr = null;
		
	}

	public xqQuery(xqQuery xqap, String operand2, xqRelativePath xrp) {
		// TODO Auto-generated constructor stub
		this.var = null;
		this.str_constant = "";
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
		xqjl = null;
		xqjr = null;
		
	}

	public xqQuery(xqForClause xqfc, xqReturnClause xqrc) {
		// TODO Auto-generated constructor stub
		this.var = null;
		this.str_constant = "";
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
		operand = "";
		xqjl = null;
		xqjr = null;
		
		
	}

	public xqQuery(xqForClause xqfc, xqWhereClause xqwc, xqReturnClause xqrc) {
		// TODO Auto-generated constructor stub
		this.var = null;
		this.str_constant = "";
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
		operand = "";
		xqjl = null;
		xqjr = null;
	}

	public xqQuery(xqForClause xqfc, xqLetClause xqlc, xqReturnClause xqrc) {
		// TODO Auto-generated constructor stub
		this.var = null;
		this.str_constant = "";
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
		operand = "";
		xqjl = null;
		xqjr = null;
	}

	public xqQuery(xqForClause xqfc, xqWhereClause xqwc, xqLetClause xqlc, xqReturnClause xqrc) {
		// TODO Auto-generated constructor stub
		this.var = null;
		this.str_constant = "";
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
		operand = "";
		xqjl = null;
		xqjr = null;
		
	}

	public xqQuery(xqLetClause let, xqQuery xq) {
		// TODO Auto-generated constructor stub
		this.var = null;
		this.str_constant = "";
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
		operand = "";
		xqjl = null;
		xqjr = null;
	}

	public xqQuery(String string, String left2, String right2, xqQuery xqap) {
		
		this.var = null;
		this.str_constant = "";
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
		operand = string;
		xqjl = null;
		xqjr = null;
		
		
		
		
		// TODO Auto-generated constructor stub
	}

	public xqQuery(String oper, xqQuery left2, xqQuery right2, xqJoinAttr leftjoin, xqJoinAttr rightjoin) {
		// TODO Auto-generated constructor stub
		this.var = null;
		this.str_constant = "";
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
		operand = oper;
		xqjl = leftjoin;
		xqjr = rightjoin;	
				
	}

	public void evaluatexqQuery(Node n, HashMap<Object , ArrayList<Node>> hmap ){
		
		
		//System.out.println("Inside evaluate xquery..." + this.str_constant);
        
		ArrayList<Node> return_list = new ArrayList<Node>();
		ArrayList<Node>curr_list = new ArrayList<Node>();
		ArrayList<Node> c_list = new ArrayList<Node>();
		 Object obj =this;
		 Stack<Node> stack_rp = new Stack<Node>();
		
		 if(this.xql != null && this.xqr !=null) {
			 

			 this.xql.evaluatexqQuery(n, hmap);
			 return_list = hmap.get(this.xql);
			// System.out.println("Left evaluation "+return_list.size());
			 this.xqr.evaluatexqQuery(n, hmap);
			 if(hmap.containsKey(this.xqr)) {
				curr_list = hmap.get(this.xqr);
				
			 	if(curr_list != null){
			 		//System.out.println("Right evaluation "+curr_list.size());
			 		return_list.addAll(curr_list); }
			 	}
			 hmap.put(this, return_list);
			// System.out.println("Comma size....."+ return_list.get(0).getChildNodes().item(0));
			 
		 }
		 
		 else if(!this.str_constant.isEmpty()  && left ==null   )
		{	
			
			Util u = new Util();
			Node d = u.make_text(str_constant.substring(1,str_constant.length()-1));
			ArrayList<Node>  dlist = new ArrayList<Node>();
			dlist.add(d);
			hmap.put(this, dlist);
			
			
		}
		
	 if(this.var!=null){
		 ArrayList<Node> var_list=var.get_variable(hmap);
		 //System.out.println("In var xquery putting value"+ this.var.name.toString()+"\t"+var_list);
		 obj =this;
		 Util u=new Util();
		 hmap.put(obj, u.remove_duplicates(var_list));
			
			
		}
	 if(xap != null) {
			//System.out.println("Inside Eval Absolute Path");
			this.xap.evalxqAbsolutePath(hmap);
			return_list = hmap.get(this.xap);
			obj = this;
			hmap.put(obj, return_list);
			
		}
		
		 if(operand == "()" && this.xql != null) {
			// System.out.println("Inside () ");
			this.xql.evaluatexqQuery(n, hmap);
			ArrayList<Node> arr_list = hmap.get(this.xql);
			Object ob = this;
			hmap.put(ob, arr_list );
			
			
		}
	
	 if(this.xqrpl !=null && this.xql != null && this.operand == "/") {
		 //System.out.println("Inside ()/////// ");
		 ArrayList<Node>  new_list=new ArrayList<Node>();
		 this.xql.evaluatexqQuery(n, hmap);
		 return_list = hmap.get(this.xql);
		 //System.out.println("priting for $a..........."+return_list);
		 if(return_list!=null) {
		 for(int i=0 ;i <return_list.size();i++) {
			 NodeList x = return_list.get(i).getChildNodes();
			// System.out.println("size of firstname is ......."+ x.getLength());
			 for(int j=0 ; j<x.getLength(); j++ ) {
				 
				 this.xqrpl.evalxqRelativePath(x.item(j), hmap);
				 curr_list = hmap.get(this.xqrpl);
				 new_list.addAll(curr_list);
				 
			 }			 
		 }}
		 
		 obj = this;
		 Util u = new Util();
		 new_list = u.remove_duplicates(new_list);
		hmap.put(obj, new_list);
		 //System.out.println("Return list size is...."+return_list.size()+ return_list);
		 
		 
	 }
	 
 if(this.xqrpl !=null && this.xql != null && this.operand == "//") {
	 

	 Node curr_node = null;
		NodeList c;
		this.xql.evaluatexqQuery(n, hmap);
		curr_list =  hmap.get(this.xql);
		//System.out.println("double slash..."+this.xql.left);
	for(int i=0; i< curr_list.size();i++) {
		stack_rp.push(curr_list.get(i));
	while (!stack_rp.isEmpty()) {
			 curr_node =  stack_rp.pop();
			 
			 this.xqrpl.evalxqRelativePath(curr_node, hmap);
			 return_list = hmap.get(this.xqrpl);
			// System.out.println(return_list);
			 c = curr_node.getChildNodes();
			 //if(return_list !=null){
			for(int j=0;j<return_list.size();j++)
				{
					c_list.add(return_list.get(j));
				}
			 for(int k =0; k< c.getLength();k++) {
				 stack_rp.push(c.item(k));	 		 
			 }}}
		//}
	//System.out.println(return_list + "RET LISTTTTTTTT");
		Object ob =this;
		Util u = new Util();
		c_list = u.remove_duplicates(c_list);
		hmap.put(ob, c_list);
		 
		 
		 
	 }
 if(this.operand.equals("join")) {
	 //System.out.println("Inside join");
	 Util uu=new Util();
	 Node curr_node = null;
	 this.xql.evaluatexqQuery(n, hmap);
	 this.xqr.evaluatexqQuery(n, hmap);
	 curr_list = hmap.get(this.xql);
	 
	 c_list = hmap.get(this.xqr);
	 //c_list=uu.uniqueNodeList(c_list);
	 
	 HashMap<String, ArrayList<Node>> hmapl = new HashMap<String,ArrayList <Node> >();
	 HashMap<String, ArrayList<Node>> hmapr = new HashMap<String,ArrayList <Node> >();
	 HashMap<String, String > attributes = new HashMap<String,String>();

	 ArrayList<String> llst =  xqjl.expr;
	 ArrayList<String> rlst = xqjr.expr;
	 
	 System.out.println(" Left list size......." + llst.get(0)+ "  "+curr_list.size());
	 System.out.println(" Right list size......." + rlst.get(0)+"  "+c_list.size());
	 
	 if(!curr_list.isEmpty())
		 for(int i=0;i<curr_list.size();i++){
		 //for(int i=0;i<1;i++){
			 String key = "";			 

			 attributes = new HashMap<String,String>();
			 int count =0;
			 NodeList temp = getChildren(curr_list.get(i));
			
			  for(int k=0; k<temp.getLength();k++){
				  //System.out.println("checking text......"+temp.item(k));
				  attributes.put(temp.item(k).getNodeName(),temp.item(k).getTextContent());}
				 
			  for(int j=0; j<llst.size() ; j++) {
				
			 		if(attributes.containsKey(llst.get(j))){
					 key = key + attributes.get(llst.get(j));
					 count++;}
					 //System.out.println("Keys in left :"+key);
					
					}
			  if(count == llst.size()){
				 if(!hmapl.containsKey(key)) {
					 ArrayList<Node> toAdd = new ArrayList<Node>();
					 toAdd.add(curr_list.get(i));
					 hmapl.put(key, toAdd);
					 
				 }
				 else {
					 ArrayList<Node> toAdd = new ArrayList<Node>();
					 toAdd = hmapl.get(key);
					 toAdd.add(curr_list.get(i));
					 hmapl.put(key, toAdd);
					 }}}
	 		
	 
	 if(!c_list.isEmpty())
		 for(int i=0;i<c_list.size();i++) {
		 //for(int i=0;i<1;i++){
			 String key = "";

			 attributes = new HashMap<String,String>();
			 int count =0;
			 NodeList temp = getChildren(c_list.get(i));
			  for(int k=0; k<temp.getLength();k++){
				  attributes.put(temp.item(k).getNodeName(),temp.item(k).getTextContent() );}
				  
			  for(int j=0; j<rlst.size() ; j++) {
				
			 		if(attributes.containsKey(rlst.get(j))) {
					 key=key+attributes.get(rlst.get(j));
					 count++; }
					 //System.out.println("Keys in right :"+key);
					}
			  if(count == rlst.size()){
				 if(!hmapr.containsKey(key)) {
					 ArrayList<Node> toAdd = new ArrayList<Node>();
					 toAdd.add(c_list.get(i));
					 hmapr.put(key, toAdd);
					
					 
				 }
				 else {
					 ArrayList<Node> toAdd = new ArrayList<Node>();
					 toAdd = hmapr.get(key);
					 toAdd.add(c_list.get(i));
					 hmapr.put(key, toAdd);
					 }}}
	 		 	
	 		
	 		Util u=new Util();
	 		ArrayList<Node> final_answer=new ArrayList<Node>();
	 		//System.out.println(hmapl.size() + " " + hmapr.size());
	 		int Counting=0;
	 		for(HashMap.Entry<String, ArrayList<Node>> left_entry : hmapl.entrySet()){
	 			String left_key=left_entry.getKey().trim();
	 	        ArrayList<Node> left_answer=(ArrayList<Node>) left_entry.getValue();
	 	      
	 	        	if(hmapr.containsKey(left_key)){
	 	        		ArrayList<Node> right_answer= hmapr.get(left_key);
	 	        		//System.out.println("Sizes comparison !!!! "+ left_key+"  "+ left_answer.size()+" "+right_answer.size());
		 	        	for(int x=0;x<left_answer.size();x++){
		 	        		for(int y=0;y<right_answer.size();y++){
		 	        			
		 	        			ArrayList<Node> temp_list=new ArrayList<Node>();
		 	        			NodeList left=null;
		 	        			NodeList right=null;
		 	        			left=left_answer.get(x).getChildNodes();
		 	        			right=right_answer.get(y).getChildNodes();
		 	        			for(int a=0;a<left.getLength();a++)
		 	        				temp_list.add(left.item(a));
		 	        			for(int a=0;a<right.getLength();a++)
		 	        				temp_list.add(right.item(a));
		 	        			Node temp=u.makeElement("tuple", temp_list);		 	        	
		 	        			final_answer.add(temp);
		 	        			//System.out.println(Counting++);
		 	        		}
		 	        	}
	 	        	}
	 	        }	 		
	 		//System.out.println(return_list.get(2).getNodeName()+"  tttttttttttttttttt  "+final_answer.get(0).getFirstChild());
	 	
	 		Object ob = this;
	 		hmap.put(ob, final_answer);
	 		
 
 }
	 
 
	 
	
 if(this.left != null && this.right != null && this.xql != null  && this.operand.equals("<>{}</>") ) {
	 //System.out.println("Inside<>{}</> ......... ");
 	//if(this.operand.equals("<>{}</>")){
	 this.xql.evaluatexqQuery(n, hmap);
	 Util u1=new Util();
		ArrayList<Node> arr_list = hmap.get(this.xql);
		arr_list=u1.remove_duplicates(arr_list);
		//System.out.println("XQL"+u1.remove_duplicates(arr_list));
		//System.out.println("LEFT"+left);
		Util u = new Util();
		Node d = u.makeElement(left , arr_list);
		//System.out.println("XQL"+arr_list);
		ArrayList<Node>  dlist = new ArrayList<Node>();
		dlist.add(d);
		Object ob = this;
		hmap.put(ob, dlist);
		
	}
 
	
	 if(this.xqfor !=null ) {
		 //System.out.println("INSIDE FOR");
		
		 ArrayList<Node> arr_list = new  ArrayList<Node>() ;
		 arr_list = this.xqfor.evalxqForClause(hmap, n,  this.xqwhere,this.xqlet, this.xqret);
		//System.out.println(arr_list.size() + "IS THE SIZE OF THE ARRLIST");
		hmap.put(this, arr_list);
	}	 
}
	NodeList getChildren(Node a) {
		NodeList s;
		NodeList children = a.getChildNodes();
		return children;
		
		
		
	}
	
	
}
