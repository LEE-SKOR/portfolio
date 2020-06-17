package day06_objectArray;

public class Test {

	public static void main(String[] args) {
		// 알파벳 소문자를 2글자씩 13줄(13행2열)로 출력하는 프로그램을 이차원 배열로 구현해 보세요.
		char[][] arr = new char[13][2];
		char ch='a';
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=ch++;
			}
		}
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					System.out.print(arr[i][j]);
				}
			System.out.println();
		}
	}
}
