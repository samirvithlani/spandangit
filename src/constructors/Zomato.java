package constructors;

public class Zomato {

	//PARAM constructor...
	//method overloading
	//constructor overloading
	
	//value..
	int price=250;
	
	public Zomato(int price){
		
		System.out.println("param const =>"+price);
	}
	
	public Zomato(int price,int amnt){
		
		System.out.println("param const 2 "+price +"-"+amnt);
	}
	public Zomato(String name){
		
		System.out.println("param const 3"+name);
	}
	
	public Zomato(){
		
		System.out.println("default const.");
	}
	
	public static void main(String[] args) {
		
		Zomato z = new Zomato("pizza");
	}
}
