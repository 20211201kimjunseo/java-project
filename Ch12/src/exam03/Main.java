package exam03;

public class Main {

	public static void main(String[] args) {
//		kjsThread thread = new Drawing();
		Thread jsthread = new Thread() {
			public void run() {
				for(int i = 0; i < 5; i++) {
					System.out.println("Drawinging!!!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {}
				}
			}
		};
		jsthread.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Downloading!!!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}	
	}		
}
