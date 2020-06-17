package day04;

public class Triangle {
	
	double bottom,height;
	
	public Triangle(double bottom, double height) {
		this.bottom = bottom;
		this.height = height;
	}
	public void setBottom(double bottom) {
		this.bottom = bottom;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getArea() {
		return bottom*height/2;
	}

}
