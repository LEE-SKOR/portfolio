package day07;

public class Main {

	public static void main(String[] args) {
		Father f1 = new Father();
		//f1.fatherPrint();
		Child c1 = new Child();
		//c1.ChildPrint();
		//f1.methodTest();
		//c1.test();
		//c1.methodTest();
		GrandFather g1 = new GrandFather();//����� ������ ����
		c1.grandPrint();
		f1.grandPrint();
		g1.grandPrint();
		
		GrandFather g2;//����!
		Father f2 = new Father();
		g2 = f2; //GrandFather = father
		//f2 = g2; ������ �����߻�
		//g2.fatherPrint();	//fatherPrint()�� Father �޼ҵ�
		g2.grandPrint();	//GrandFather �޼ҵ尡 ��� ��, �������̵� �� �޼ҵ�� �������̵� �� �޼ҵ尡 ����ȴ�
		
		GrandFather g3 = new Father();
		//GrandFather g3
		//Father f3 = new Father();
		//g3 = f3
	}

}