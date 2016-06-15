import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import org.antlr.v4.runtime.misc.Pair;


public class Graph {
	Vertex root;
	HashSet<String> ret_attr ;

	HashSet<Vertex> vertices;
	HashSet<Pair<Vertex,Vertex>> aux_edges;
	String ret_string;
	HashMap<Vertex,Edge> edges;
	HashMap<Vertex,ArrayList<Vertex>> children;
	HashMap<Vertex,Vertex> parent;
	public Graph() {
		// TODO Auto-generated constructor stub
		vertices = new HashSet<Vertex>();
		edges = new HashMap<Vertex,Edge>();
		children =  new HashMap<Vertex,ArrayList<Vertex>>();
		parent = new HashMap<Vertex,Vertex>();
		aux_edges = new HashSet<Pair<Vertex,Vertex>>();
		ret_string ="";
		ret_attr = new HashSet<String>();

	}

	public void addVertex(Vertex v) {
		// TODO Auto-generated method stub
		vertices.add(v);
		}

	public void addEdge(Edge e) {
		// TODO Auto-generated method stub
		if(!edges.containsKey(e.ed.a)) {
			
			edges.put(e.ed.a,e );
		
		}
	
	    
		if(!children.containsKey(e.ed.b)) {
			ArrayList<Vertex> key = new ArrayList<Vertex>();
			key.add(e.ed.a);
			children.put(e.ed.b,key );
		
		}
		else{
			ArrayList<Vertex> key = children.get(e.ed.b);
			key.add(e.ed.a);
			children.put(e.ed.b,key );
	
		}
		}
	
	
	public ArrayList<Vertex> getChildren(Vertex v){
		
		ArrayList<Vertex> ret_list = new ArrayList<Vertex>();
		if(children.containsKey(v))
		ret_list = children.get(v);
		return ret_list;
		
		
	}
	
	public  void printGraph(){
		
		
	  Iterator<Vertex> i = vertices.iterator(); 
		while(i.hasNext()){
			
			Vertex v = i.next();
			//System.out.println("Vertex is " + v.a);
			//System.out.println("The Children are");
			ArrayList<Vertex> c = new ArrayList<Vertex>();
			c = getChildren(v);
			if(c!= null)
			for(int k=0 ;k < c.size();k++)
				//System.out.println(c.get(k).a);
			//v.printParent();
			if(v.parent != null)
			edges.get(v).printEdge();
			
		}
			
			//System.out.println("Printing Auxillary Edges");
			 Iterator<Pair<Vertex, Vertex>> iter = 	aux_edges.iterator(); 
			while(iter.hasNext()){
				Pair<Vertex, Vertex> p = iter.next();
				//System.out.println(p.a.a + "Connecting" + p.b.a);
				
				
				
			}
				
			}

	public void setRoot(Vertex v) {
		// TODO Auto-generated method stub
		this.root = v;
	}

	public boolean contains(String string) {
		// TODO Auto-generated method stub
		Iterator<Vertex> i = vertices.iterator(); 
		while(i.hasNext()){
			if(i.next().a.equals(string)) return true;
			}
		
		return false;
	}

	public Vertex getVertex(String string) {
		// TODO Auto-generated method stub
		Iterator<Vertex> i = vertices.iterator(); 
		while(i.hasNext()){
			Vertex v = i.next();
			if(v.a.equals(string)) return v;
			
		}
			
		return null;
	}

	public void addAuxilaryEdge(Pair<Vertex,Vertex> p) {
		// TODO Auto-generated method stub
		aux_edges.add(p);
		
		
	}
  
	public boolean isDifferentSubTree(Vertex a, Vertex b){
		HashSet<Vertex> ahs = new HashSet<Vertex>();
		Vertex c = a;
        while(c.parent!=null){
			c = c.parent;
			if(c.parent != null) {
				ahs.add(c);
				}
			
		}
		
		c =b;
		 while(c.parent!=null){
			 c = c.parent;
				if(c.parent != null) {

			    if(ahs.contains(c)) return false;
			 
				}
		 }
		
		return true;
			
	}
	
	
	public Vertex getRoot(Vertex v){
		Vertex c = v;
		while(c.parent!=root)
			c=c.parent;
		
		return c;
			
	}

	public void addRetAttr(String a) {
		// TODO Auto-generated method stub
		ret_attr.add(a);
		
		
	}	
	
	
		
	

}
