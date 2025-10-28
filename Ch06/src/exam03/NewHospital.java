package exam03;


public class NewHospital {
	public static void main(String[] args) {
		NewHospital h = new NewHospital ();
		
		Dog dog = new Dog(100);   // 예시
	    h.CheckPatient(dog);
	    h.HealPatient(dog);

	    Cat cat = new Cat(1);     // 예시
	    h.CheckPatient(cat);
	    h.HealPatient(cat);
	}
	

	void CheckPatient(Dog dog) {
		if(dog.IsHealthy()) {
			System.out.println("Healthy!");
		}
		else {
			System.out.println("Sick!");
		}
	}
	
	void HealPatient(Dog dog) {
		dog.Heal();
	}
	void CheckPatient(Cat cat) {
		if(cat.IsHealthy()) {
			System.out.println("Healthy!");
		}
		else {
			System.out.println("Sick!");
		}
	}
	
	void HealPatient(Cat cat) {
		cat.Heal();
	}	
	
}
