package sec03.exam03_localclass_access;

public class Outter {

	//�ڹ� 7 ����
	public void method1(final int arg) {
		final int localVariable = 1;
		class Ineer{ //method1 �� ����Ǹ� ������ ��������� Ineer �ȿ��� ���౸���� �����־���. 
			void method() {
				//__ int arg = 10; 
				//__ localVariable = 1;
				int result = arg + localVariable;
			}
		}
	}
	
	//�ڹ� 8����
	public void method2(int arg) {
		int localVariable = 1;
//		arg = 100; //err
//		localVariable = 10; //err
		class Ineer{  
			//__ int arg = 10;
			//__ int localVariable = 1;
			void method() {
				int result = arg + localVariable;
			}
		}
	}
}
