package day03;

public class Exam01 {

	public static void main(String[] args) {
		/*
		 *  *********
		 *  *******
		 *  *****
		 *  ***
		 *  *
		 */
		
		for(int i=9; i>0; i-=2) { 
			for(int j=1; j<=i; j++) {
			
				System.out.print("*");

			}
			System.out.println("("+i+")");
		}
		System.out.println("=====================");
		
		for(char i='I'; i>='A'; i-=2) { 
			for(char j='A'; j<=i; j++) {
			
				System.out.print((char)(j+1));

			}
				System.out.println("("+i+")");
		}
		System.out.println("=================================");
		
		for(char i='Z'; i>='A'; i--) { //Z로 시작
			for(char j='A'; j<='Z'; j++) {//A로 시작
				if(i>j) {
					System.out.print("*");
				}else {
					System.out.print(j);
				}
			}
					System.out.println( );
		
	
	}
}
}