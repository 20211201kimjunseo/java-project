package sec01.exam01;

public class Main {

	public static void main(String[] args) {
		Car car; //= new Car(100);
		Truck truck = new Truck(80, 200);
		
//		car.ShowSpeed();
		car = truck;
		truck.ShowSpeed();
		car.ShowSpeed();
		
		
		System.out.println("car speed is " + car.speed);
		System.out.println("truck speed is " + truck.speed);
		
	}

}
