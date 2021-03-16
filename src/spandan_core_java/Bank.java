package spandan_core_java;

//rbi will be parent class
class RBI {

	int amount = 20000;

}

// bank will be child class of RBI class
public class Bank extends RBI {

	public void data() {

		System.out.println(amount);
	}

	public static void main(String[] args) {

		Bank b = new Bank();
		b.data();
	}
}
