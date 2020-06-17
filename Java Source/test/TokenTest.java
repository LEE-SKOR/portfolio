package test;

import java.util.StringTokenizer;

public class TokenTest {

	public static void main(String[] args) {
		String str = "aaa@bbb@ccc@ddd.eee";
		//StringTokenizer �� �̿��ؼ� @ �� .���� ��ū�� �����ؼ� ���
		StringTokenizer stk = new StringTokenizer(str,"@.");
		while(stk.hasMoreTokens()) {
			String token = stk.nextToken();
			System.out.println(token+" ");
			//System.out.println("��ū ���� :"+stk.countTokens());
			//System.out.println(stk.nextToken());
		}
		System.out.println();
		int x = 15, y = 3, z = 4;
		z=++x/y;
		System.out.println("X="+x);	//16
		System.out.println("Y="+y);	//3
		System.out.println("Z="+z);	//5
		System.out.println();
		x*=y+1;
		System.out.println("X="+x);	//64
		System.out.println("Y="+y);	//3
		System.out.println("Z="+z);	//5
		System.out.println();
		z=++x+y++;
		System.out.println("X="+x);	//65
		System.out.println("Y="+y);	//4
		System.out.println("Z="+z);	//68
	}

}
