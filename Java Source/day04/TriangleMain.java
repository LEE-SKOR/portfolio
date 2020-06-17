package day04;

import java.util.Scanner;

public class TriangleMain {

	public static void main(String[] args) {
		Triangle tr = new Triangle(10.2,17.3);//밑변 곱하기 높이 나누기 2
		System.out.println("삼각형의 면적 : "+tr.getArea());
		tr.setBottom(7.5);
		tr.setHeight(11.2);
		System.out.println("삼각형의 면적 : "+tr.getArea());
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 밑변>>");
		double b = sc.nextDouble();
		System.out.println("삼각형의 높이>>");
		double h = sc.nextDouble();
		Triangle tr1 = new Triangle(b,h);
		System.out.println("입력 삼각형의 면적 : "+tr1.getArea());
	}
	
	
}
