package day02;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {
		for(int i=1; i<6; i++) {//i=1,2,3,4,5,6
			System.out.println(i+"�ȳ��ϼ���");
	}
		System.out.println("=========");
		for(int i=5; i>0; i--) {
			System.out.println(i+"�ȳ��ϼ���");
		}
		//2�� ����
		System.out.println("=========");
		for(int i=1; i<10; i++) {
			System.out.println("2*" + i + "=" + 2*i);
		}
		//1���� 10���� �� �߿��� ¦���� ���
		System.out.println("=========");
		for (int i=1; i<10; i++){
			if(i%2==0) {
			System.out.println(i);
		}
}
		System.out.println("=========");//¦��
		for(int i=2; i<=10; i+=2) {
			System.out.println(i);
}
		System.out.println("=========");//Ȧ��
		for(int i=1; i<=10; i++) {
			System.out.println(i++);
		}
		
		//���� �Է¹޾� �ش�Ǵ� ���� ������ ���
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���");
		int num = sc.nextInt();
		for(int i=1; i<=10; i++) {
		System.out.println(num+"*"+ i +"="+num*i);
		}
	}
}