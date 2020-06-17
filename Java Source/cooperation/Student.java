package cooperation;

public class Student {
	private String studentName;//학생이름
	private int grade;//학년
	private int money;//학생이 가지고있는 돈
	
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}//버스타다
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}//지하철타다
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}
	//정보 보여주기
	public void showInfo() {
		System.out.println("학생 이름 : "+studentName);
		System.out.println("학생 잔액 : "+money+"원");
	}
	
}

