package sec02.exam01_nestedclass_object;

public class A {
	A(){ //생성자 만들기
		System.out.println("A객체가 생성됨");
		
		//A라는 생성자에서 B라는 클래스를 사용하고 싶다면
		B b = new B(); //b 라는 클래스 변수를 선언하고 B 객체를 만든다.
		b.field1 = 2;
		b.method1();
	}
	
	class B{ //인스턴스 멤버 클레스인 B 를 선언
		
		int field1; //필드 선언
		
//		static int field2; //static 필드는 선언할 수 없다.
		
		B(){
			System.out.println("B 객체가 생성됨");
		}
		
		void method1() {} //인스턴스 메소드 선언
		
//		static void method2() {} //선언할 수 없다.
		
	}
	
	static class C{
		int field1; //인스턴스 필드
		static int field2; //static 클래스에서는 stactic 필드를 가질 수 있다.
		
		C(){
			System.out.println("C 객체가 생성됨");
		}
		
		void method1() {}
		static void method2() {}
		
		
	}
	
	void method() { //로컬클래스
		class D {
			int field1;
//			static int field2; //로컬클래스에서 static 필드를 선언할 수 없다.
			D(){
				System.out.println("D 객체가 생성됨");
			}
			void method1() {}
//			static void method() {} //static 메소드를 선언할 수 없다.
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
