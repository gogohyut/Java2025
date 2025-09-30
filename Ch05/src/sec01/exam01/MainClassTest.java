package sec01.exam01;

public class MainClassTest {
	
	public static void main(String[] args) {
		Student stl = new Student();
//		st1.SayHello();
		Car c = new Car("kia", 200);
//		c.SetMaxSpeed(100);
//		c.ShowInfo();
				
		Calcul cal = new Calcul();
		double val = cal.addDouble(1.0,  2.0);
		System.out.println("value" + val);
				
	}

}
