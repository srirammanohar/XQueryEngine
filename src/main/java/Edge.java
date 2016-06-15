import org.antlr.v4.runtime.misc.Pair;

public class Edge {

	Pair <Vertex,Vertex> ed;
	String weight = "";
	public Edge(Pair<Vertex, Vertex> p, String substring) {
		// TODO Auto-generated constructor stub
		ed=p;
		weight = substring;
		
		
	}

	void printEdge(){
		
		System.out.println("Edge b/n vertex " + ed.a.a + "	and	" + ed.b.a + "is	" + this.weight);
		
		
	}
}
