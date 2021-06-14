package sec03.exam01_member_class.access;

public class A {
	class B{}
	static class C{}
	
	//인스턴스 필드 선언
	B field1 = new B();
	C fidel2 = new C();
	
	//인스턴스 메소드 작성
	void method1() {
		B var1 = new B(); //로컬변수
		C var2 = new C(); //로컬변수
	}
	
	//정적 필드 선언
//	static B field3 = new B(); //static이 있기 때문에 A가 없어도 field3이 사용될 수 있어야하는데, B 클래스는 A가 있어야만 쓸 수 있으니 err가 난다.
	static C field4 = new C(); //클래스 C 가 static 으로 선언되어 있어서 A가 없어도 C 객체를 만들 수 있다.
	
	//정적 메소드 선언
	static void method2() {
//		B var1 = new B(); //method2 는 static 이 붙어있다.
		C var2 = new C();
	}
}
