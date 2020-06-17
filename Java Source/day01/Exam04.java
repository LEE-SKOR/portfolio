package day01;

public class Exam04 {

	public static void main(String[] args) {
		//반지름 R을 5로 정하고
		//원의 넓이를 출력하시오
		//원주율은 3.14
		
		int r = 5;
		System.out.println(r*r*3.14);
		final double PI = 3.14;
		System.out.println(r*r*PI);
		// pi = 3.15:
		System.out.println(r*r*PI);
		float f =5.0f; //4바이트
		int num = 10;  //4바이트
		f=num; // float = int 형변환(캐스팅) <- 자동형변환
		System.out.println("f: "+ f);
				
		num = (int) f; //int <- float 형변환(캐스팅) <-명시적형변환
		long num1 = 100L;
		
		f = num1; // float = long
		double area = r*r*PI;
		System.out.println("원넓이 :" + area);
		// area 는 원넓이
	
	}
}
