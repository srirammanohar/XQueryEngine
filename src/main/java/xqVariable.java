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
	
public  ArrayList<Node>  get_variable(HashMap<Object, ArrayList<Node>> hmap){
		
		for(Object key : hmap.keySet()){
			
			xqVariable variable=null;
			if (key instanceof xqVariable){
				variable=(xqVariable)key;
				//System.out.println(this.name.toString()+"  "+ variable.name.toString());
				if(this.name.equals(variable.name))
				{
					return hmap.get(variable);
				}
			}
		}
		Object obj=this;
		ArrayList<Node> var_list=new ArrayList<Node>();
		var_list=hmap.get(obj);
		//System.out.println("String value=="+this.name+"\t value\t"+obj);
		//System.out.println("Getting value=="+obj+"\t"+var_list);
		
		return var_list;
		
		
	}
	
}
