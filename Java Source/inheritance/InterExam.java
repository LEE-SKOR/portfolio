package inheritance;
interface InterTest{
public void test();
}
interface InterShap {//�߻����θ� �� Ŭ������ �������̽���� �Ѵ�
	public void draw();//�׷��� �߻��� ���� �ȴ�.
	public void move();//�׷��� �߻��� ���� �ȴ�.
	public void print();//�׷��� �߻��� ���� �ȴ�.
}
class InterCircle implements InterShap,InterTest {

	public void test() {
		
	}
	public void draw() {
		
	}
	public void move() {
		
	}
	public void print() {
		
	}//�������̽����� ���ø������� �̿��Ѵ�.�������̽��� new�� ����� �� ����.
}
class Inter{
	public void InterTest() {
		
	}
}
class InterRectangle extends Inter implements InterShap,InterTest{
	
	public void draw() {
			
	}
	public void move() {
			
	}
	public void print() {
			
	}
	public void test() {
		
	}
}