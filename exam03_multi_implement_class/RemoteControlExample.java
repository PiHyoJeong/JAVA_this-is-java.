package sec03.exam03_multi_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision(); //����Ŭ���� tv = ��ü
		
		RemoteControl rc = tv; //�������̽� Ÿ���� ������ ����. 
		rc.turnOff();
		rc.turnOn();
		rc.setVolume(5);
		
		
		Searchable searchable = tv;
		searchable.search("http://www.google.com");

	} //�����������̽��� ������ ��ü�� �����ؼ� ��쿡 ���� ���� �������̽� ������ �ϳ��� ������ �ؼ� �������̽��� ���ؼ� ��ü�� ���� ����� �� ����.

}
