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
		
		System.out.println("ID를 입력하세요>>");
		String ID = sc.nextLine();
		
		System.out.println("비밀번호를 입력하세요>>");
		String PW = sc.nextLine();
		
		if(map.containsKey(ID)==false) {
			System.out.println("ID 존재 안함");
		}else if(map.get(ID).equals(PW)==false) {
			System.out.println("비밀번호가 일치하지 않음");
		}else {
			System.out.println("히히 로그인 성공!");
		
		}
	}
}

