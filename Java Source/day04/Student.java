package day04;

public class Student {
		int StudentID;//�й�
		String name;//�̸�
		int grade;//�г�
		String address;//�ּ�
		
		//�����ϴ� ��� ���� => �Լ�(�޼ҵ�)
		public void study() {
			System.out.println(name+" �����ϴ� ");
		}
		public void play() {
			System.out.println(name+" ��Ѵ� ");
		}
		
		public static void main(String[] args) {
			Student s1 = new Student();
			s1.StudentID = 100;//s1�� �й�
			s1.name = "ȫ�浿";//s1�� �̸�
			s1.grade = 1;//s1�� �г�
			s1.address = "�λ�";//s1�� �ּ�
			System.out.println("s1 �̸� : "+s1.name);//s1�� �̸��� ���
			System.out.println("===============================");
			Student s2 = new Student();
			s2.StudentID = 200;
			s2.name = "�̼���";
			s2.grade = 4;
			s2.address = "����";
			System.out.println("s1 �ּ� : "+s2.name);
			//�̸��� �������̰� 3�г�,��õ�� ��� �л� s3��
			//�����ϰ� s3�� �̸��� �ּҸ� ����Ͻÿ�
			System.out.println("===============================");
			System.out.println(s1.name+"�� �ּҴ� "+s1.address+"�Դϴ�");
			System.out.println("===============================");
			Student s3 = new Student();
			s3.StudentID = 300;
			s3.name = "������";
			s3.grade = 3;
			s3.address ="��õ";
			System.out.println("s3 �� �̸��� "+s3.name);
			System.out.println("s3 �� �ּҴ� "+s3.address);
			System.out.println("===============================");
			//ȫ�浿�� �����ϴ�
			s1.study();
			//�������� �����ϴ�
			s3.study();
			//�л��� play()��� �Լ��� ������ �ְ�...
			//���⿡�� �̸� ��Ѵ� ��� ���� ����Ͻÿ�
			System.out.println("===============================");
			//ȫ�浿�� ��Ѵ�
			s1.play();
			//�������� ��Ѵ�
			s3.play();
			System.out.println("===============================");
	}

}
