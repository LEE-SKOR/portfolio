package day05_object;

public class CircleMain {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.name = "피자";
		c1.r = 10;
		//피자의 넓이를 구하시오
		c1.getArea();
		c1.setR(8);
		c1.getArea();
		
		Circle c2 = new Circle();
		c2.name = "도넛";
		c2.r = 2;
		c2.setR(2);
		c2.getArea();
		//반지름이 5인 생성자를 이용해서 김치전 면적을 구하시오
		
		Circle c3 = new Circle(5);
		c3.getArea();
		
		Circle c4 = new Circle(4,"파전");
		c4.getArea();
		//생성된 Circle 객체의 총 면적	
	}

}
