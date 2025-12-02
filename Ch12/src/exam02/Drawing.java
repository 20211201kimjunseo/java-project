package exam02;

public class Drawing implements Runnable {
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("kDrawinging!!!");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {}
		}
	}
}

