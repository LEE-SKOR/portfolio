package day03;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		int[] data = {10,5,90,100,250,30,77};	
		//최대값
		int max = data[0];
		int maxPos = 0;
		int sum=0;
		for(int i=0; i<data.length; i++) {
			sum += data[i];
			if(max < data[i]) {
				max = data[i];
				maxPos = i+1;
			}
			
		}
		System.out.println("최대값 : "+max);
		//최대값 위치
		System.out.println("최대값 위치 : "+maxPos);
		System.out.println("배열의 합계 : "+sum);
		System.out.println("배열의 평군 : "+sum/data.length);
		System.out.println("배열의 평군 : "+(float)sum/data.length);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("찾는 수를 입력하세요>>");
		int search = sc.nextInt();
		boolean flag = false;
		for(int i=0; i<data.length; i++){
			if(search==data[i]) {
				System.out.println("찾는 수 : "+search);
				System.out.println("찾는 수 "+search+"은"+(i+1)+"번째");
				//flag = true;
			}
		}
		if(flag==false) {
		System.out.println("찾는 수 "+search+"없음");
		}
		sc.close();
    }
}