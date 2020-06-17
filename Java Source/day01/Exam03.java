package day01;

public class Exam03 {

	public static void main(String[] args) {
		
		int a = 135;
		int b = 20;
		
		System.out.println("덧셈 " + (a+b));
		System.out.println("뺄셈 " + (a-b));
		System.out.println("곱셈 " + (a*b));
		System.out.println("나눗셈 " + (a/b));
		System.out.println("나머지 " + (a%b));
		//135+20=155
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"/"+b+"="+(a/b));
		System.out.println(a+"%"+b+"="+(a%b));
		//int -> 4바이트 (32비트)
		//int c = 100000000000;
		//long -> 8바이트 (64비트) 마지막에 식별자 L
		
		long c = 100000000000L;		
		float f = 3.25F; //4바이트 -> 부동소수점
		double d = 3.25; //8바이트 -> 부동소수점
		
		//문자하나
		char ch = 'A';
		//char ch1 = "B"; 오류발생

		}

}
