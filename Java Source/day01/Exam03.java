package day01;

public class Exam03 {

	public static void main(String[] args) {
		
		int a = 135;
		int b = 20;
		
		System.out.println("���� " + (a+b));
		System.out.println("���� " + (a-b));
		System.out.println("���� " + (a*b));
		System.out.println("������ " + (a/b));
		System.out.println("������ " + (a%b));
		//135+20=155
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"/"+b+"="+(a/b));
		System.out.println(a+"%"+b+"="+(a%b));
		//int -> 4����Ʈ (32��Ʈ)
		//int c = 100000000000;
		//long -> 8����Ʈ (64��Ʈ) �������� �ĺ��� L
		
		long c = 100000000000L;		
		float f = 3.25F; //4����Ʈ -> �ε��Ҽ���
		double d = 3.25; //8����Ʈ -> �ε��Ҽ���
		
		//�����ϳ�
		char ch = 'A';
		//char ch1 = "B"; �����߻�

		}

}
