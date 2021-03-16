package spandan_core_java;

class SBI {

	int sbibalance = 20000;

	void sbi() {

		System.out.println("sbi balance =" + sbibalance);
	}
}

class ICICI extends SBI {

	// icici
	int icicibalance = 40000;

	void icici() {

		System.out.println("sbi balance =" + sbibalance);
		System.out.println("icici balance =" + icicibalance);

	}
}

class HDFC extends ICICI {

	int hdfcbalance = 50000;

	void hdfc() {

		System.out.println("sbi balance =" + sbibalance);
		System.out.println("icici balance =" + icicibalance);
		System.out.println("hdfc balance =" + hdfcbalance);

	}

}

public class BankTest {

	public static void main(String[] args) {

		//SBI s = new SBI();
		//s.sbi();
		//ICICI i = new ICICI();
		//i.sbi();
		//i.icici();
		HDFC h = new HDFC();
		h.hdfc();
		h.sbi();
		h.icici();
		

	}

}
