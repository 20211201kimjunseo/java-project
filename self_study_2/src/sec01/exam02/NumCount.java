package sec01.exam02;

public class NumCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 5;
		
		int sum = num1 + num2;
		
		// 연산자 우선순위로 인해 문자열로 타입변환이되어 105가 됨
		System.out.println("num1 + num2 = " + num1 + num2);
		System.out.println("num1 + num2 = " + num1 + " + " + num2 + " = " +sum);
		
		for (int count = 0; count <= 3; count++) {
			System.out.println("현재 카운트 : " + count);
		}
		
	}

}
