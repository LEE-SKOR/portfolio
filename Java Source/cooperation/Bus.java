package cooperation;

public class Bus {
	private int busNumber;//������ȣ
	private int passengerCount;//�°���
	private int money;//����
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	public void take(int money) {//�°��� ���� ���� ž��
		this.money += money;//��������
		passengerCount++;//�°� �� ����
	}
	public void showInfo() {
		System.out.println("���� "+busNumber);
		System.out.println("�°� "+passengerCount);
		System.out.println("���� "+money);
	}
	
}
