package car.racing;

public abstract class Tire {
	int capacity;
	int consume;
	
	Tire(int capacity, int consume) {
		this.capacity = capacity;
		this.consume = consume;
	}
	
	void UseTire() {
		capacity -= consume;
	}
	
//	boolean IsAbailable() {
//		return capacity - consume > 0;
//  }	
	abstract boolean IsAbailable();	

}
