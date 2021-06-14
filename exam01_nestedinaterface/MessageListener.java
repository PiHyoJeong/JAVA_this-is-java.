package sec04.exam01_nestedinaterface;

public class MessageListener implements Button.OnclickListener{

	@Override
	public void onClick() {
		System.out.println("문자를 모냅니다.");
	}
	
}
