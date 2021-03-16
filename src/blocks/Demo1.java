package blocks;

public class Demo1 {

	static int a;
	int x;
	static{

		
		System.out.println("staic block..."+a);
		///System.out.println(x); error
	}
	
	{
		System.out.println(a);
		System.out.println(x);
		System.out.println("instance block..");
	}

	public Demo1() {

		System.out.println("default const called..");
	}

	public static void main(String[] args) {

		System.out.println("main method..");

		//instacne block per object...
		Demo1 d1 = new Demo1();
		Demo1 d2 = new Demo1();
		
	
	}
}
