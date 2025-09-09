package sec03.exam01;

public class PromotionTest {

	public static void main(String[] args) {
		byte byteVal = 10;
		int intVal = byteVal;
		//byte byteVall = intVal;
		
		char charVal = 'A';
		//char charVal = 65;
		//System.out.println(charVal);
        int intVall = charVal;
        System.out.println((char)intVall);
        
        byte byteVall = 65;
        int intVal2 = 65;
        char charVal2 = (char)byteVall;
        char charVal3 = (char)intVall;
        //char charVal2 = byteVall;
	}

}
