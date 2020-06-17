package interfaceTest;

public class Rectangle implements Shape{
	private int w,h;
	public Rectangle(int w, int h) {
		this.w = w;
		this.h = h;
	}
	public double area() {	
		return w*h;
	}
	public double circum() {
		return (w+h)*2;
	}

}
