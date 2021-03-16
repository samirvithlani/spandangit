package thread;

public class ThreadDemo3 extends Thread {

	public void run() {

		if (Thread.currentThread().getName().equals("A")) {

			for (int i = 1; i <= 10; i++) {

				System.out.println("value of i =" + i);
				if (i == 5) {

					try {
						System.out.println(Thread.currentThread().getName() + "..is going to sleep");
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

		if (Thread.currentThread().getName().equals("B")) {

			for (int i = 100; i <= 110; i++) {

				System.out.println("value of i =" + i);
				if (i == 105) {

					try {
						System.out.println(Thread.currentThread().getName() + "..is going to sleep");
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		if (Thread.currentThread().getName().equals("c")) {

			for (int i = 1000; i <= 1010; i++) {

				System.out.println("value of i =" + i);
				if (i == 1005) {

					try {
						System.out.println(Thread.currentThread().getName() + "..is going to sleep");
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

	}

	public static void main(String[] args) {

		ThreadDemo3 t1 = new ThreadDemo3();
		ThreadDemo3 t2 = new ThreadDemo3();
		ThreadDemo3 t3 = new ThreadDemo3();

		t1.setName("A");
		t2.setName("B");
		t3.setName("C");

		t1.start();
		t2.start();
		t3.start();

	}
}
