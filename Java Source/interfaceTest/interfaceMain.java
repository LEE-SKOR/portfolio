package interfaceTest;

public class interfaceMain {

	public static void main(String[] args) {
		Shape rec = new Rectangle(5,7);
		Shape Circle = new Circle(5);
		//rec.a = 5;
		System.out.println(rec.a);
		
		System.out.println("�� ���� : "+Circle.area());
		System.out.println("�� �ѷ� : "+Circle.circum());
		System.out.println("�簢�� ���� : "+rec.area());
		System.out.println("�簢�� �ѷ�: "+rec.circum());

	}

}
