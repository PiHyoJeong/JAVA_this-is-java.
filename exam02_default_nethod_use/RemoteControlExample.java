package sec04.exam02_default_nethod_use;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = null; //�������̽� ������ ���������̱� ������ ���� ��ü�� ���ԵǱ� ���� null�� �ʱ�ȭ �� �� �ִ�.
		
		rc =  new Television(); //������ ������ü ����
		rc.turnOn();
		rc.setMute(true);
		//����Ʈ �޼ҵ�� ������ü�� instacne �޼ҵ��̴�. ��� �ص� Ʋ������ �ƴϴ�.
		
//		RemoteControl.setMute(true); �ڷ������̶�� ������ü�� ���Ե��� ������ �̷��� ����� �� ����.
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true); 
	}

}
