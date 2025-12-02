package exam03;

public class Drawing extends Thread {
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Drawinging!!!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}
