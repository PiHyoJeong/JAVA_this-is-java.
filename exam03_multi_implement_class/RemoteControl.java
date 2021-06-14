package sec03.exam03_multi_implement_class;

public interface RemoteControl {
	//상수선언
		int MAX_VOLUME = 10;
		int MIN_VOLUME = 0;
		
		//추상메소드 선언
		void turnOn();
		void turnOff();
		void setVolume(int volume);
		
		//디폴트메소드 선언
		default void setMute(boolean mute) {
			if(mute) {
				System.out.println("무음처리합니다.");
			}else {
				System.out.println("무음해제합니다.");
			}
		}
		
		//정적메소드 선언
		static void changeBattery() {
			System.out.println("건전지를 교환합니다.");
		}
}
