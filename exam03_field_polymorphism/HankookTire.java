package sec07.exam03_field_polymorphism;

public class HankookTire extends Tire {

	public HankookTire(String location,int maxRotation) {
		super(location,maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(maxRotation > accumulatedRotation) {
			System.out.println(location + "HankookTire 타이어의 남은 수명 : " + (maxRotation-accumulatedRotation));
			return true;
		}else {
			 System.out.println(location + "HankookTire 타이어가 펑크가 났습니다.");
			return false;
		}
	}

}
