package sec03.exam02_noname_implement_class;

import sec03.exam01_name_implement_class.RemoteControl;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() { //�߰��� �ʵ�� �޼ҵ�� Ŭ���� ���� �� ���ʿ����� ��� �����ϴ�.

			public int volume; //�߰��� �ʵ�

			@Override
			public void turnOn() { //RemoteControl �������̽��� ����� �߻�޼ҵ� ������
				System.out.println("TV�� �մϴ�.");
			}

			@Override
			public void turnOff() {
				System.out.println("TV�� ���ϴ�.");
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
				System.out.println("���� TV ���� ; " + this.volume);
			}
			public void otherMethod() {}; //�߰��� �޼ҵ�
		};
		RemoteControl r2c = new RemoteControl() { //�߰��� �ʵ�� �޼ҵ�� Ŭ���� ���� �� ���ʿ����� ��� �����ϴ�.

			public int volume; //�߰��� �ʵ�

			@Override
			public void turnOn() { //RemoteControl �������̽��� ����� �߻�޼ҵ� ������
				System.out.println("TV�� �մϴ�.");
			}

			@Override
			public void turnOff() {
				System.out.println("TV�� ���ϴ�.");
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
				System.out.println("���� TV ���� ; " + this.volume);
			}
			public void otherMethod() {}; //�߰��� �޼ҵ�
		};

	}

}


//package sec03.exam02_noname_implement_class;
//
//public class RemoteControlExample {
//
//	public static void main(String[] args) {
//		RemoteControl rc = new RemoteControl() {  //�������̽� ���� ���� = ������ü ����
//										//RemoteControl() �� �����ϴ� Ŭ������ {} ���� �����ϰڴ�.
										//{} Ŭ������ �����԰� ���ÿ� �� Ŭ������ �����ڸ� ȣ���ؼ� ��ü�� ����ڴ� ��� ��.
										//RemoteControl �������̽��� ����� �߻�޼ҵ带 �������ؾ��Ѵ�..
//			@Override //������ �߻�޼ҵ� ������
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
