package sec04.exam01;

import java.io.IOException;
import java.util.Scanner;
public class exam01 {

	public static void main(String[] args) {

//		      while(true) (
//		      try (
//		            int code = System.in.read();
//		            System.out.println("Code : " + code);
//		            if(code == 'q') break;
//		            
//		            ) catch (IOExeption e) (
//		                  e.printStackTrace();
//		            )
		//   }

		         java.util.Scanner scan = new Scanner(System.in);
		         
//		         while(true) {
//		            int code = scan.nextInt();
//		            System.out.println("Code : " + code);
//		            if(code == 'q') break;
//		            
		         
		         while(true) {
		            int code = scan.nextInt();
		            System.out.println("Code : " + code);
		            if(code.equals("q")) break;

		         
		         }
	}

}
