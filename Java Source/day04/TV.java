package day04;

public class TV {
	String maker;
	int year, inch;
	
	public TV(String maker, int year, int inch) {
		this.maker = maker;
		this.year = year;
		this.inch = inch;
	}
	public void show() {
		System.out.println(maker+"에서 만든 "+year+"년형 "+inch+"인치 TV");
	}
	public static void main(String[] args) {
		TV tv = new TV("LG",2020,60);
		tv.show();// LG에서 만든 2020년형 60인치 TV
		
		TV mytv = new TV("삼성",2019,55);
		mytv.show();//삼성에서 만든 2019년형 55인치 TV
		
		TV mytv1 = new TV("대우",2020,80);
		mytv1.show();//대우에서 만든 2020년형 80인치 TV

	}

}
