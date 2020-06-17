package day07;

import java.util.ArrayList;

public class ShapeMannager {
	//Shape[] arr = new Shape[50];
	//ArrayList slist
	ArrayList<Shape> slist = new ArrayList<>();
	//int cnt;
	final double PI = 3.14;
	
	public void inputData(int num) {
		System.out.print("�����Է�.....");
		System.out.print("x ��ǥ >>");
		int x = ShapeMain.sc.nextInt();
		System.out.print("y ��ǥ >>");
		int y = ShapeMain.sc.nextInt();
		
		if(num==1) {//��
			System.out.print("������ >>");
		int r = ShapeMain.sc.nextInt();
			System.out.println("���� ���̴� : "+(r*r*PI));
		slist.add(new Circle(x,y,r));
		
		}else if(num==2) {//�簢��
			System.out.print("���� >>");
			int w = ShapeMain.sc.nextInt();
			System.out.print("���� >>");
			int h = ShapeMain.sc.nextInt();
			slist.add(new Square(x,y,w,h));
			
		}
	}
	public void viewData() {
		//Shape sh = new Shape(); �߻� Ŭ������ ������ų �� ����.
		double sum = 0;
		for(Shape s:slist) {	
			sum += s.getArea();
			s.print();
		}
		System.out.println("��ü ���� : "+sum);
	}
}
