package lambda;

interface msg{
	
	//public abstract
	//without return type with atgument...
	void messaging(int a,int b);
}

public class Demo3 {

	
	public static void main(String[] args) {
		
		msg m =(a,b)->{
			
			System.out.println("value of a ="+a);
		};
		m.messaging(12,25);
		
	}
}
