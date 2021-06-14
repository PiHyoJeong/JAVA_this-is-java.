package sec07.exam01_why_default_method;

public interface MyInterface {
	public void method1();
	
//	public void method2(); //추상 method2를 추가하면 MyClassA에서 err가 난다.
	
	public default void method2() { //default method2 를 추가해도 err가 나지 않는다.
		
	}
}
