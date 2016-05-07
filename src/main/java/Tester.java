import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
	    String Query= "doc(sample.xml)/(swetha/krish[ put = set] )";
	    System.out.println("This sucks");

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

		

	}

}
