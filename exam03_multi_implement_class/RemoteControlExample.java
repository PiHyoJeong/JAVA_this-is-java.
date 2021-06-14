package sec03.exam03_multi_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision(); //구현클래스 tv = 객체
		
		RemoteControl rc = tv; //인터페이스 타입의 변수에 대입. 
		rc.turnOff();
		rc.turnOn();
		rc.setVolume(5);
		
		
		Searchable searchable = tv;
		searchable.search("http://www.google.com");

	} //다중인터페이스를 구현한 객체를 생성해서 경우에 따라서 구현 인터페이스 변수에 하나씩 대입을 해서 인터페이스를 통해서 객체를 각각 사용할 수 있음.

}
