import java.util.ArrayList;
import java.util.HashMap;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class EvaluateXQuery {
    
	
  //public static HashMap<>
	   

	
	
	public EvaluateXQuery() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Object, ArrayList<Node>> hmap=new HashMap<Object,ArrayList<Node>>();    

		String Query= "doc(sample.xml)/student ";
		  //  System.out.println("This sucks");

		    ANTLRInputStream input = new ANTLRInputStream(Query);
		    //System.out.println("This sucks");

		    xmlLexer lexer = new xmlLexer(input);
		    //System.out.println("This sucks");

		    CommonTokenStream tokens = new CommonTokenStream(lexer);

		    lexer.reset();
		    //System.out.println("This sucks");

		    xmlParser parser = new xmlParser(tokens);
		    //System.out.println("This sucks");


		        ParseTree tree = parser.absolute_path(); 

			   System.out.println(tree.toStringTree(parser));
		        


		        String query = tree.getText();

		        String filename = tree.getChild(2).getText();
		       
		         
		           
		        //Absolute_pathContext absolute_pathContext=parser.absolute_path();
		        System.out.println(tree.toStringTree(parser)); 
		        ParseTreeWalker walker=new ParseTreeWalker();
		        xmlBaseListener listener=new xmlBaseListener();
		        FinalBuilder xmlwalk= new FinalBuilder();
		        walker.walk(xmlwalk, tree);
                 Object ob = xmlwalk.getObject();
                 xqAbsolutePath xq =(xqAbsolutePath)ob;
                System.out.println(ob.getClass().getName());
               
		      // System.out.println(xq.fName.file + "sfntf");
		       xq.evalxqAbsolutePath(hmap);
		   // System.out.println(hmap.get(xq).toString());
		
		

	}

}
