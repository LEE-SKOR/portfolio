package day02;

public class Exam10 {

	public static void main(String[] args) { //2�� for��
		for(int k=2; k<=4; k++) {
			for(int i=1; i<=3; i++) {
				System.out.println(k+"*"+i+"="+k*i);
			}
			System.out.println("=========");		
	}

			System.out.println("=========");
			for(int i=1; i<=9; i++) { //�Ʒ��� ����
				for(int d=4; d<=6; d++) { //���� ������ ���� �Ʒ��� ����
					System.out.print(d+"*"+i+"="+d*i+"\t");
				}
				System.out.println();
			}
			System.out.println("========================");
			
			
			for(int i=4; i<=6; i++) { //���� ����
				for(int d=1; d<=9; d++) { //���� ������ ���� �������� ����
					System.out.print(i+"*"+d+"="+d*i+"\t");
				}
				System.out.println();
			}
			System.out.println("========================");
			/*
			 * 123456789
			 * 1234567
			 * 12345
			 * 123
			 * 1
			 */
			for(int i=9; i>0; i-=2) { //�ۿ� �ִ� for ���� Ⱦ���� ����
				for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
				System.out.println( );
			}
			System.out.println("========================");//�� �Ųٷ�
			for(int i=1; i<10; i+=2) {
				for(int j=1; j<=i; j++) {
					System.out.print(j);
				}
				System.out.println( );
			}
			System.out.println("========================");
			for(int i=3; i<=7; i+=2) {
				System.out.println(i+"��");
				for(int j=1; j<10; j++) {
					System.out.println(i +" X "+ j +" = "+ i*j);
				}
				System.out.println( );
			}
}
}