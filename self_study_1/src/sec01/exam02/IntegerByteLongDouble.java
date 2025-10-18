package sec01.exam02;

public class IntegerByteLongDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 138;
		byte ByteValue = 110;
		int Value = ByteValue;
		
		//long f1 = 1000000000000; 범위를 벗어나서 컴파일 오류 뜸
		long f2 = 1000000000000L;
		
		char CharVar = '가';
		int IntVar = CharVar;
		
		char CharVar1 = 'A';
		int IntVar1 = CharVar1;
		
		//int intValue2 = 10/4.0; 은 컴파일 에러
		double doubleValue3 = 10/4.0;
		
		String str1 = 10 + "2" + 4;
		System.out.println("str1 : " + str1);
		
		
		System.out.println("doubleValue3 : " + doubleValue3);
		System.out.println("A의 유니코드 : " + IntVar1);
		System.out.println("가의 유니코드 : " + IntVar);
		System.out.println("Value : " + Value);
		System.out.println("f2 : " + f2);
	}
	

}
