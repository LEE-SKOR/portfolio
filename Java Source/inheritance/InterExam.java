package inheritance;
interface InterTest{
public void test();
}
interface InterShap {//추상으로만 된 클래스는 인터페이스라고 한다
	public void draw();//그래서 추상을 빼도 된다.
	public void move();//그래서 추상을 빼도 된다.
	public void print();//그래서 추상을 빼도 된다.
}
class InterCircle implements InterShap,InterTest {

	public void test() {
		
	}
	public void draw() {
		
	}
	public void move() {
		
	}
	public void print() {
		
	}//인터페이스에는 임플리먼츠를 이용한다.인터페이스도 new를 사용할 수 없다.
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