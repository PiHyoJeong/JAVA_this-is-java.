package sec03.exam03_multi_implement_class;

public class SmartTelevision implements Searchable, RemoteControl {

	private int volume; //�ʵ�
	
	

	@Override //RemoteControl �� �ش�Ǵ� �߻�޼ҵ� 
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}

	@Override //RemoteControl �� �ش�Ǵ� �߻�޼ҵ� 
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}

	@Override //RemoteControl �� �ش�Ǵ� �߻�޼ҵ� 
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("���� TV ���� ; " + this.volume);
	}
	
	@Override
	public void search(String rul) { //Searchable �������̽��� �߻�޼ҵ忡 �ش�Ǵ� ��ü �޼ҵ�
		System.out.println(rul + "�� �˻��մϴ�.");
	}

}
