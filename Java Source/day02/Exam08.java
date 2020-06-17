package day02;

public class Exam08 {

	public static void main(String[] args) {
		// 1부터 10까지 홀수의 합을 구하시오
		int sum=0;
		for(int i=1; i<10; i++) {//1에서 10까지 돔
			if(i%2==1) {//나머지가 1일때만 작동
				sum +=i;
			}
		}
		System.out.println("결과 :"+sum);
		System.out.println("==========");
		int hap=0;
		for(int i=1; i<=10; i++) { //i는 1
			if(i%2!=1) continue; //아래 코드를 수행하지 않고 다시 for로 올라간다.
			hap+=i;//1
		}
		System.out.println("continue결과 :"+hap);
		System.out.println("================");
		
		int h=0;
		for(int i=1; i<=10; i++) { //i는 1; i는 10까지; i는 하나씩 증가
		if(i%2!=1) break; //
		h+=i;//1
		}
		System.out.println("break 결과 :"+h);
		System.out.println("============");

}
}
