package exam01;

public class Array {

	public static void main(String[] args) {
		
		String[] A = new String[3];
		A[0] = "JAVA";
		A[1] = "JAVA";
		A[2] = new String("JAVA");
		
		System.out.println( A[0] == A[1]);
		System.out.println( A[0] == A[2]);
		System.out.println( A[0].equals(A[1]));
		
		int[] B = {21, 23, 45, 63, 31};
		
		int sum = 0;
		for (int C : B) {
			sum = sum + C;
		}
		System.out.println("총점수 = " + sum);
		
		float D = (float)sum/5;
		
		System.out.println("평균 = " + D);
		
		
	}

}
