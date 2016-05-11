import java.util.ArrayList;
import java.util.HashMap;

import org.w3c.dom.Node;

public class xqReturnClause {

	public xqQuery retxq;
	public String oper;
	
	public xqReturnClause() {
		// TODO Auto-generated constructor stub
	}

	public xqReturnClause(xqQuery c, String s) {
		// TODO Auto-generated constructor stub
		 retxq = c;
		oper = s;
		
		
	}

	public void evalxqRet(Node node, HashMap<Object, ArrayList<Node>> hmap) {
		
		System.out.println("Inside return");
		// TODO Auto-generated method stub
		ArrayList<Node> ret_list = new ArrayList<Node>();
		this.retxq.evaluatexqQuery(node, hmap);
		ret_list = hmap.get(this.retxq);
		Object ob = this;
		hmap.put(ob, ret_list);
		
		
	}

}
