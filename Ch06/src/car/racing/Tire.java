package car.racing;

public class Tire {
	int capacity;
	int consume;
	
	Tire(int capacity, int consume) {
		this.capacity = capacity;
		this.consume = consume;
	}
	
	void UseTire() {
		capacity -= consume;
	}
	
	boolean IsAbailable() {
		return capacity - consume > 0;
		
	}
}
