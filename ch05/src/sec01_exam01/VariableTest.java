package sec01_exam01;

public class VariableTest {
	public static void main(String[] args) {
		int a;
		int b = a;
//		오류 발생
		
		String str1 = null;
		String str2 = str1;
	
		System.out.println("Hi.");
		
		int[] intArray = null;
		intArray[0] = 10;
//		못잡아줌
		
	}

}
