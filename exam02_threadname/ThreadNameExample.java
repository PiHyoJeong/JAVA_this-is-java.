package sec02.exam02_threadname;

public class ThreadNameExample {

	public static void main(String[] args) {
		Thread thread = Thread.currentThread(); 
		System.out.println("���α׷� ���� ������ �̸� : " + thread.getName());
		
		
		
		Thread threadA = new ThreadA();
		System.out.println("ThreadA�� ������ ������ : " + Thread.currentThread().getName());
		threadA.start();
		
		
		
		Thread threadB = new ThreadB();
		System.out.println("ThreadB�� ������ ������ : " + Thread.currentThread().getName());
		threadB.start();

	}

}