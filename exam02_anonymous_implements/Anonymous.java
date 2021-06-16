package sec05.exam02_anonymous_implements;

public class Anonymous {
	RemoteControl field = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("tv ¸¦ ÄÕ´Ï´Ù.");
		}

		@Override
		public void turnOff() {
			System.out.println("tv¸¦ ²ü´Ï´Ù.");
		}
		
	};
	
	void method1() {
		RemoteControl localVar = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("audio¸¦ ÄÕ´Ï´Ù.");
			}

			@Override
			public void turnOff() {
				System.out.println("audio¸¦ ²ü´Ï´Ù.");
				
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
