package exam04.ex;

public class Main {

    public static void main(String[] args) {

        Button callBtn = new Button();
        callBtn.SetOnClickListener(
            new Button.OnClickListener() {
                @Override
                public void OnClick() {
                    System.out.println("Make a phone call!!");
                }
            }
        );
        callBtn.Touch();


        Button msgBtn = new Button();
        msgBtn.SetOnClickListener(
            new Button.OnClickListener() {
                @Override
                public void OnClick() {
                    System.out.println("Send a message!!");
                }
            }
        );
        msgBtn.Touch();
    }
}
