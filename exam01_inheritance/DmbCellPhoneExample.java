package sec02.exam01_inheritance;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���","����",10); //�ڽ� ��ü ����

		System.out.println("�� : " + dmbCellPhone.model); //�θ��� �ʵ带 ���� �� �ִ�.
		System.out.println("���� : " + dmbCellPhone.color); //
		
		System.out.println("ä�� : " + dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.powerOff();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("�ȳ��ϼ��� ȫ�浿�Դϴ�.");
		dmbCellPhone.sendVoice("�� �� �ݰ����ϴ�.");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.turnOffDmb();
		dmbCellPhone.changeChannelDmb(12);
	}
	

}
