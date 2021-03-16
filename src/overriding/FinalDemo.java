package overriding;

/*
 * local variable
 * instance variable/class level
 * 
 * final variable
 * */
public class FinalDemo {

	
	final int a=12;
	int b;
	
	public void add(){
		
		b = 20;
		//a = 100;
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		
		
		
	}
}
