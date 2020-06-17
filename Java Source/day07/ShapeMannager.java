package day07;

import java.util.ArrayList;

public class ShapeMannager {
	//Shape[] arr = new Shape[50];
	//ArrayList slist
	ArrayList<Shape> slist = new ArrayList<>();
	//int cnt;
	final double PI = 3.14;
	
	public void inputData(int num) {
		System.out.print("도형입력.....");
		System.out.print("x 좌표 >>");
		int x = ShapeMain.sc.nextInt();
		System.out.print("y 좌표 >>");
		int y = ShapeMain.sc.nextInt();
		
		if(num==1) {//원
			System.out.print("반지름 >>");
		int r = ShapeMain.sc.nextInt();
			System.out.println("원의 넓이는 : "+(r*r*PI));
		slist.add(new Circle(x,y,r));
		
		}else if(num==2) {//사각형
			System.out.print("넓이 >>");
			int w = ShapeMain.sc.nextInt();
			System.out.print("높이 >>");
			int h = ShapeMain.sc.nextInt();
			slist.add(new Square(x,y,w,h));
			
		}
	}
	public void viewData() {
		//Shape sh = new Shape(); 추상 클래스는 생성시킬 수 없다.
		double sum = 0;
		for(Shape s:slist) {	
			sum += s.getArea();
			s.print();
		}
		System.out.println("전체 넓이 : "+sum);
	}
}
