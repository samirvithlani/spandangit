package lambda;

interface Calc{
	
	//public absttartc int sum()
	int sum(int a,int b);
}
public class Demo4 {

	
	public static void main(String[] args) {
		
		Calc c =(a,b)->{
			
			return a + b;
		};
		
		System.out.println(c.sum(12, 22));
	}
}
