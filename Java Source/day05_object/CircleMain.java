package day05_object;

public class CircleMain {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.name = "����";
		c1.r = 10;
		//������ ���̸� ���Ͻÿ�
		c1.getArea();
		c1.setR(8);
		c1.getArea();
		
		Circle c2 = new Circle();
		c2.name = "����";
		c2.r = 2;
		c2.setR(2);
		c2.getArea();
		//�������� 5�� �����ڸ� �̿��ؼ� ��ġ�� ������ ���Ͻÿ�
		
		Circle c3 = new Circle(5);
		c3.getArea();
		
		Circle c4 = new Circle(4,"����");
		c4.getArea();
		//������ Circle ��ü�� �� ����	
	}

}
