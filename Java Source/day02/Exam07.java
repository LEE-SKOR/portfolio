package day02;

public class Exam07 {

	public static void main(String[] args) {
		//1����  5���� ��� (Ƚ���� �˶�)
		for(int i=1;i<6;i++) {
			System.out.println();
			System.out.println("----");
			//1���� 5���� ���� while (Ƚ���� �𸦶�)
			int n=1;
			while(n<6) {
				System.out.println(n+"\t");
				n++;
			}
			System.out.println("\n-----");
			//1���� 5���� ���� do~while(�ּ��� �ѹ��� ����)
			int m=1;
			do {
			System.out.println(m+"\t");
			m++;
		}while(m<6);
	}
}
}