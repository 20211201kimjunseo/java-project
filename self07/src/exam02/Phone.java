package exam02;

public class Phone extends Car {
	int channel;
	
	Phone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 DMB 방송 수신");
	}

}
