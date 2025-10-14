package sec04.exam01;

public class Car {
	int gas;
	static int numberOfCars;
	
	
	int minGas; //한바퀴 도는 걍우 필요한 Gas
	String teamName;
	String color;
	
	Car(int gas, int minGas, String teamName, String color) {
		this.gas = gas;
		this.minGas = minGas;
		this.teamName = teamName;
		this.color = color;
		numberOfCars++;
		}
	
	boolean IsLeftGas() {
		if(gas < minGas) {
			System.out.println("연료를 보충해야 합니다.");
			return false;		
		}
		
		System.out.println("한바퀴 더 돌 수 있어요.");
		return true;
	}
	
	void AddGas (int gas) {
		System.out.println("연료 full.");
		this.gas = gas;
	}
	
	void RunOneRound ()
	{
		System.out.println("한바퀴 완주.");
		this.gas -= minGas;	
	}
	
	void ShowNumberOfCars ()
	{
		System.out.println("Number of Cars : " + numberOfCars);
	}
	
//	int plus(int b, int a) {
//		return a + b;
//	}
}