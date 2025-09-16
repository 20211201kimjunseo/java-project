package sec02;
import java.util.Scanner;
public class exam02 {


		public static void main(String[] args) {
	        byte vall = 1;
	        byte val2 = 2;
	        //byte val3
	        int sum = vall + val2;
	        System.out.println("1/2 : " + 1 / 2);
	        System.out.println("1.0/2.0 : " + 1.0 / 2.0);
	        String str = "10";
	        // ant result = vall + str;
	        int result = vall + Integer.parseInt(str);
	        System.out .println(result);
	        String str2 = "10";
	        int value = 20;
	        String stri = str2 + value;
	        String str1 = "" + value;
	        int result2 = vall + Integer.parseInt(str2);
	        //java.util.Scanner scanner;
	        // 1/java.util.는 스킵 가능 
	        Scanner scanner = new Scanner(System.in);
	        int input = scanner.nextInt();
	        System.out.println(input);
	   }
}
