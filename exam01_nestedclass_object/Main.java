package sec02.exam01_nestedclass_object;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		
		A.B b = a.new B(); //클래스 변수 선언하기, b라는 변수 //A라는 클래스에 접근하려면
		b.field1 = 3;
		b.method1();
		
		A.C c = new A.C(); //클래스 변수 선언하기. A객체가 없어도 바로 접근할 수 있다.
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
		
		a.method();

	}

}
