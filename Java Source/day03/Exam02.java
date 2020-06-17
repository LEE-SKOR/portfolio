package day03;

public class Exam02 {

	public static void main(String[] args) {
		/*
		 * 1부터 10까지의 합
		 * 11부터 20까지의 합
		 * 21부터 30까지의 합
		 * 31부터 40까지의 합
		 * 
		 * 91부터 100까지의 합
		 * 이중 for 사용
		 */
		
		//int sum=0;
		for(int i=1; i<=100; i+=10) {
			int sum=0;
			for(int j=i; j<i+10; j++) {
				sum += j; //1,11,21,31 ...
			}
			System.out.println(i+"부터"+(i+9)+"까지의 합 : "+sum);
			//sum=0;
		}
	}
}