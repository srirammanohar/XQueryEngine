

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


public class Util {

	
	
	public Util() {
		// TODO Auto-generated constructor stub
			
	}


	void xml_print(Node node,int number_of_tabs)
	{
		if(node.getChildNodes().getLength() == 0  && node.getNodeType()==Node.TEXT_NODE)
		{
			System.out.println("\t" + node.getNodeValue().toString());
		}
		else
		{
			System.out.println();
			for(int j=0;j<number_of_tabs;j++)
				System.out.print("\t");
			System.out.print("<" + node.getNodeName().toString());
			for(int k=0;k<node.getAttributes().getLength();k++)
			{
				System.out.print(" " + node.getAttributes().item(k).getNodeName() 
						+ "=" + "\"" + node.getAttributes().item(k).getNodeValue() + "\"");
			}
			System.out.print(">");
			
			NodeList child_list = node.getChildNodes();
			for(int i=0;i<child_list.getLength();i++)
			{
				//print_tree(child_list.item(i),number_of_tabs+1);
			}
			for(int j=0;j<number_of_tabs;j++)
				System.out.print("\t");
			System.out.println("</" + node.getNodeName().toString() + ">");
		}
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
	tag_name =	tag_name.substring(1, tag_name.length()-1);
		Document doc = docBuilder.newDocument();
		Element rootElement = doc.createElement(tag_name);
		Node x = (Node)rootElement;
		for(int i =0 ; i<s.size();i++) {
			x.appendChild(s.get(i));
			
			
		}
		
		
		return x;	
		
		
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
