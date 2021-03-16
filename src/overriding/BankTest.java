package overriding;

/*
 * Method - Overriding:-parent class method devlope in child class
 * with same name and parameters called method overriding
 * and method over riding is also called run time polymorephisam
 * 
 * */
class RBI {

	void withdraw() {

		System.out.println("rbi method called..");
	}

}

public class BankTest extends RBI {

	void withdraw() {

		System.out.println("bank test method called..");
	}
	
	public static void main(String[] args) {
		
		BankTest b = new BankTest();
		b.withdraw();
	}

}
