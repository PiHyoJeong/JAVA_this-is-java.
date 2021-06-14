package sec03.exam02_noname_implement_class;

import sec03.exam01_name_implement_class.RemoteControl;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() { //추가된 필드와 메소드는 클래스 선언 블럭 안쪽에서만 사용 가능하다.

			public int volume; //추가된 필드

			@Override
			public void turnOn() { //RemoteControl 인터페이스에 선언된 추상메소드 재정의
				System.out.println("TV를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("TV를 끕니다.");
			}

			@Override
			public void setVolume(int volume) {
				if(volume>RemoteControl.MAX_VOLUME) {
					this.volume = RemoteControl.MAX_VOLUME;
				}else if(volume<RemoteControl.MIN_VOLUME) {
					this.volume = RemoteControl.MIN_VOLUME;
				}else {
					this.volume = volume;
				}
				System.out.println("현재 TV 볼륨 ; " + this.volume);
			}
			public void otherMethod() {}; //추가된 메소드
		};
		RemoteControl r2c = new RemoteControl() { //추가된 필드와 메소드는 클래스 선언 블럭 안쪽에서만 사용 가능하다.

			public int volume; //추가된 필드

			@Override
			public void turnOn() { //RemoteControl 인터페이스에 선언된 추상메소드 재정의
				System.out.println("TV를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("TV를 끕니다.");
			}

			@Override
			public void setVolume(int volume) {
				if(volume>RemoteControl.MAX_VOLUME) {
					this.volume = RemoteControl.MAX_VOLUME;
				}else if(volume<RemoteControl.MIN_VOLUME) {
					this.volume = RemoteControl.MIN_VOLUME;
				}else {
					this.volume = volume;
				}
				System.out.println("현재 TV 볼륨 ; " + this.volume);
			}
			public void otherMethod() {}; //추가된 메소드
		};

	}

}


//package sec03.exam02_noname_implement_class;
//
//public class RemoteControlExample {
//
//	public static void main(String[] args) {
//		RemoteControl rc = new RemoteControl() {  //인터페이스 변수 선언 = 구현객체 생성
//										//RemoteControl() 를 구현하는 클래스를 {} 같이 선언하겠다.
										//{} 클래스를 선언함과 동시에 그 클래스의 생성자를 호출해서 객체를 만들겠다 라는 뜻.
										//RemoteControl 인터페이스에 선언된 추상메소드를 재정의해야한다..
//			@Override //세개의 추상메소드 재정의
//			public void turnOn() {}
//
//			@Override
//			public void turnOff() {}
//
//			@Override
//			public void setVolume(int volume) {}
//			
//		};
//
//	}
//
//}
