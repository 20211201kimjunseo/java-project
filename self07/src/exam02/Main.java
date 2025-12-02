package exam02;

public class Main {

	public static void main(String[] args) {
		
		Phone phone = new Phone("삼성", "갤럭시", 47);
		
		System.out.println(phone.model);
		System.out.println(phone.color);
		System.out.println(phone.channel);
		
		phone.powerOn();
		phone.powerOff();
		phone.sendVoice("크랙");
		phone.turnOnDmb();
		

	}

}
