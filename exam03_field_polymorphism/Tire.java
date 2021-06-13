package sec07.exam03_field_polymorphism;

public class Tire {
	public int maxRotation; //최대회전수
	public int accumulatedRotation; //누적회전수
	public String location;
	
	public Tire(String location,int maxRotation) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if(maxRotation > accumulatedRotation) {
			System.out.println(location + "타이어의 남은 수명 : " + (maxRotation-accumulatedRotation));
			return true;
		}else {
			 System.out.println(location + "타이어가 펑크가 났습니다.");
			return false;
		}
	}
	
}
