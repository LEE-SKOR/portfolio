package day02;

public class Exam10 {

	public static void main(String[] args) { //2중 for문
		for(int k=2; k<=4; k++) {
			for(int i=1; i<=3; i++) {
				System.out.println(k+"*"+i+"="+k*i);
			}
			System.out.println("=========");		
	}

			System.out.println("=========");
			for(int i=1; i<=9; i++) { //아래로 정렬
				for(int d=4; d<=6; d++) { //작은 구구단 부터 아래로 정렬
					System.out.print(d+"*"+i+"="+d*i+"\t");
				}
				System.out.println();
			}
			System.out.println("========================");
			
			
			for(int i=4; i<=6; i++) { //우측 정렬
				for(int d=1; d<=9; d++) { //낮은 구구단 부터 우측으로 정렬
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
			for(int i=9; i>0; i-=2) { //밖에 있는 for 문이 횡으로 정렬
				for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
				System.out.println( );
			}
			System.out.println("========================");//↑ 거꾸로
			for(int i=1; i<10; i+=2) {
				for(int j=1; j<=i; j++) {
					System.out.print(j);
				}
				System.out.println( );
			}
			System.out.println("========================");
			for(int i=3; i<=7; i+=2) {
				System.out.println(i+"단");
				for(int j=1; j<10; j++) {
					System.out.println(i +" X "+ j +" = "+ i*j);
				}
				System.out.println( );
			}
}
}