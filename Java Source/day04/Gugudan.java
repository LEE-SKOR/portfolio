package day04;

public class Gugudan {	
	int dan;

	//public Gugudan() {
	//}	
	public Gugudan(int dan) {
		this.dan = dan;
		}
	public void viewData() {
		System.out.println(dan+"단 출력");
		for(int i=1; i<10; i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}
		}
	
	public static void main(String[] args) {
		Gugudan g1 = new Gugudan(5);
		g1.viewData();//5단
		
		Gugudan g2 = new Gugudan(7);
		g2.viewData();//7단
		
		Gugudan g3 = new Gugudan(9);
		g3.viewData();//9단
		
	}

}
