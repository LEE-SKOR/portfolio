package day02;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		// 수를 입력하는데 마지막은 -1
		// 입력한 수의 합계와 평균을 구하시오
		//예) 10 5 6 9 -1
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하시오. 마지막은 -1");
		int sum=0;
		int cnt=0;
		while (true) {
			int u = sc.nextInt();
			if(u==-1)break;//-1이면 끝내라.
			sum +=u;//합
			cnt++;//갯수
		}
		System.out.println("합계 :"+sum);
		System.out.println("평균 :"+sum/cnt);
		sc.close();
		
		}
	}

