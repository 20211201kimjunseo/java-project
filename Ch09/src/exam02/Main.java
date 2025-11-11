package exam02;

public class Main {

	public static void main(String[] args) {
		Button callBtn = new Button();
		callBtn.SetOnClickListener(new CallListener());
		callBtn.Touch();
		
		Button msgBtn = new Button();
		msgBtn.SetOnClickListener(new MessageListener());
		msgBtn.Touch();
	}
}
//js.Ch09.exam02