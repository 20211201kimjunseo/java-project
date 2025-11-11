package exam01;

public class Main {

	public static void main(String[] args) {
		Button callbtn = new Button();
		callbtn.SetOnClickListener(new CallListener());
		callbtn.Touch();
		
		Button mbtn = new Button();
		mbtn.SetOnClickListener(new MessageListener());
		mbtn.Touch();
		
		
	}

}
//js.Ch09.exam01