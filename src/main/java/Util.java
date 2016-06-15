

import java.util.*;
import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
//import org.antlr.v4.runtime.tree.*;
import javax.xml.transform.*;
import java.io.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;


public class Util {

	
	
	public Util() {
		
			
	}
	

	ArrayList<Node> remove_duplicates(ArrayList<Node> a) {
		HashMap<Node,Integer > dupmap = new HashMap<Node,Integer>();
		ArrayList<Node> ret_list = new ArrayList<Node>();
		if(a == null) return a;
		for (int i=0 ; i<a.size();i++){				
			if(dupmap.containsKey(a.get(i))) continue;
			else {
				dupmap.put(a.get(i), 1);
				ret_list.add(a.get(i));					
			}				
		}			
		return ret_list;			
	}
	
	/***** Source : Stack overflow ********/
	public static String prettyFormat(String input, int indent) {
	    try {
	        Source xmlInput = new StreamSource(new StringReader(input));
	        StringWriter stringWriter = new StringWriter();
	        StreamResult xmlOutput = new StreamResult(stringWriter);
	        TransformerFactory transformerFactory = TransformerFactory.newInstance();
	        transformerFactory.setAttribute("indent-number", indent);
	        Transformer transformer = transformerFactory.newTransformer(); 
	        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
	        transformer.transform(xmlInput, xmlOutput);
	        return xmlOutput.getWriter().toString();
	    } catch (Exception e) {
	        throw new RuntimeException(e); // simple exception handling, please review it
	    }
	}

	public static String prettyFormat(String input) {
	    return prettyFormat(input, 2);
	}




	Node makeElement(String tag_name, ArrayList<Node> s) {
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = null;
		try {
			docBuilder = docFactory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Document doc = docBuilder.newDocument();
		Element rootElement = doc.createElement(tag_name);
		Node x = (Node)rootElement;
		for(int i =0 ; i<s.size();i++) {
			
			Node importedNode = doc.importNode(s.get(i), true);	
			rootElement.appendChild(importedNode);		
		}
		
		return x;			
	}
	
	public ArrayList<Node> uniqueNodeList(ArrayList<Node> node_list)
	{
		//System.out.print("\n\nIncoming list"+node_list);
		
		Set<Node> node_set = new HashSet<Node>(node_list);
		ArrayList<Node> final_list = new ArrayList<Node>(node_set);
		//System.out.print("\nUpdated list"+final_list+"\n\n");
		
		return final_list;
	}


		Node make_text(String s){
				
				DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder docBuilder = null;
				try {
					docBuilder = docFactory.newDocumentBuilder();
				} catch (ParserConfigurationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Document doc = docBuilder.newDocument();
				Node rootElement =  doc.createTextNode(s);
				return rootElement;				
		}
		
		
}
