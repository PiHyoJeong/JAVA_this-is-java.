package sec03.exam01_parent_constructor_call;
//
//public class Student extends People {
//
//	public Student() {
//		super("ȫ�浿","1222234"); //�θ�����ڸ� ȣ���ؾ߸� �Ѵ�.
//		
//	}
//	
//}


//�ܺο��� ���� �ְ�ʹٸ�, Student(String name,String ssn) { super(name,ssn) } �̴�.
//public class Student extends People {
//
//	public Student(String name, String ssn) {
//		super(name, ssn); 
//		
//	}
//	
//}


public class Student extends People {

	//�ڽ� class ���� �߰������� �ʵ带 ���� �� �ִ�.
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); 
		this.studentNo = studentNo;
		System.out.println("�ڽ� ��ü ���� �Ϸ�");
	}
	
}
