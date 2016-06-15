import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.w3c.dom.Node;

public class xqWhereClause {

	public Condition where_con;
	public String oper;
	

	public xqWhereClause(Condition c, String s) {
		// TODO Auto-generated constructor stub
		oper = s;
		where_con =c;
		
		
	}
	
	
	boolean evaluateWhere(HashMap<Object, ArrayList<Node>> hmap, Node node) {
		boolean flag = this.where_con.evalCondition(node, hmap);
		//if(flag) System.out.println(flag + "Thia ia the where clcon");
		return flag;
		
		
		
		
	}
	
	

}
