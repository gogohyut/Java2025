package sec01.exam01;

public class Truck extends Car {
	int speed;
	int load;
	
	Truck(int speed, int load) {
		super(speed);
//		this.speed = speed;
		this.load = load;
		
	}

//	void ShowSpeed(int speed, int load) {
//		System.out.println("Truck speed :" + speed);
//	}
	
	void ShowSpeed() {
		System.out.println("Truck speed :" + speed);
	}
//	
//	void ShowLoad() {
//		System.out.println("Load : " + load);
		
//	}
}
