package car.racing;

// abstract를 넣어줘도 됨
public class WetTire extends Tire{
	WetTire(int capacity, int consume){
		super(capacity, consume);
	}
	
	boolean IsAvailable() {
		return capacity - consume > 0;
		
	}
}
