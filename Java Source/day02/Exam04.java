package day02;

public class Exam04 {

	public static void main(String[] args) {
		/* for ���� �̿��ؼ� 
		 * 1 ���� 10������ ���� ���϶�
		 */
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum = sum + i;
			System.out.println("1~10 ������ �հ� :" +sum);
			
}
		System.out.println("============================");
		/*
		 * 1���� 10������ �� 55
		 * 1���� 20������ ��
		 * 1���� 30������ ��
		 * 1���� 40������ ��
		 * 1���� 50������ ��
		 * 
		 */
		int hap=0;
		for(int i=1; i<=100; i++) {
			hap += i;
			if(i%10==0) {
			System.out.println("1����"+i+"������ ��" +hap);		
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