package overriding;

abstract class sbi{

	abstract void deposit();
	abstract void withdraw();
	
	void checkbal(){
	
		System.out.println("sbi check bal call");
		
	}
	
}
class ICICI extends sbi{

	void checkbal(){
		
		System.out.println("icici check bal call");
	}
	void deposit() {
	
		System.out.println("icici deposit method called..");
	}

	
	void withdraw() {
	
		System.out.println("withdraw mwthod called...");
	}
	
	
}
class HDFC extends sbi{

	
	void deposit() {
		// TODO Auto-generated method stub
		
	}

	
	void withdraw() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
public class BankTest2 {

	public static void main(String[] args) {
		
		sbi s =new ICICI();
		s.deposit();
		s.withdraw();
		
		s.checkbal();
	}
}

