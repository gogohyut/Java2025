package sec02.exam012;

public class ForSentenceTest {
	
	public static void main(String[] args) {
		Out: for (int x=0; x < 10; x++) {
			for(int y = 0; y < 10; y++) {
				System.out.println("(" + x + ", " + y + ")");
				if(x == 5 && y == 5) break Out;
			}
		}
	}

}
