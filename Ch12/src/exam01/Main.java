package exam01;

public class Main {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			System.out.println("Downloading!!!");
			try {
				Thread.sleep(5005);
			} catch (InterruptedException e) {}
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Drawinging!!!");
			try {
				Thread.sleep(5005);
			} catch (InterruptedException e) {}
		}
		
	}

}
