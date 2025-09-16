package sec01.exam03;

public class ForTest {
	public static void main(String[] args) {
		for(int x = 0; x < 10; x ++) {
			Out: for(int y = 0; y < 10; y++) {
				System.out.println("(" + x + ", " + y + ")");
				if(x == 5 && y == 5) break Out;
			}
		}
	}

}
