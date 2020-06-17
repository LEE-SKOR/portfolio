package day04;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		//10개의 수를 입력받아 배열에 넣고
		//그 배열의 합계와 가장 작은 수 구하기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("100보다 작은 10개의 양수를 입력하세요.>>");
		int[] arr = new int[10];
		int sum = 0;
		
		for(int i=0; i<10; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
			int min=arr[0];
			for(int i=0; i<10; i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}		
		System.out.println("배열의 합계 : "+sum);
		System.out.println("최소값 : "+ min);
		for(int a:arr) {
		System.out.print(a+"\t");
		}
		sc.close();
	}

}
