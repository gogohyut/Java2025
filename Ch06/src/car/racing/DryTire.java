package car.racing;

public class DryTire extends Tire {
	DryTire(int capacity, int consume) {
		super(capacity, consume);
	}
	
	boolean IsAbailable() {
		if(Environment.isRain) return false;
		return capacity - consume > 0;
		
	}
}
