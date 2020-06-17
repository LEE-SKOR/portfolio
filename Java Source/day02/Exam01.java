package day02;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/*
		 *	국어 영어 수학 점수를 입력받아
		 * 	총점, 평균, 학점을 출력
		 * 	평균 90점 이상 A학점
		 * 		80 점 이상 B학점
		 * 		70점 이상 C학점
		 * 		나머지 F학점
		 * 	Switch문 사용
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요>>");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요>>");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요>>");
		int math = sc.nextInt();
		
		int total = (kor+eng+math);
		int avg = total/3;
		String grade ="";
			switch(avg/10) {
			case 9:
			grade = "A";break;
			case 8:
			grade = "B";break;
			case 7:
			grade = "C";break;
			default :
				grade = "F";break;
			}
		
			System.out.println("총점 :"+ total);
			System.out.println("평균 :"+ avg);
			System.out.println("학점 :"+ grade);
			sc.close();
	}

}
