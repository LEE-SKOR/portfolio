package dayexercise;

public class Student {
	int studentID;
	String StudentName;
	int grade;
	String address;
	
	
	public void study() {
		System.out.println(StudentName+" 공부하다");
	}
	public void play() {
		System.out.println(StudentName+" 운동하다");
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.studentID = 1;
		s1.StudentName = "홍길동";
		s1.grade = 2;
		s1.address = "부산";
		
		s1.study();
	}

}
