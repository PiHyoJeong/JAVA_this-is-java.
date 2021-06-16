//package sec04.exam01_nestedinaterface;
//
//public class Button {
//	OnclickListener listener;
//	
//	void setOnClickListener(OnclickListener listener) { //setter. 
//		this.listener = listener; //�Ű������� �ʵ忡 ����
//	}
//	
//	void touch() { //
//		listener.onClick();
//	}
//	
//	interface OnclickListener{ //��ø�������̽� ����. ������ü�� ��ü �޼ҵ带 �����Ű�� �߰� ����.
//		void onClick(); //�߻�޼ҵ�
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
