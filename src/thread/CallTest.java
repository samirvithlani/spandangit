package thread;

class Call {

	public synchronized void runningCall() {

		System.out.println("call is running...");
		System.out.println("new call is on wait..");
		System.out.println("running call is put on hold..");
		try {
			// Object class
			wait();
			System.out.println("holded call recived..");
			System.out.println("call over...");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	//myThread wait...

	public synchronized void newCall() {

		System.out.println("new call recived..");
		System.out.println("new call is running");
		System.out.println("new call is about to finish");
		System.out.println("new call is over...");
		notify();

	}
}

class MyThread1 extends Thread {

	Call c;

	public MyThread1(Call c) {

		this.c = c;
	}

	public void run() {

		c.runningCall();
	}
}

class MyThread2 extends Thread {

	Call c;

	public MyThread2(Call c) {

		this.c = c;
	}

	public void run() {

		c.newCall();
	}
}

public class CallTest {

	public static void main(String[] args) {

		Call c = new Call();
		MyThread1 t1 = new MyThread1(c);
		MyThread2 t2 = new MyThread2(c);

		t1.start();
		t2.start();

	}

}
