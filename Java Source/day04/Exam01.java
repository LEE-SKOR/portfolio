package day04;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		//10���� ���� �Է¹޾� �迭�� �ְ�
		//�� �迭�� �հ�� ���� ���� �� ���ϱ�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("100���� ���� 10���� ����� �Է��ϼ���.>>");
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
		System.out.println("�迭�� �հ� : "+sum);
		System.out.println("�ּҰ� : "+ min);
		for(int a:arr) {
		System.out.print(a+"\t");
		}
		sc.close();
	}

}
