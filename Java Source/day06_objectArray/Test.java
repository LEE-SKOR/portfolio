package day06_objectArray;

public class Test {

	public static void main(String[] args) {
		// ���ĺ� �ҹ��ڸ� 2���ھ� 13��(13��2��)�� ����ϴ� ���α׷��� ������ �迭�� ������ ������.
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
