package exam02;

public class Main {

	public static void main(String[] args) {
		Button callBtn = new Button();
		callBtn.SetOnClickListener(new CallListener());
		callBtn.Touch();
	
		Button mBtn = new Button();
		mBtn.SetOnClickListener(new MessageListener());
		mBtn.Touch();
	}
}
