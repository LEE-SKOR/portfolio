package day01;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		// 두 수를 입력하여
		// 큰 수 :
		// 작은 수 :
		//두 수의 차  :
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하시오>>");
		int max = sc.nextInt();
		System.out.println("두번째 수를 입력하시오>>");
		int min = sc.nextInt();
		if(min>max) {
			int tmp = max;
				max = min;
				min = tmp;
		}
		System.out.println("큰 수 : "+max);
		System.out.println("작은 수 : "+min);
		System.out.println("두 수 차 : "+(max-min));
	
}
}