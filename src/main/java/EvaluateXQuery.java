import java.util.ArrayList;
import java.util.HashMap;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class EvaluateXQuery {
    
	
	   

	
	
	public EvaluateXQuery() {

	}

	public static void main(String[] args) {

		HashMap<Object, ArrayList<Node>> hmap=new HashMap<Object,ArrayList<Node>>();    

		String Query= "doc(sample2.xml)/class/student";
		
		
		  //  System.out.println("This sucks");

		    ANTLRInputStream input = new ANTLRInputStream(Query);
		    xmlLexer lexer = new xmlLexer(input);

		    CommonTokenStream tokens = new CommonTokenStream(lexer);

		    lexer.reset();
		    xmlParser parser = new xmlParser(tokens);	    
			     	ParseTree tree = parser.query(); 
			       // String query = tree.getText();
			        //String filename = tree.getChild(2).getText();
			 
			        System.out.println(tree.toStringTree(parser)); 
			        
			        ParseTreeWalker walker=new ParseTreeWalker();
			        xmlBaseListener listener=new xmlBaseListener();
			        FinalBuilder xmlwalk= new FinalBuilder();
			        walker.walk(xmlwalk, tree);
	                Object ob = xmlwalk.getObject();
	               //xqAbsolutePath xq =(xqAbsolutePath)ob;
	                xqQuery xq  = (xqQuery)ob;
	                System.out.println(ob.getClass().getName());
	                xq.evaluatexqQuery(null, hmap);
	                Util d;
		            
		    System.out.println(hmap.get(xq));
		    
		    System.out.println(hmap.get(xq).size());
		
		

	}

}
