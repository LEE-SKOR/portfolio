package day03;

public class Exam02 {

	public static void main(String[] args) {
		/*
		 * 1���� 10������ ��
		 * 11���� 20������ ��
		 * 21���� 30������ ��
		 * 31���� 40������ ��
		 * 
		 * 91���� 100������ ��
		 * ���� for ���
		 */
		
		//int sum=0;
		for(int i=1; i<=100; i+=10) {
			int sum=0;
			for(int j=i; j<i+10; j++) {
				sum += j; //1,11,21,31 ...
			}
			System.out.println(i+"����"+(i+9)+"������ �� : "+sum);
			//sum=0;
		}
	}
}