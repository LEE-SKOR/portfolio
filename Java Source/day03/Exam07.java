package day03;

public class Exam07 {

	public static void main(String[] args) {
		int[][]arr = new int[3][4];
		arr[0][0] = 1;
		arr[0][1] = 2;
		int[][]a = {{1,2,3,4},{11,22,33,44},{111,222,333,44}};
		System.out.println(a[1][2]);
		for(int i=0; i<a.length; i++) { //°ýÈ£ÀÇ °¹¼ö
			for(int j=0; j<a[i].length; j++) { //°ýÈ£ ³»¿¡ ÀÖ´Â ¹®ÀÚÀÇ °¹¼ö
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}
