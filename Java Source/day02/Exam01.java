package day02;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/*
		 *	���� ���� ���� ������ �Է¹޾�
		 * 	����, ���, ������ ���
		 * 	��� 90�� �̻� A����
		 * 		80 �� �̻� B����
		 * 		70�� �̻� C����
		 * 		������ F����
		 * 	Switch�� ���
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ���>>");
		int kor = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ���>>");
		int eng = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ���>>");
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
		
			System.out.println("���� :"+ total);
			System.out.println("��� :"+ avg);
			System.out.println("���� :"+ grade);
			sc.close();
	}

}
