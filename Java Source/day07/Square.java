package day07;

public  class Square extends Shape{
	private int width;
	private int height;
	public Square(int x, int y, int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}//�������̵�
	public void print() {
		super.print();
		System.out.println("���� : "+width);
		System.out.println("���� : "+height);
	}//�������̵�
	public  double getArea() {
		return width*height;
	}
		
}
