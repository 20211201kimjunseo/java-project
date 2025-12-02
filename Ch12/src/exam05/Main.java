package exam05;

public class Main {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		User juer1 = new User("User 1");
		juer1.setCalculator(cal, 100);
		juer1.start();
		
		User juer2 = new User("User 2");
		juer2.setCalculator(cal, 50);
		juer2.start();
	}

}
