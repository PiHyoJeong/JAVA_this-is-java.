package sec03.exam01_name_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
//		rc = new RemoteControl(); //X
		rc = new Audio();
		rc = new Television();

		rc.turnOn();
	}

}
