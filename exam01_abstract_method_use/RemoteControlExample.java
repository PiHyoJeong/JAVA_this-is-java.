package sec04.exam01_abstract_method_use;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = null; //�������̽� ������ ���������̱� ������ ���� ��ü�� ���ԵǱ� ���� null�� �ʱ�ȭ �� �� �ִ�.
		
		rc =  new Television(); //������ ������ü ����
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
	}

}
