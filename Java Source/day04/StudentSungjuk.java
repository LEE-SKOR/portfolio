package day04;

public class StudentSungjuk {
	String name;
	int Avg;
	int total;
	int kor;
	int eng;
	int math;
	
	public StudentSungjuk() {
		
	}
	public StudentSungjuk(String name,int kor, int eng, int math) {
		this.name = name;
		this.eng = eng;
		this.kor = kor;
		this.math = math;		
	}
	public void getTotal() {
		System.out.println(name+" ÃÑÁ¡ : "+(kor+eng+math));
		
	}
	public String getAvg() {
		return name +" Æò±Õ : "+(kor+eng+math)/3;
		
	}

}

