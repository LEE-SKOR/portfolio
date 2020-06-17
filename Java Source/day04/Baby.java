package day04;

public class Baby {
	String name;
	int age;
	
	public Baby() {
		
	}
	public Baby(String name) {
		this.name = name;
	}
	
	public void smile() {//웃는다
	System.out.println(name+ " 웃는다");
	}
	public void cry() {//운다	
	System.out.println(name +" 운다");
	}
	public static void main(String[] args) {
		//baby 객체 b1을 만들고
		//이름 베이비1 나이2
		//베이비1이 웃는다
		
		//Baby 객체 b2를 만들고
		//이름 베이비2 나이1
		//베이비2 운다
		
		Baby b1 = new Baby();
		b1.name = "베이비1";
		b1.age = 2;
		b1.smile();
		
		Baby b2 = new Baby();
		b2.name = "베이비2";
		b2.age = 1;
		b2.cry();
	
			
		}
		
	}
