package day03;

public class Exam06 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		//(int)(Math.random()*50);
		int n = 0;
		while(n<arr.length) {//배열크기 10번 반복
			int r = (int)(Math.random()*50);//난수 발생
			if(r==0) {//난수가 0인지 판단
			continue;	
			}else {//난수가 0이 아니면
				arr[n++]=r;
			}
			
		}
		for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i]+"\t");
		}
		System.out.println("\n-----------------------------------------------------------------------------");
		for(int i :arr) {//for-each
			System.out.print(i+"\t");
		}
		
		String[]str= {"one","two","three","four"};
		//for-each
		for(String s :str) {
			System.out.println(s);
		}
	}
}


