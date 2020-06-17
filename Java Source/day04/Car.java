package day04;

public class Car {
	String carKind;
	String carColor;
	int speed;
	//생성자
	public Car() {
		System.out.println("디폴트생성자");
	}
	//디폴트 생성자 => 생략가능하지만 다른 생성자가 있을 때는 생략 불가능

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
		mycar.carKind = "소나타";
		mycar.carColor = "흰색";
		mycar.speedUp(100);
		
		System.out.println("속도 : "+mycar.speed);
		System.out.println("Color : "+mycar.carColor);
		mycar.stop();
		System.out.println("속도 : "+mycar.speed);
		
		System.out.println("======================");
		
		//c1 객체를 만들어
		Car c1 = new Car();
		//"검은색" "뉴카" 라는 차종을 만들고
		c1.carColor = "검은색";
		c1.carKind = "뉴카";
		
		c1.speedUp(80);//속도를 올리고
		System.out.println("속도 : "+c1.speed);//출력
		
		c1.speedDown(40);//속도를 내리고
		System.out.println("속도 : "+c1.speed);//출력
		
		System.out.println(c1);
		System.out.println(mycar);
		
		//생성자 -> 멤버변수 초기화
		
		Car c2 = new Car("분홍색","내차");//생성자
		System.out.println(c2.carColor);
		
		//이름은 같고 매게변수는 다를때 오버로딩이라고 한다.
		//생성자도 되고 메소드도 된다.
		//형태에 따라 알아서 움직인다.
		}

}
