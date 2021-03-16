package thread;

class Table {

	public synchronized void printTable(int no) {

		for (int i = 1; i <= 10; i++) {

			System.out.println(no + " * " + i + " = " + no * i);
		}
	}
}

class Thread1 extends Thread {

	Table t;

	public Thread1(Table t) {

		this.t = t;
	}

	@Override
	public void run() {

		t.printTable(10);

	}

}

class Thread2 extends Thread {

	Table t;

	public Thread2(Table t) {

		this.t = t;
	}

	public void run() {

		t.printTable(100);
	}
}

public class ThreadDemo5 {

	public static void main(String[] args) {

		Table t = new Table(); // t
		Thread1 t1 = new Thread1(t);
		Thread2 t2 = new Thread2(t);

		t1.start();
		t2.start();

	}
}
