package enums;
/*
 * enum is nothing but a class
 * but all variables declare inside enum consider object of class
 * all objects are final static
 * */

enum Menu {

	roti(10), sabji(25), dal(30); // object of enums
	
	Menu(int value) {

		val = value;
	}

	int val;

}

public class HotelMenu {

	public static void main(String[] args) {

		System.out.println(Menu.sabji.val);

	}
}
