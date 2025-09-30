package sec01.exam01;

public class Car {
	String company;
	int maxspeed;
	int speed;
	int rpm;
	
	public Car() {
	
	}
	
	public Car(String company, int maxspeed)
	{
		this.company = company;
		this.maxspeed = maxspeed;
		
	}
	
	void SetMaxSpeed(int value) {
		maxspeed = value;
	}
	void ShowInfo()
	{
	
		System.out.println("Company :" + company);
		System.out.println("Max Speed :" + maxspeed);
		System.out.println("Current Speed :" + speed);
		System.out.println("Current RPM :" + rpm);
		
	}
	
	void Hi()
	{
		int value = 0;
		System.out.println("Value :" + value);
	}

}
