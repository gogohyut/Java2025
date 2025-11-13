package exam03;

public class Main {

	public static void main(String[] args) {
		Button btn = new Button();
		Button.OnClickListener CallListener =
				new Button.OnClickListener() {
					public void OnClick() {
						System.out.println("Make a call!!");
					}
		};
		btn.SetOnClickListener(CallListener);
		btn.Touch();
		
		btn.SetOnClickListener(
				new Button.OnClickListener() {
					public void OnClick() {
						System.out.println("Send a message!!");	
				}
			}
		);
		btn.Touch();
		
	}
}