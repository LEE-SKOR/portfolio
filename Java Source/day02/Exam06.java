package day02;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		/*
		 * 1부터 10까지의 합
		 * 11부터 20까지의 합
		 * 21부터 30까지의 합
		 * 
		 * 91부터 100까지의 합
		 */
		
		int hap=0;
		for(int i=1; i<=100; i++) {
			hap += i;
			if(i%10==0) {
			System.out.println((i-9)+"부터"+i+"까지의 합" +hap);	
			hap=0;		//초기화	
			}
		}
		
		/*
		 * 학생수와 힌즐에 앉을 학생 수를 입력받아 출력하시오
		 * 
		 *  
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학생수 입력하세요.>>");//입력받아서
		int stuCnt = sc.nextInt();
		System.out.println("한줄 인원을 입력하세요.>>");//이것도 입력받고
		int lineCnt = sc.nextInt();
		for(int i=1; i<=stuCnt; i++) {//조건 i=1, i는 학생 수, i는 1씩 는다.
			System.out.print(i+"\t");//출력하자
			if(i % lineCnt==0) {
				System.out.println();
			}
		}
		// 총 몇줄인지 출력
		int row=0;
		if(stuCnt%lineCnt==0) {
			row=stuCnt/lineCnt;
		}else {
			row = (stuCnt/lineCnt)+1;
		System.out.println();
		System.out.println("총 라인 수 :"+row);
		
		//삼항연산자(조건연산자)
		int r=(stuCnt%lineCnt==0)?stuCnt/lineCnt:(stuCnt/lineCnt)+1;
		System.out.println("총 라인 수!!!:"+r);
	}
		sc.close();
}
}