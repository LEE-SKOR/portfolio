package utilTest;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("java","1111");
		map.put("oracle","1234");
		map.put("jsp","abcd");
		
		System.out.println("ID�� �Է��ϼ���>>");
		String ID = sc.nextLine();
		
		System.out.println("��й�ȣ�� �Է��ϼ���>>");
		String PW = sc.nextLine();
		
		if(map.containsKey(ID)==false) {
			System.out.println("ID ���� ����");
		}else if(map.get(ID).equals(PW)==false) {
			System.out.println("��й�ȣ�� ��ġ���� ����");
		}else {
			System.out.println("���� �α��� ����!");
		
		}
	}
}

