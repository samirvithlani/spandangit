package lambda;

//interface only 1 method..
//1 method intrafec called functional interface
interface Drawing{
	
	public abstract void draw();
	//public abstract void draw1();
}
public class Demo2 {

	
	public static void main(String[] args) {
		
		//withoout return type without argument...
		Drawing d = ()->{
			
			System.out.println("drawing..");
			
		};
		d.draw();
		
	}
}
