package day01;

import java.util.Scanner;

public class Exam07 {
	public static void main(String[] args) {
		/*
		 * 1. 점수를 입력받고
		 * 2. 커트라인을 입력받아
		 * 3. 합격인지 불합격인지 알려주세요
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요>>");
		int score = sc.nextInt();
		System.out.println("커트라인를 입력하세요>>");		
		int cut = sc.nextInt();
		if (score >= cut) {
			System.out.println("합격");
		}else if (score < cut){
			System.out.println("불합격");
		}
		//점수가 3의 배수인지 아닌지
		if(score %3==0) {
			System.out.println(score+":3배수");
		}else {
			System.out.println(score+":3배수 아님");
			
			
			
		
	}
}
}
