package exam03;

public class Button {
	OnClickListener listener;
	
	public void SetOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	public void Touch() {
		if(listener != null) {
			listener.OnClick();
		}
	}
	
	interface OnClickListener {
		void OnClick();
	}

}


