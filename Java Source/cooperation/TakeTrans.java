package cooperation;

public class TakeTrans {
	
	public static void main(String[] args) {
		Student s1 = new Student("홍길동",5000);
		Student s2 = new Student("이순신",10000);
		Student s3 = new Student("Edward",30000);
		
		Bus bus = new Bus(100);
		s1.takeBus(bus);
		
		Subway subway = new Subway("2호선");
		s2.takeSubway(subway);
		
		Taxi taxi = new Taxi("00택시");
		s3.takeTaxi(taxi);
		
		s1.showInfo();
		System.out.println("=================");
		s2.showInfo();
		System.out.println("=================");
		s3.showInfo();
		System.out.println("=================");
		bus.showInfo();
		System.out.println("=================");
		subway.showInfo();
		System.out.println("=================");
		taxi.showInfo();
	}
}
