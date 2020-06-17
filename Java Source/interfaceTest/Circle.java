package interfaceTest;

public class Circle implements Shape{
	private int r;
	public Circle(int r) {
		this.r = r;
	}
	public double circum() {
		return r*r*Math.PI;
	}	
	public double area() {
		return 2*r*3.14;
	}
	
}
