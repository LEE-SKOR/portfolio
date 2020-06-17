package day02;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요.>>");
		int money = sc.nextInt();//52850
		int result = money/10000;//5
		System.out.println("만원권은 "+ result +"장 입니다.");
		money = money %10000;//2850
		result =money/1000;
		System.out.println("천원권은 "+ result +"장 입니다.");
		int c = money%1000;//850
		System.out.println("나머지는 "+ c +"원 입니다.");
		sc.close();
	}

}
