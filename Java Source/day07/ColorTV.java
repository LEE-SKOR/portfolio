package day07;

public class ColorTV extends TV  {
	protected int pixel;
	
	public ColorTV(int inch,int pixel) {
		super(inch);
		this.pixel = pixel;
	}
	public void printProperty() {
		System.out.println(inch+"��ġ "+pixel+"�÷�");
	}
}
