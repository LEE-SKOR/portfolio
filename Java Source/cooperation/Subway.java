package cooperation;

public class Subway {
	private String subwayNumber;//����ö ��ȣ
	private int passengerCount;//�°���
	private int money;//����
		
	public Subway(String subwayNumber) { 
		this.subwayNumber = subwayNumber;
	}
	public void take(int money) {//�°��� ���� ���� ž��
		this.money += money;//��������
		passengerCount++;//�°� �� ����
	}
	public void showInfo() {
		System.out.println("����ö "+subwayNumber);
		System.out.println("�°� "+passengerCount);
		System.out.println("���� "+money);
	}
	
}