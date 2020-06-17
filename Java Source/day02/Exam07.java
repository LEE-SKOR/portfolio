package day02;

public class Exam07 {

	public static void main(String[] args) {
		//1부터  5까지 출력 (횟수를 알때)
		for(int i=1;i<6;i++) {
			System.out.println();
			System.out.println("----");
			//1부터 5까지 츨력 while (횟수를 모를때)
			int n=1;
			while(n<6) {
				System.out.println(n+"\t");
				n++;
			}
			System.out.println("\n-----");
			//1부터 5까지 츨력 do~while(최소한 한번은 수행)
			int m=1;
			do {
			System.out.println(m+"\t");
			m++;
		}while(m<6);
	}
}
}