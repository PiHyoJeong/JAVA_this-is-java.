package sec03.exam01_equals;

public class Member {
	public String id;
	
	
	public Member(String id) {
		this.id = id;
	}
	
	//재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
			
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return id.hashCode(); //문자열이 동일할 경우에 동일한 hashcode가 얻어진다.
	}

}
