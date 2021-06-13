package sec07.exam07_instanceof;

public class InstanceofExample {

	public static void method1(Parent parent) {  
	
		if(parent instanceof Child) { //parent라는 변수가 참조하는 객체가 Child 클래스로부터 만들어졌는지 chk.
			Child child = (Child) parent;
			System.out.println("method1 - Child 로 변환 성공");
		}else {
			System.out.println("method1 - Child 로 변환되지 않음");
		}
	}
		
	

	
	
	
	public static void main(String[] args) {
		Parent parentA = new Child(); //Parent 로 자동 타입 변환
		method1(parentA); //method1() 매개변수에 Child 객체가 대입된다. 그래서 true 여서 변환 성공한다.
		
		
		Parent parentB = new Parent(); //Parent 객체
		method1(parentB); ///method1() 매개변수에 Parent 객체가 대입된다. 그래서 false여서 변환되지 않는다.
	
	}
	

}
