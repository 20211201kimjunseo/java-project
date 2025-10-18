package sec01.exam04;

public class IntByte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte b = 5; 산술연산에 사용되면 int로 자동타입변환됨.
		int b = 5;
		b = -b;
		int result = 10/b;
		System.out.println(result);
		
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
