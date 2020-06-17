package day05_object;

public class Circle {
	
	String name;
	int r;
	
	public Circle() {
		
	}
	public Circle(int r) {
		this.r = r;
		
	}public Circle( int r,String name) {
		this.r = r;
		this.name = name;
	}
	public void getArea() {
		System.out.println(name+"의 면적은 : "+(r*r*3.14));
	}
	public void setR(int r) {
		this.r = r;
	}
}
