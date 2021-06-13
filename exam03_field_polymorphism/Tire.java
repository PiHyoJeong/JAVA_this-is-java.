package sec07.exam03_field_polymorphism;

public class Tire {
	public int maxRotation; //�ִ�ȸ����
	public int accumulatedRotation; //����ȸ����
	public String location;
	
	public Tire(String location,int maxRotation) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if(maxRotation > accumulatedRotation) {
			System.out.println(location + "Ÿ�̾��� ���� ���� : " + (maxRotation-accumulatedRotation));
			return true;
		}else {
			 System.out.println(location + "Ÿ�̾ ��ũ�� �����ϴ�.");
			return false;
		}
	}
	
}
