package sec04.exam02_default_nethod_use;

public class Audio implements RemoteControl {
	
	private int volume;
	private boolean mute;
	
	@Override
	public void turnOn() {
		System.out.println("������� �մϴ�.");

	}

	@Override
	public void turnOff() {
		System.out.println("������� ���ϴ�.");
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
		System.out.println("���� ����� ���� : " + this.volume);
	}

	@Override
	public void setMute(boolean mute) { //������ �� �� default Ű����� ������ �ʴ´�. �������̽����� ����Ʈ �޼ҵ带 ������ �� ���.
		this.mute = mute;
		if(mute) {
			System.out.println("Audio ���� ó���մϴ�.");
		}else {
			System.out.println("Audio ���� �����մϴ�.");
		}
	}

	
}
