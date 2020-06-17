package day01;

public class Exam11 {

	public static void main(String[] args) {
		
		int n1 = 5;
		int n2 = ++n1; //++은 1증가 (먼저 증가)
		System.out.println("n1 : "+n1);
		System.out.println("n2 : "+n2);
		System.out.println("========");
		int n3 = n1++; //나중에 1증가
		System.out.println("n1 : "+n1);
		System.out.println("n1 : "+n2);
		int num1 = 7;
		int num2 = --num1; //num1=6, num2=6
		int num3 = num1--; //num3=6, num1=5
		System.out.println("========");
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		System.out.println("num3 : "+num3);
		System.out.println("========");
		int a=50,b=3;
		int c;
		a++; //51
		++b; //4
		c=a++ + ++b; //56
		System.out.println("A : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);
		System.out.println("========");
		int aa=10,bb=3;
		int cc;
		--aa; //9
		bb++; //3 -> 4
		cc=aa-- + ++bb; //aa=9 , bb=5, cc=14
		System.out.println("aa : "+aa);
		System.out.println("bb : "+bb);
		System.out.println("cc : "+cc);
	}

}
