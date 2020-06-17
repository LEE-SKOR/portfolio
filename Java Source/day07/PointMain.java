package day07;

public class PointMain extends Point{
	String color;

	public PointMain(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	@Override //애너테이션
	public void disp() {
		super.disp();
		System.out.println("Color : "+color);
	}
	
	public static void main(String[]args) {
		
		PointMain pm = new PointMain(5,5,"yellow");
		pm.disp();
		pm.move(10,20);
		pm.disp();
	
		System.out.println(pm.str);
	}
}
