package exam03;

public class NumberFormat {

	public static void main(String[] args) {
		String age1 = "23";
		String age2 = "abc";
		
		int ageValue1;
		int ageValue2;
		
		
		try {
		ageValue1 = Integer.parseInt(age1);
		ageValue2 = Integer.parseInt(age2);
		//10번째 줄에서 문자열을 숫자로 못바꿔서 오류 밣생
		}
		catch(NumberFormatException e) {
			System.out.println("Number Format Error");
			ageValue1 = 0;
			ageValue2 = 0;
			
		}
		
		System.out.println("Your age1 : " + ageValue1);
		System.out.println("Your age2 : " + ageValue2);
		
	}

}
