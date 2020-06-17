package day04;

public class Sachik {
	//µ¡¼À
	public void sum(int a, int b) {
		System.out.println("µ¡¼À :"+(a+b));
	}
	//»¬¼À
	public void sub(int a, int b) {
		System.out.println("»¬¼À :"+(a-b));	
	}
	//°ö¼À
	public int mul(int a, int b) {
		System.out.println("°ö¼À :"+a*b);
		return a*b;
	}
	//³ª´°¼À
	public int div(int a, int b) {
		System.out.println("³ª´°¼À :"+a/b);
		return a/b;
	}
	public static void main(String[] args) {
		Sachik s1 = new Sachik();
		s1.sum(10, 5);//10,5
		s1.sub(10, 5);
		s1.mul(10, 5);
		// s1.div(10, 5);
		System.out.println(s1.div(20,5));
	}
	
}
