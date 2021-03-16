package thread;

import java.util.Scanner;

class Bank {

	double bankbanlance = 20000;
	boolean flag = false;

	public synchronized void withdraw(int amount) {

		System.out.println("welcome to withdraw..");
		System.out.println("pls wait we are checking bank balacne.");
		try {
			wait();
			if (flag == true) {

				this.bankbanlance = this.bankbanlance - amount;
				System.out.println("after withdraw amount =" + bankbanlance);

			} else {

				System.out.println("transation failed..");
				System.out.println("amount =" + amount);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public synchronized boolean checkBalance(int amount) {

		System.out.println("check balacne method called..");
		if (amount > bankbanlance) {

			System.out.println("amount is not sufficient..");
			flag = false;
			notify();

		} else {

			System.out.println("amount is sufficent");
			flag = true;
			notify();
		}
		return flag;

	}

}

class BankThread1 extends Thread {

	Bank b;
	int amount;

	public BankThread1(Bank b, int amount) {

		this.b = b;
		this.amount = amount;
	}

	public void run() {

		b.withdraw(amount);
	}

}

class BankThread2 extends Thread {

	Bank b;
	int amount;

	public BankThread2(Bank b, int amount) {

		this.b = b;
		this.amount = amount;
	}

	public void run() {

		b.checkBalance(amount);
	}
}

public class BankTest {

	public static void main(String[] args) {

		Bank b = new Bank();
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter amount to withdraw..");
		int amount = sc.nextInt();
		BankThread1 t1 = new BankThread1(b, amount);
		BankThread2 t2 = new BankThread2(b, amount);

		t1.start();
		t2.start();

	}
}
