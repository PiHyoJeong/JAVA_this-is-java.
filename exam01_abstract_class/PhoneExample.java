package sec08.exam01_abstract_class;

public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone = new Phone(); 생성할 수 없다.
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.enternetSearch();
		smartPhone.turnOff();
		
	}

}
