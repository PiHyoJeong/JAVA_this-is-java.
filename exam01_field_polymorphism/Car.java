package sec05.exam01_field_polymorphism;

public class Car { //�������̽� Tire Ÿ������ �����ϰ� �ʱⰪ���� HankookTire ��� ��ü�� ���� ������.
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	void run() { //Tire��� �ʵ忡 roll() �� ȣ����. Tire�� �������̽����� roll()�� �߻�޼ҵ���.
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
