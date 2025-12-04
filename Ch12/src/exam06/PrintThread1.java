package exam06;

public class PrintThread1 extends Thread {
	private boolean stop;
	
	public void SetStop(boolean stop) {
		this.stop = stop;
	}
	
	public void run() {
		while(!stop) {
			System.out.println("Running!!");
		}
		
		System.out.println("Terminating!!!");
	}
}

