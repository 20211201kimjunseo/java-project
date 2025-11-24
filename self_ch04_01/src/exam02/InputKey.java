package exam02;

import java.io.IOException;

public class InputKey {

	public static void main(String[] args) throws IOException {
		
		int Key;
		while(true) {
			Key = System.in.read();
			System.out.println("Key = " + Key);
			if(Key == 113) {
				break;			}
			//q를 입력하면 종료
		}
		
		
		System.out.println("종료");
		
	}

}
