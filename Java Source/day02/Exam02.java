package day02;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ݾ��� �Է��ϼ���.>>");
		int money = sc.nextInt();//52850
		int result = money/10000;//5
		System.out.println("�������� "+ result +"�� �Դϴ�.");
		money = money %10000;//2850
		result =money/1000;
		System.out.println("õ������ "+ result +"�� �Դϴ�.");
		int c = money%1000;//850
		System.out.println("�������� "+ c +"�� �Դϴ�.");
		sc.close();
	}

}
