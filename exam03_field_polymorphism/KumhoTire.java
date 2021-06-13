package sec07.exam03_field_polymorphism;

public class KumhoTire extends Tire {

	public KumhoTire(String location,int maxRotation) {
		super(location,maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(maxRotation > accumulatedRotation) {
			System.out.println(location + "KumhoTire Ÿ�̾��� ���� ���� : " + (maxRotation-accumulatedRotation));
			return true;
		}else {
			 System.out.println(location + "KumhoTire Ÿ�̾ ��ũ�� �����ϴ�.");
			return false;
		}
	}

}
