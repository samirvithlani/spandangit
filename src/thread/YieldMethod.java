package thread;

class MyThread extends Thread {

	public void run() {

		for (int i = 1; i <= 50; i++) {

			Thread.yield();
			System.out.println(Thread.currentThread().getName());
		}

	}

}

public class YieldMethod {

	public static void main(String[] args) {

		MyThread t1 = new MyThread();
		t1.start();
		for (int i = 1; i <= 50; i++) {

			System.out.println(Thread.currentThread().getName());
		}
	}
}
