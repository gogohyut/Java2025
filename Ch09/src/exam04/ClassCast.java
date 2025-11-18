package exam04;

public class ClassCast {

	public static void main(String[] args) throws Exception {
		Cat cat = new Cat();
		//ChangeDog(cat);
		Method();
		
		System.out.println("Program is running");
		
	}
	
	public static void ChangeDog(Animal anima) {
		Dog dog = (Dog)anima;
	}
	
	public static void Method() throws NumberFormatException {
		System.out.println("Hi");
	}

}
