package sec07.exam01_why_default_method;

public interface MyInterface {
	public void method1();
	
//	public void method2(); //�߻� method2�� �߰��ϸ� MyClassA���� err�� ����.
	
	public default void method2() { //default method2 �� �߰��ص� err�� ���� �ʴ´�.
		
	}
}
