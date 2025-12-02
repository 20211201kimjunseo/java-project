package exam02;

public class Car {
	String model;
	String color;
	
	void powerOn() {
		System.out.println("전원을 켜다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끄다.");
	}
	
	void sendVoice(String message) {
		System.out.println("자기 : " + message);
	}

}
