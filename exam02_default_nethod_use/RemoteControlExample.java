package sec04.exam02_default_nethod_use;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = null; //인터페이스 변수도 참조변수이기 때문에 구현 객체가 대입되기 전에 null로 초기화 할 수 있다.
		
		rc =  new Television(); //변수에 구현객체 대입
		rc.turnOn();
		rc.setMute(true);
		//디폴트 메소드는 구현객체의 instacne 메소드이다. 라고 해도 틀린말은 아니다.
		
//		RemoteControl.setMute(true); 텔레비젼이라는 구현객체가 대입되지 않으면 이렇게 출력할 수 없다.
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true); 
	}

}
