package day01;

import java.util.Scanner;

public class Exam12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.자바 2.데이터베이스 3.안드로이드 4.기타공부");
		System.out.println("과목번호 선텍>>");
		int num = sc.nextInt();
		if(num==1) {
			System.out.println("자바 공부");
		}else if(num==2){
			System.out.println("데이터베이스 공부");
		}else if(num==3){
			System.out.println("안드로이드 공부");
		}else if(num==4) {
			System.out.println("기타 공부");
		}else {
			System.out.println("공부합시다.");
		}
		
		switch(num) {
		case 1 : System.out.println("자바 공부");break;
		case 2 : System.out.println("데이터베이스 공부");break;
		case 3 : System.out.println("안드로이드 공부");break;
		case 4 : System.out.println("기타 공부");break;
		case 5 : System.out.println("공부합시다");
		}
		
		
		
		}

	}
