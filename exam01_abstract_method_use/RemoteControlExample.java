package sec04.exam01_abstract_method_use;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = null; //인터페이스 변수도 참조변수이기 때문에 구현 객체가 대입되기 전에 null로 초기화 할 수 있다.
		
		rc =  new Television(); //변수에 구현객체 대입
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
	}

}
