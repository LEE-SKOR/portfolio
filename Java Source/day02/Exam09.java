package day02;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		// ���� �Է��ϴµ� �������� -1
		// �Է��� ���� �հ�� ����� ���Ͻÿ�
		//��) 10 5 6 9 -1
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��Ͻÿ�. �������� -1");
		int sum=0;
		int cnt=0;
		while (true) {
			int u = sc.nextInt();
			if(u==-1)break;//-1�̸� ������.
			sum +=u;//��
			cnt++;//����
		}
		System.out.println("�հ� :"+sum);
		System.out.println("��� :"+sum/cnt);
		sc.close();
		
		}
	}

