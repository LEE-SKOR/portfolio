package day07;

public class Child extends Father{
	public Child() {
		super();
		System.out.println("�ڽ� ������");
	}
	public void ChildPrint() {
		System.out.println(super.str);
		System.out.println("Child print�޼ҵ�");	
	}
	public void test() {
		System.out.println("test method");
	}
}