package utilTest;

import java.util.HashMap;
import java.util.Scanner;

public class HsahMapDic {
	
	
	

	public static void main(String[] args) {
	
		HashMap<String,String> dic = new HashMap<String,String>();
		dic.put("baby","아기");
		dic.put("love","사랑");
		dic.put("apple","사과");
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("영어단어를 입력하세요>> 종료는 exit>>" );
			String eng = sc.nextLine();
			if(eng.toLowerCase().equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			String kor = dic.get(eng);
			if(kor==null) {
				System.out.println(eng+"는 없는 단어");
			}else {
				System.out.println(kor);
			}
		}
		sc.close();			
	}
	
}
