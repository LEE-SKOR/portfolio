package cooperation;

public class Taxi {
	
	private String companyName;//������ȣ
	private int passengerCount;//�°���
	private int money;//����
	
	public Taxi(String companyName) {
		this.companyName = companyName;
	}
	public void take(int money) {//�°��� ���� ���� ž��
		this.money += money;//��������
		passengerCount++;//�°� �� ����
	}
	public void showInfo() {
		System.out.println("�ý� "+companyName);
		System.out.println("�°� "+passengerCount);
		System.out.println("���� "+money);
	}
	
}