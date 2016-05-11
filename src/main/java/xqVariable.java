import java.util.ArrayList;
import java.util.HashMap;

import org.w3c.dom.Node;

public class xqVariable   {
	public String name = null;

	public xqVariable(String a) {
		
		name = a;
		// TODO Auto-generated constructor stub
		
	}

	void evaluatexqVariable(Node node, HashMap<Object, ArrayList<Node>> hmap) {
		
		ArrayList<Node> return_list = new ArrayList<Node>();
		Object obj = this;
		if(name != null) {
			return_list.add(node);
		hmap.put(obj,return_list );
		}
		
	
		
		
	}
	
	
	
}
