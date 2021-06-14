package sec03.exam03_localclass_access;

public class Outter {

	//자바 7 이전
	public void method1(final int arg) {
		final int localVariable = 1;
		class Ineer{ //method1 이 종료되면 위에는 종료됐지만 Ineer 안에는 실행구성이 남아있었다. 
			void method() {
				//__ int arg = 10; 
				//__ localVariable = 1;
				int result = arg + localVariable;
			}
		}
	}
	
	//자바 8이후
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
