package sec05_try_with_resourced;

public class TryWithResourcesExample {

	public static void main(String[] args) {
		try  (FileInputStream fis = new FileInputStream("file.txt")){
			fis.read();
			throw new Exception();
		}catch(Exception e) {
			System.out.println("���� ó�� �ڵ尡 ����ƽ��ϴ�.");
		}

	}

}
