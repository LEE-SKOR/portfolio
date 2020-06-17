package day02;

public class Exam04 {

	public static void main(String[] args) {
		/* for 문을 이용해서 
		 * 1 부터 10까지의 합을 구하라
		 */
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum = sum + i;
			System.out.println("1~10 까지의 합계 :" +sum);
			
}
		System.out.println("============================");
		/*
		 * 1부터 10까지의 합 55
		 * 1부터 20까지의 합
		 * 1부터 30까지의 합
		 * 1부터 40까지의 합
		 * 1부터 50까지의 합
		 * 
		 */
		int hap=0;
		for(int i=1; i<=100; i++) {
			hap += i;
			if(i%10==0) {
			System.out.println("1부터"+i+"까지의 합" +hap);		
}			
}
		System.out.println("============================");
		int s=0;
		for(int i=1; i<=10; i++) {
			s+=i;
			if(i!=10) {
			System.out.print(i+"+");
			}else {
			System.out.println(i+"="+s);
}
}
		System.out.println("============================");
		int h=0;
		for(int i=1; i<=10; i++) {
			h+=i;
			if(i==1) {
				System.out.print(i);
			}else{
				System.out.print("+"+i);
			}
		}
		System.out.print("="+h);
			
		
}
}