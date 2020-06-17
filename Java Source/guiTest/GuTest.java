package guiTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GuTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력하세요>>");
		try {
		int dan = sc.nextInt();
		for(int i=1; i<=9; i++) {
			System.out.println(dan+" X "+i+" = "+dan*i);
			}	
		}catch(InputMismatchException n) {
			System.out.println("숫자만 입력하세요");
		}

	}
	
}
