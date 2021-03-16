package overriding;

class TRAI {

	public void call() {

		System.out.println("trai method..");
	}
}

class JIO extends TRAI{

	public void call() {

		System.out.println("jio call..");
	}
}

class Airtle extends TRAI{

	public void call() {

		System.out.println("airtel call..");

	}

}

public class CallTest {

	public static void main(String[] args) {

		//trai class method call.. jio object create
		//trai parent class jio child trai
		//TRAI REFERENCTR new jio  a class
		TRAI t = new JIO();
		TRAI a = new Airtle();	
		t.call();
		a.call();
		

	}
}
