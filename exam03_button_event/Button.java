//package sec04.exam01_nestedinaterface;
//
//public class Button {
//	OnclickListener listener;
//	
//	void setOnClickListener(OnclickListener listener) { //setter. 
//		this.listener = listener; //매개변수를 필드에 대입
//	}
//	
//	void touch() { //
//		listener.onClick();
//	}
//	
//	interface OnclickListener{ //중첩인터페이스 선언. 구현객체에 실체 메소드를 실행시키는 중간 역할.
//		void onClick(); //추상메소드
//	}
//}


package sec05.exam03_button_event;

public class Button {

	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void ontouch() {
		listener.onClick();
	}

	interface OnClickListener{
		void onClick();
	}
	
}
