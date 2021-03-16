package thread;

public class ThreadDemo1 extends Thread {

	public void run() {

		for (int i = 1; i <= 10; i++) {

			System.out.println("thread is running.."+i);
		}
	}

	public static void main(String[] args) {

		ThreadDemo1 t1 = new ThreadDemo1();
		ThreadDemo1 t2 = new ThreadDemo1();
		t1.start();
		
		t2.start();

	}
}
