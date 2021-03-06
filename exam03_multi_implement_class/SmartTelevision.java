package sec03.exam03_multi_implement_class;

public class SmartTelevision implements Searchable, RemoteControl {

	private int volume; //필드
	
	

	@Override //RemoteControl 에 해당되는 추상메소드 
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override //RemoteControl 에 해당되는 추상메소드 
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override //RemoteControl 에 해당되는 추상메소드 
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
	
	@Override
	public void search(String rul) { //Searchable 인터페이스의 추상메소드에 해당되는 실체 메소드
		System.out.println(rul + "을 검색합니다.");
	}

}
