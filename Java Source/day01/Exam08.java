package day01;
import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("�̸� �Է�>>");
		String name = sc.next();
		System.out.println("���������� �Է��ϼ���>>");
		int kor = sc.nextInt();
		System.out.println("���������� �Է��ϼ���>>");
		int math = sc.nextInt();
		System.out.println("���������� �Է��ϼ���>>");
		int eng = sc.nextInt();
		
		int total = kor+math+eng;
		int avg = total/3;
		System.out.println("�̸� :"+ name);
		System.out.println("���� :"+ total);
		System.out.println("��� :"+ avg);
		String grade ="";
		
		if (avg >= 90) {
			System.out.println("A����");
		}else if (avg >= 80){
			System.out.println("B����");
		}else if (avg >= 70){
			System.out.println("C����");
		}else {
			System.out.println("F����");
			System.out.println(grade);
		}	
}
}