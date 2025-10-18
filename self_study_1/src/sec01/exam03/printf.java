package sec01.exam03;

public class printf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value = 123;
		double value1 = 12.4124;
		
		int a = 3;
		int b = 2;
		int ab = a++ + ++b * 2;
		
		System.out.println(ab);
		System.out.printf("value1 : %010.3f\n", value1);
		System.out.printf("value : %06d", value);
		
	}

}
