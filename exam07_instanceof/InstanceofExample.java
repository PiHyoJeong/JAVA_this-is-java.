package sec07.exam07_instanceof;

public class InstanceofExample {

	public static void method1(Parent parent) {  
	
		if(parent instanceof Child) { //parent��� ������ �����ϴ� ��ü�� Child Ŭ�����κ��� ����������� chk.
			Child child = (Child) parent;
			System.out.println("method1 - Child �� ��ȯ ����");
		}else {
			System.out.println("method1 - Child �� ��ȯ���� ����");
		}
	}
		
	

	
	
	
	public static void main(String[] args) {
		Parent parentA = new Child(); //Parent �� �ڵ� Ÿ�� ��ȯ
		method1(parentA); //method1() �Ű������� Child ��ü�� ���Եȴ�. �׷��� true ���� ��ȯ �����Ѵ�.
		
		
		Parent parentB = new Parent(); //Parent ��ü
		method1(parentB); ///method1() �Ű������� Parent ��ü�� ���Եȴ�. �׷��� false���� ��ȯ���� �ʴ´�.
	
	}
	

}
