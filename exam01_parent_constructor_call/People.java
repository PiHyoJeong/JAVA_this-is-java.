package sec03.exam01_parent_constructor_call;

public class People {
	public String name;
	public String ssn;
	
	//������
	public People(String name,String ssn) { //�̸��� �ֹι�ȣ�� �޾Ƽ� 
		this.name= name;					//�ʵ尪���� �ʱ�ȭ�ϱ�
		this.ssn =ssn;
		System.out.println("�θ� ��ü ���� �Ϸ�");
	}
}
