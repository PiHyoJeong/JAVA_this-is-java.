package sec02.exam01_inheritance;
 
public class DmbCellPhone extends CellPhone { //�θ� class�� ���� package�� �ֱ� ������ �ʵ�� �޼ҵ尡 ��� ��ӵȴ�. 
	int channel;
	
	DmbCellPhone(String model, String color, int channel){
		this.model = model; //�θ� class
		this.color = color; //�θ� class
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("ä��" + channel + "�� DMB ��� ������ �����մϴ�.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä��" + channel + "������ �ٲߴϴ�");
	}
	
	void turnOffDmb() {
		System.out.println("dmb ��� ������ ����ϴ�.");
	}
	
}
