import java.io.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.Document;

public class EvaluateXQuery {
    

	public EvaluateXQuery() {

	}
	static String readFile(String path, Charset encoding) throws IOException 
	{
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return new String(encoded, encoding);
	}
	public static void main(String[] args) throws IOException {

		HashMap<Object, ArrayList<Node>> hmap=new HashMap<Object,ArrayList<Node>>();   
		
		String queryasString = readFile("Rewritten_query.txt", StandardCharsets.UTF_8);
		//String queryasString = readFile("testinput2.txt", StandardCharsets.UTF_8);

		String Query= "for $x in doc(sample2.xml)/class/student let $y:= doc(sample2.xml)/class return $x,$y";
		String fileName = "input.txt";
        File file = new File(fileName);
        FileInputStream fis = null;
		    try {
				fis = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    System.out.println("File............" + fis);
		    ANTLRInputStream input = null;
			input = new ANTLRInputStream(queryasString);
		
		  //  System.out.println("This sucks");

//		    ANTLRInputStream input = new ANTLRInputStream(Query);
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
	                //System.out.println(ob.getClass().getName());
	                long startTime = System.nanoTime();
	                xq.evaluatexqQuery(null, hmap);
	                long endTime = System.nanoTime();

	                long duration = (endTime - startTime);
	                System.out.println("Duration is : "+duration);
	                Util d;
		            
		    System.out.println(hmap.get(xq));
		    //System.out.println(hmap.get(xq).get(1).getTextContent());
		    Util u = new Util();
		    
		    
		//String s = Util.prettyFormat(hmap.get(xq).toString(),4);
		    DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = null;
			try {
				docBuilder = docFactory.newDocumentBuilder();
			} catch (ParserConfigurationException e) {
				
				e.printStackTrace();
			}
			
			Document doc =  docBuilder.newDocument();
			Element rootElement = ((org.w3c.dom.Document) doc).createElement("result");
			((Node) doc).appendChild(rootElement);
		    /****** Source : Stack overflow ********/
			ArrayList<Node> ret = new ArrayList<Node>();
			ret = hmap.get(xq);
			System.out.print("Size returned is " +ret.size());
			//System.out.print(ret.get(1).getTextContent()+" .....................");
			//System.out.println(ret);
			Util uu=new Util();
			ret= uu.remove_duplicates(ret);
			for(int i=0;i< ret.size();i++)
			{
				Node nw= (Node) ((org.w3c.dom.Document) doc).adoptNode(ret.get(i));
				rootElement.appendChild(nw);
			}
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = null;
			try {
				transformer = transformerFactory.newTransformer();
			} catch (TransformerConfigurationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			DOMSource source = new DOMSource((Node) doc);
			StreamResult result = new StreamResult(new File("intermediate_file.xml"));
			try {
				transformer.transform(source, result);
			} catch (TransformerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			String output = readFile("intermediate_file.xml", StandardCharsets.UTF_8);
			//System.out.println(prettyFormat(output, 4));
			//PrintWriter out = new PrintWriter("r_output_file.xml");
			PrintWriter out = new PrintWriter("new_op.xml");
			out.println(u.prettyFormat(output, 4));
			out.close();
		  
		
		

	}

}
