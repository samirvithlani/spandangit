package overriding;

/*
 * interface is an fully abstract class
 * all method created inside interface are default public abstract 
 * all variable declare inside interface are default public final static
 * final variable:-
 * */
interface Trust {

	// abstratc public void invest()
	int investment = 25000;

	void invest();

}

interface Gov {

	void tax();
}

/*
 * 1 class extends 2 class we can not create an object of interface...
 */
public class School implements Trust, Gov {

	public void invest() {

		System.out.println("invest method called..");

	}

	public void tax() {

		System.out.println("tax method called..");

	}

	public static void main(String[] args) {

		// parent class reference and child class object

		Trust t = new School();
		Gov g = new School();
		t.invest();
		g.tax();

	}

}
