package day02;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		// 입력할 갯수를 입력받아
		// 그 수만큼 입력받아 그 수 까지의 합 구하기
		// 예)5
		// 2 4 6 7 9
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 갯수.>>");
		int cnt = sc.nextInt();
		
		System.out.println("데이터 입력.>>");
		int sum=0;
		for(int i=0; i<cnt; i++) {
			int inputData = sc.nextInt();
			sum+=inputData;
		}
		System.out.println("합계 : "+sum);
		sc.close();
		}
	}


