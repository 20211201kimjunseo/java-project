package exam03;

public class Main {

	public static void main(String[] args) {
//		Button callBtn = new Button();
//		callBtn.SetOnClickListener(
//				new Button.OnClickListener() {
//					public void OnClick() { 지난 실습
//						System.out.println("Make a phone call!!");
//					}js.dhuwjod
//				}
//			);
//		callBtn.Touch();
		
		Button btn = new Button();
		Button.OnClickListener callListener = 
				new Button.OnClickListener() {
					public void OnClick() {
						System.out.println("Make a call!!");
					}

				};
		btn.SetOnClickListener(callListener);
		btn.Touch();
		
		btn.SetOnClickListener(
				new Button.OnClickListener() {
					public void OnClick() {
						System.out.println("Send a message!!");
					}
				}
		);
		btn.Touch();
	}
}
