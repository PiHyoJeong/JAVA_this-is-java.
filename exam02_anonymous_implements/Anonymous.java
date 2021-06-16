package sec05.exam02_anonymous_implements;

public class Anonymous {
	RemoteControl field = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("tv �� �մϴ�.");
		}

		@Override
		public void turnOff() {
			System.out.println("tv�� ���ϴ�.");
		}
		
	};
	
	void method1() {
		RemoteControl localVar = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("audio�� �մϴ�.");
			}

			@Override
			public void turnOff() {
				System.out.println("audio�� ���ϴ�.");
				
			}
			
		};
		localVar.turnOn();
		localVar.turnOff();
	}
	
	
		void method2(RemoteControl rc) {
			rc.turnOn();
			rc.turnOff();
		}
}
