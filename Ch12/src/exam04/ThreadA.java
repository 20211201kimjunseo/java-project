package exam04;

public class ThreadA extends Thread {
	public ThreadA() {
		setName("Drawing thread");
	}
	
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Drawinging!!!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}
