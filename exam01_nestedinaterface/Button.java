package sec04.exam01_nestedinaterface;

public class Button {
	OnclickListener listener;
	
	void setOnClickListener(OnclickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	interface OnclickListener{
		void onClick();
	}
}
