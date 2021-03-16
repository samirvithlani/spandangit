package thread;

public class ThreadDemo4 extends Thread {

	public void run() {

		System.out.println(Thread.currentThread().getName() + "..is running");
	}

	public static void main(String[] args) throws InterruptedException {

		ThreadDemo4 t1 = new ThreadDemo4();
		ThreadDemo4 t2 = new ThreadDemo4();
		ThreadDemo4 t3 = new ThreadDemo4();
		ThreadDemo4 t4 = new ThreadDemo4();

		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		t4.setName("D");

		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		t4.start();

	}
}
