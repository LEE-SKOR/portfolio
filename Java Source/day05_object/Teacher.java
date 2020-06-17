package day05_object;

import java.util.Scanner; //스캐너를 임포트하고

public class Teacher {//클래스는 티쳐
	static Scanner sc = new Scanner(System.in);//스캐너를 만들고
	StudentBean[]arr = new StudentBean[50];//배열 50을 만듬
	int cnt;//멤버변수 int는 초기값이 0
	
	
	public void showMenu() {
		System.out.println("선택하세요...");
		System.out.println("1.데이터입력");
		System.out.println("2.전체보기");
		System.out.println("3.종료");
		System.out.print("선택>>");
	}
	public void inputData() {
		System.out.println("성적입력 시작>>");
		System.out.print("이름>>");
		String name = ScoreMain.sc.next();
		System.out.print("국어>>");
		int kor = ScoreMain.sc.nextInt();
		System.out.print("영어>>");
		int eng = ScoreMain.sc.nextInt();
		System.out.print("수학>>");
		int math = ScoreMain.sc.nextInt();
		//배열에 StudentBean 객체 넣기
		arr[cnt] = new StudentBean(name,kor,eng,math);
		cnt++;
	}
	public void rankMethod() {
		for(int i=0; i<cnt; i++) {
			for(int j=i+1; j<cnt; j++) {
				if(arr[i].getTotal()>arr[j].getTotal()) {
					arr[j].setRank(1);
				}else if(arr[i].getTotal() < arr[i].getTotal()) {
					arr[i].setRank(1);
				}
			}
		}
	}
	public void viewData() {
		rankMethod();
		System.out.println("성적보기");
		System.out.println("이름\t총점\t평균\t석차");
		int sum=0;
		for(int i=0; i<cnt; i++) {
			sum+=arr[i].getTotal();
			System.out.print(arr[i].getName()+"\t");
			System.out.print(arr[i].getTotal()+"\t");
			System.out.print(arr[i].getAvg()+"\t");//이름만 출력
			System.out.print(arr[i].getRank()+"\n");
		}
		System.out.println("학급 총전 : "+sum);//allHap
		System.out.println("학급 평균 : "+(sum/cnt));//allAvg
	}
}
