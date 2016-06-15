import java.util.ArrayList;

public class Vertex {

	String a ;
	Vertex parent;
	int aux;
	
	
	Vertex(){
		
		a = "";
		parent = null;
		aux = 0;
		
	}
	
	Vertex(String st) {
		this.a = st;
		parent = null;
		aux =0;
			}

	public Vertex(String st, int i) {
		// TODO Auto-generated constructor stub
		this.a = st;
		parent = null;
		aux =i;
		
	}

	public void setParent(Vertex v) {
		// TODO Auto-generated method stub
		
		parent = v;
		
	}
	public void printParent(){
		if(this.parent!=null)
		System.out.println("parent of" + this.a + " is" + this.parent.a);
		else
			System.out.println( this.a + "Has no parent");
		
	}
	
	
	
}
