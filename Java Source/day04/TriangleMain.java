package day04;

import java.util.Scanner;

public class TriangleMain {

	public static void main(String[] args) {
		Triangle tr = new Triangle(10.2,17.3);//�غ� ���ϱ� ���� ������ 2
		System.out.println("�ﰢ���� ���� : "+tr.getArea());
		tr.setBottom(7.5);
		tr.setHeight(11.2);
		System.out.println("�ﰢ���� ���� : "+tr.getArea());
		Scanner sc = new Scanner(System.in);
		System.out.println("�ﰢ���� �غ�>>");
		double b = sc.nextDouble();
		System.out.println("�ﰢ���� ����>>");
		double h = sc.nextDouble();
		Triangle tr1 = new Triangle(b,h);
		System.out.println("�Է� �ﰢ���� ���� : "+tr1.getArea());
	}
	
	
}
