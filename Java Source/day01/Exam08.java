package day01;
import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("이름 입력>>");
		String name = sc.next();
		System.out.println("국어점수를 입력하세요>>");
		int kor = sc.nextInt();
		System.out.println("수학점수를 입력하세요>>");
		int math = sc.nextInt();
		System.out.println("영어점수를 입력하세요>>");
		int eng = sc.nextInt();
		
		int total = kor+math+eng;
		int avg = total/3;
		System.out.println("이름 :"+ name);
		System.out.println("총점 :"+ total);
		System.out.println("평균 :"+ avg);
		String grade ="";
		
		if (avg >= 90) {
			System.out.println("A학점");
		}else if (avg >= 80){
			System.out.println("B학점");
		}else if (avg >= 70){
			System.out.println("C학점");
		}else {
			System.out.println("F학점");
			System.out.println(grade);
		}	
}
}