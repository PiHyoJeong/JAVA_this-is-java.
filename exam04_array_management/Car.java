package sec07.exam04_array_management;

public class Car {
	Tire[] tires = {
			new Tire("�տ���",6),
			new Tire("�տ�����",3),
			new Tire("�ڿ���",2),
			new Tire("�ڿ�����",8)
			
	};
			
		
	int run() {
		System.out.println("�ڵ����� �޸��ϴ�.");
		for(int i = 0 ; i < tires.length ; i++) {
			if(tires[i].roll()==false) {stop(); return (i+1);}
		}
		return 0;
	}
		
		
	
	
	void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
	}
}
