package day04;

public class Bank {
	String name;//�̸�        //��� ����  (���� ����)
	int Money;//�ܾ�
	
	public Bank() {
		
	}
	public Bank(String name,int Money) {
		this.name = name;
		this.Money = Money; 
	}

	
	public void inputMoney(int don) {//�Ա�//don�� ���� ����
		Money += don;
		System.out.println(name+"���� "+Money +"�� �Ա�!");
	}
	
	public void outMoney(int don) {//���
		if(Money<don) {
			System.out.println(name+"�� �ܾ׺���");
			return;//���ǿ� ���������� ����������
		}
			Money -= don;//10000-20000
			System.out.println(don +"�� ���!");	
		}
	
	public void getMoney() {//�ܾ�Ȯ��
			System.out.println(name+"���� �ܾ��� "+ Money +"�� �Դϴ�.");
	}
	public static void main(String[]args) {
		
		Bank b1 = new Bank();//Bank ��ü b1�� �����
		
		b1.name = "ȫ�浿";//b1 �� �̸��� ȫ�浿
		
		b1.inputMoney(5000);//ȫ�浿�� 5000���� �Ա��ϰ� �ܾ��� Ȯ����
		
		b1.getMoney();//ȫ�浿���� �ܾ��� 5000�� �Դϴ�.
		
		b1.outMoney(3000);//ȫ�浿�� 3000���� ����ϰ� �ܾ�Ȯ��
		
		b1.getMoney();//ȫ�浿���� �ܾ��� 2000�� �Դϴ�
		
		//�̼��� ���� 10000���� �Ա�
		//�ܾ�Ȯ��
		
		Bank b2 = new Bank(); //Bank ��ü b2�� �����
		
		b2.name = "�̼���";//b2 �� �̸��� �̼���
		
		b2.inputMoney(10000);//�̼����� 10000���� �Ա�!
		
		b2.getMoney();//�̼��� �ܾ�Ȯ��
		
		b2.outMoney(20000);//�ܾ׺���
		
		b2.getMoney();//�̼��Ŵ� 10000��
		
		Bank b3 = new Bank("������",20000);
		b3.outMoney(50000);
		b3.getMoney();
	}
}
