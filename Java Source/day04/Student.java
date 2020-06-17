package day04;

public class Student {
		int StudentID;//학번
		String name;//이름
		int grade;//학년
		String address;//주소
		
		//공부하다 라는 행위 => 함수(메소드)
		public void study() {
			System.out.println(name+" 공부하다 ");
		}
		public void play() {
			System.out.println(name+" 운동한다 ");
		}
		
		public static void main(String[] args) {
			Student s1 = new Student();
			s1.StudentID = 100;//s1의 학번
			s1.name = "홍길동";//s1의 이름
			s1.grade = 1;//s1의 학년
			s1.address = "부산";//s1의 주소
			System.out.println("s1 이름 : "+s1.name);//s1의 이름을 출력
			System.out.println("===============================");
			Student s2 = new Student();
			s2.StudentID = 200;
			s2.name = "이순신";
			s2.grade = 4;
			s2.address = "서울";
			System.out.println("s1 주소 : "+s2.name);
			//이름이 강감찬이고 3학년,인천에 사는 학생 s3을
			//생성하고 s3의 이름과 주소를 출력하시오
			System.out.println("===============================");
			System.out.println(s1.name+"의 주소는 "+s1.address+"입니다");
			System.out.println("===============================");
			Student s3 = new Student();
			s3.StudentID = 300;
			s3.name = "강감찬";
			s3.grade = 3;
			s3.address ="인천";
			System.out.println("s3 의 이름은 "+s3.name);
			System.out.println("s3 의 주소는 "+s3.address);
			System.out.println("===============================");
			//홍길동이 공부하다
			s1.study();
			//강감찬이 공부하다
			s3.study();
			//학생은 play()라는 함수를 가지고 있고...
			//여기에서 이름 운동한다 라는 값을 출력하시오
			System.out.println("===============================");
			//홍길동이 운동한다
			s1.play();
			//강감찬이 운동한다
			s3.play();
			System.out.println("===============================");
	}

}
