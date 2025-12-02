package exam02;

public class Main {

	public static void main(String[] args) {
//		jsRunnable drawing = new Drawing();
//		jsThread thread = new Thread(drawing);
//		thread.start();
		
		Thread jsthread = new Thread(
			new Runnable() {
				public void run() {
					for(int i = 0; i < 5; i++) {
						System.out.println("Drawinging!!!");
					try {
						Thread.sleep(5005);
						} catch (InterruptedException e) {}
					}
				}
			}
				
		);
		jsthread.start();
		
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Downloading!!!");
			try {
				Thread.sleep(5005);
			} catch (InterruptedException e) {}
		}
		
	}

}
