package day02;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {
		for(int i=1; i<6; i++) {//i=1,2,3,4,5,6
			System.out.println(i+"안녕하세요");
	}
		System.out.println("=========");
		for(int i=5; i>0; i--) {
			System.out.println(i+"안녕하세요");
		}
		//2단 츨력
		System.out.println("=========");
		for(int i=1; i<10; i++) {
			System.out.println("2*" + i + "=" + 2*i);
		}
		//1부터 10까지 수 중에서 짝수만 출력
		System.out.println("=========");
		for (int i=1; i<10; i++){
			if(i%2==0) {
			System.out.println(i);
		}
}
		System.out.println("=========");//짝수
		for(int i=2; i<=10; i+=2) {
			System.out.println(i);
}
		System.out.println("=========");//홀수
		for(int i=1; i<=10; i++) {
			System.out.println(i++);
		}
		
		//단을 입력받아 해당되는 단의 구구단 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력하세요");
		int num = sc.nextInt();
		for(int i=1; i<=10; i++) {
		System.out.println(num+"*"+ i +"="+num*i);
		}
	}
}