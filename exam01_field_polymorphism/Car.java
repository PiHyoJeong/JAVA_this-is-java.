package sec05.exam01_field_polymorphism;

public class Car { //인터페이스 Tire 타입으로 선언하고 초기값으로 HankookTire 라는 객체를 만들어서 대입함.
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	void run() { //Tire라는 필드에 roll() 를 호출함. Tire이 인터페이스여서 roll()은 추상메소드임.
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
