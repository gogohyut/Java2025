package car.racing;

public class Main {

	public static void main(String[] args) {
		int totalRound = 30;
		int numOfRound = 0;
		Tire tire;
		
		
		Car car = new Car();
		while(numOfRound < totalRound) {
			numOfRound++;
			if(numOfRound == 20) {
				Environment.isRain = true;
			}
			System.out.println("Round : " + numOfRound);
			if(!car.CheckTire()) {
				if(Environment.isRain) {
					tire = new WetTire(100, 30);
					System.out.println("WetTire Change!!");
				}
				else {
					tire = new DryTire(100, 15);
					System.out.println("DryTire Change!!");
				}
//				Tire tire = new Tire(100, 15);
				car.ChangeTire(tire);
			}
			car.Run();
		}
	}

}
