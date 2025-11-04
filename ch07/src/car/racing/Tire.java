package car.racing;

// interface로 넣어도됨
public abstract class Tire {
	int capacity;
	int consume;
	
	Tire(int capacity, int consume){
		this.capacity = capacity;
		this.consume = consume;
	}
	
	void UseTire() {
		capacity -= consume;
	}
	
//	boolean IsAvailable() {
//		return capacity - consume > 0;
//	}
	
	abstract boolean IsAvailable();
}
