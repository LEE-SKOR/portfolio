package day06_objectArray.arraylist;
//import java.util.ArrayList;

public class Student {//227
	int studentID;
	String studentName;
	Subject[] subjectList;
	int index;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new Subject[10];		
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList[index++]=subject;
		
	}
	public void showStudentInfo() {
		int total = 0;
		for(Subject s : subjectList) {
			if(s==null)break;
			total += s.getScorePoint();
			System.out.println("학생 "+studentName+ "의 "+s.getName()+" 과목 성적은 "+s.getScorePoint()+ "입니다.");
		}
		System.out.println("학생 "+studentName+"의 총점은 "+total+" 입니다.");
	}
}
