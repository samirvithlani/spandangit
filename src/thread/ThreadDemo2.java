package thread;

public class ThreadDemo2 extends Thread {

	public void run() {

		for (int i = 1; i <= 5; i++) {

			System.out.println(Thread.currentThread().getName() + "..is printing .." + i);

		}
	}

	//thread
	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());
		ThreadDemo2 t1 = new ThreadDemo2();
		ThreadDemo2 t2 = new ThreadDemo2();

		t1.setName("A");
		t2.setName("B");

		t1.start();  //-->runnable
		
		//current thread non runnable stage
		try {
			Thread.sleep(1000);  ///main --> non runnable
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.start();

	}
}
