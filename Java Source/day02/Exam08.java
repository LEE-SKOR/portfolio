package day02;

public class Exam08 {

	public static void main(String[] args) {
		// 1���� 10���� Ȧ���� ���� ���Ͻÿ�
		int sum=0;
		for(int i=1; i<10; i++) {//1���� 10���� ��
			if(i%2==1) {//�������� 1�϶��� �۵�
				sum +=i;
			}
		}
		System.out.println("��� :"+sum);
		System.out.println("==========");
		int hap=0;
		for(int i=1; i<=10; i++) { //i�� 1
			if(i%2!=1) continue; //�Ʒ� �ڵ带 �������� �ʰ� �ٽ� for�� �ö󰣴�.
			hap+=i;//1
		}
		System.out.println("continue��� :"+hap);
		System.out.println("================");
		
		int h=0;
		for(int i=1; i<=10; i++) { //i�� 1; i�� 10����; i�� �ϳ��� ����
		if(i%2!=1) break; //
		h+=i;//1
		}
		System.out.println("break ��� :"+h);
		System.out.println("============");

}
}
