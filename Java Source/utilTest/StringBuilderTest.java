package utilTest;

public class StringBuilderTest {

	public static void main(String[] args) {
		String str = "String";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);
		sb.append("자바");//문자열 추가
		System.out.println(sb);
		sb.insert(2,"oracle");//문자열 2번부터 추가
		System.out.println(sb);
		System.out.println(sb.toString());
		sb.delete(2,5);//문자열 2에서 5까지 삭제
		System.out.println(sb);
		sb.reverse();//거꾸로
		System.out.println(sb);
		System.out.println(sb.charAt(3));//문자열 3번에 위치한 문자
		System.out.println(sb.substring(3));//문자열 3부터 추출
		System.out.println(sb.substring(3,5));//문자열 3부터 5까지 추출

	}

}
