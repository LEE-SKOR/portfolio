package utilTest;

public class StringBuilderTest {

	public static void main(String[] args) {
		String str = "String";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);
		sb.append("�ڹ�");//���ڿ� �߰�
		System.out.println(sb);
		sb.insert(2,"oracle");//���ڿ� 2������ �߰�
		System.out.println(sb);
		System.out.println(sb.toString());
		sb.delete(2,5);//���ڿ� 2���� 5���� ����
		System.out.println(sb);
		sb.reverse();//�Ųٷ�
		System.out.println(sb);
		System.out.println(sb.charAt(3));//���ڿ� 3���� ��ġ�� ����
		System.out.println(sb.substring(3));//���ڿ� 3���� ����
		System.out.println(sb.substring(3,5));//���ڿ� 3���� 5���� ����

	}

}
