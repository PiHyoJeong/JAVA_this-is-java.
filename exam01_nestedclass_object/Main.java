package sec02.exam01_nestedclass_object;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		
		A.B b = a.new B(); //Ŭ���� ���� �����ϱ�, b��� ���� //A��� Ŭ������ �����Ϸ���
		b.field1 = 3;
		b.method1();
		
		A.C c = new A.C(); //Ŭ���� ���� �����ϱ�. A��ü�� ��� �ٷ� ������ �� �ִ�.
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
		
		a.method();

	}

}
