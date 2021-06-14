package sec04.exam02_default_nethod_use;

public class Audio implements RemoteControl {
	
	private int volume;
	private boolean mute;
	
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
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
		System.out.println("현재 오디오 볼륨 : " + this.volume);
	}

	@Override
	public void setMute(boolean mute) { //재정의 할 때 default 키워드는 붙이지 않는다. 인터페이스에서 디폴트 메소드를 선언할 때 사용.
		this.mute = mute;
		if(mute) {
			System.out.println("Audio 무음 처리합니다.");
		}else {
			System.out.println("Audio 무음 해제합니다.");
		}
	}

	
}
