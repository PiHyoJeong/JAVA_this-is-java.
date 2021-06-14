package sec02.exam01_nestedclass_object;

public class A {
	A(){ //������ �����
		System.out.println("A��ü�� ������");
		
		//A��� �����ڿ��� B��� Ŭ������ ����ϰ� �ʹٸ�
		B b = new B(); //b ��� Ŭ���� ������ �����ϰ� B ��ü�� �����.
		b.field1 = 2;
		b.method1();
	}
	
	class B{ //�ν��Ͻ� ��� Ŭ������ B �� ����
		
		int field1; //�ʵ� ����
		
//		static int field2; //static �ʵ�� ������ �� ����.
		
		B(){
			System.out.println("B ��ü�� ������");
		}
		
		void method1() {} //�ν��Ͻ� �޼ҵ� ����
		
//		static void method2() {} //������ �� ����.
		
	}
	
	static class C{
		int field1; //�ν��Ͻ� �ʵ�
		static int field2; //static Ŭ���������� stactic �ʵ带 ���� �� �ִ�.
		
		C(){
			System.out.println("C ��ü�� ������");
		}
		
		void method1() {}
		static void method2() {}
		
		
	}
	
	void method() { //����Ŭ����
		class D {
			int field1;
//			static int field2; //����Ŭ�������� static �ʵ带 ������ �� ����.
			D(){
				System.out.println("D ��ü�� ������");
			}
			void method1() {}
//			static void method() {} //static �޼ҵ带 ������ �� ����.
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
