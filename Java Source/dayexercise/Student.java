package dayexercise;

public class Student {
	int studentID;
	String StudentName;
	int grade;
	String address;
	
	
	public void study() {
		System.out.println(StudentName+" �����ϴ�");
	}
	public void play() {
		System.out.println(StudentName+" ��ϴ�");
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.studentID = 1;
		s1.StudentName = "ȫ�浿";
		s1.grade = 2;
		s1.address = "�λ�";
		
		s1.study();
	}

}
