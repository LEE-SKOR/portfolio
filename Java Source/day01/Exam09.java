package day01;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		// �� ���� �Է��Ͽ�
		// ū �� :
		// ���� �� :
		//�� ���� ��  :
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���� �Է��Ͻÿ�>>");
		int max = sc.nextInt();
		System.out.println("�ι�° ���� �Է��Ͻÿ�>>");
		int min = sc.nextInt();
		if(min>max) {
			int tmp = max;
				max = min;
				min = tmp;
		}
		System.out.println("ū �� : "+max);
		System.out.println("���� �� : "+min);
		System.out.println("�� �� �� : "+(max-min));
	
}
}