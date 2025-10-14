package sec03.exam01;

public class MainClass {
	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car("Hyundai");
		Car c3 = new Car("Kia", "Sedan");
		Car c4 = new Car("Kia", "truck", 150);
		
		
		c1.ShowInfo();
		c2.ShowInfo();
		c3.ShowInfo();
		c4.ShowInfo();
		System.out.println("");
		System.out.println("");
	}

}
