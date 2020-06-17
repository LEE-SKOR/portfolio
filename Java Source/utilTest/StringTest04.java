package utilTest;

import java.util.Scanner;

public class StringTest04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하세요>>");
		String word = sc.nextLine();
		for(int i=0; i<word.length(); i++) {
			char first = word.charAt(0);
			//String first = word.substring(0,1);
			String second = word.substring(1);
			word = second+first;
			System.out.println(word);
		}
	
	}

}
