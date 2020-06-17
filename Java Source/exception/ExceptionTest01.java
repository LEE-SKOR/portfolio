package exception;

public class ExceptionTest01 {

	public static void main(String[] args) {
		int[]arr = new int[5];
		String str="";
		try {
			System.out.println(str.length());
			for(int i=0; i<5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외발생");
		}catch(NullPointerException n) {
			System.out.println("null 값이네요");
		}finally {
			System.out.println("반드시 수행되는 문장");
		}

	}

}
