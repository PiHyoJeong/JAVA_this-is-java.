package sec03.exam01_parent_constructor_call;

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("ȫ�浿","123414567",1); 
		//���⼭�� �ڽ� ��ü�� ���� ȣ��������, �����δ� �θ� �����ڰ� ���� ȣ��ȴ�. (Student class ���� super) 
		System.out.println(student.name); //�θ��� �ʵ带 �����޾Ҵ�.
		System.out.println(student.ssn); //�θ��� �ʵ带 �����޾Ҵ�.
		System.out.println(student.studentNo); //�ڽ��� �ʵ带 �����޾Ҵ�.
	}

}
