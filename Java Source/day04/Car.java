package day04;

public class Car {
	String carKind;
	String carColor;
	int speed;
	//������
	public Car() {
		System.out.println("����Ʈ������");
	}
	//����Ʈ ������ => �������������� �ٸ� �����ڰ� ���� ���� ���� �Ұ���

	public Car(String carColor, String carKind) {
		this.carColor = carColor;
		this.carKind = carKind;
	}
	public void speedUp(int s) {
		speed += s;
	}
	public void stop() {
		speed = 0;
	}
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public static void main(String[] args) {
		Car mycar = new Car();
		mycar.carKind = "�ҳ�Ÿ";
		mycar.carColor = "���";
		mycar.speedUp(100);
		
		System.out.println("�ӵ� : "+mycar.speed);
		System.out.println("Color : "+mycar.carColor);
		mycar.stop();
		System.out.println("�ӵ� : "+mycar.speed);
		
		System.out.println("======================");
		
		//c1 ��ü�� �����
		Car c1 = new Car();
		//"������" "��ī" ��� ������ �����
		c1.carColor = "������";
		c1.carKind = "��ī";
		
		c1.speedUp(80);//�ӵ��� �ø���
		System.out.println("�ӵ� : "+c1.speed);//���
		
		c1.speedDown(40);//�ӵ��� ������
		System.out.println("�ӵ� : "+c1.speed);//���
		
		System.out.println(c1);
		System.out.println(mycar);
		
		//������ -> ������� �ʱ�ȭ
		
		Car c2 = new Car("��ȫ��","����");//������
		System.out.println(c2.carColor);
		
		//�̸��� ���� �ŰԺ����� �ٸ��� �����ε��̶�� �Ѵ�.
		//�����ڵ� �ǰ� �޼ҵ嵵 �ȴ�.
		//���¿� ���� �˾Ƽ� �����δ�.
		}

}
