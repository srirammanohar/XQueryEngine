import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    String Query= "doc(sample.xml)/student";
	    System.out.println("This sucks");

	    ANTLRInputStream input = new ANTLRInputStream(Query);
	    System.out.println("This sucks");

	    xmlLexer lexer = new xmlLexer(input);
	    System.out.println("This sucks");

	    CommonTokenStream tokens = new CommonTokenStream(lexer);

	    lexer.reset();
	    System.out.println("This sucks");

	    xmlParser parser = new xmlParser(tokens);
	    System.out.println("This sucks");


	        ParseTree tree = parser.absolute_path(); 

		    System.out.println("This sucks3");


	        String query = tree.getText();

	        String filename = tree.getChild(2).getText();


		

	}

}
