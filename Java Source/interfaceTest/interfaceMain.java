package interfaceTest;

public class interfaceMain {

	public static void main(String[] args) {
		Shape rec = new Rectangle(5,7);
		Shape Circle = new Circle(5);
		//rec.a = 5;
		System.out.println(rec.a);
		
		System.out.println("원 넓이 : "+Circle.area());
		System.out.println("원 둘레 : "+Circle.circum());
		System.out.println("사각형 넓이 : "+rec.area());
		System.out.println("사각형 둘레: "+rec.circum());

	}

}
