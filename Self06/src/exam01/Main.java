package exam01;

public class Main {

	public static void main(String[] args) {
		
		Car A = new Car();
		
		System.out.println("회사 : " + A.company);
		System.out.println("색 : " + A.color);
		System.out.println("속도 : " + A.speed);
		
		A.speed = 80;
		
		System.out.println("현재 속도 : " + A.speed);
		
		
		

	}

}
