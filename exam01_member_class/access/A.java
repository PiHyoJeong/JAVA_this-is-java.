package sec03.exam01_member_class.access;

public class A {
	class B{}
	static class C{}
	
	//�ν��Ͻ� �ʵ� ����
	B field1 = new B();
	C fidel2 = new C();
	
	//�ν��Ͻ� �޼ҵ� �ۼ�
	void method1() {
		B var1 = new B(); //���ú���
		C var2 = new C(); //���ú���
	}
	
	//���� �ʵ� ����
//	static B field3 = new B(); //static�� �ֱ� ������ A�� ��� field3�� ���� �� �־���ϴµ�, B Ŭ������ A�� �־�߸� �� �� ������ err�� ����.
	static C field4 = new C(); //Ŭ���� C �� static ���� ����Ǿ� �־ A�� ��� C ��ü�� ���� �� �ִ�.
	
	//���� �޼ҵ� ����
	static void method2() {
//		B var1 = new B(); //method2 �� static �� �پ��ִ�.
		C var2 = new C();
	}
}
