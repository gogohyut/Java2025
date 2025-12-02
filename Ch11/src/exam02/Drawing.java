package exam02;

public class Drawing implements Runnable {
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println("Downloading!!!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		
		}
	}
}
