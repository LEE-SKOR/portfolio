package day04;

public class Bank {
	String name;//이름        //멤버 변수  (전역 변수)
	int Money;//잔액
	
	public Bank() {
		
	}
	public Bank(String name,int Money) {
		this.name = name;
		this.Money = Money; 
	}

	
	public void inputMoney(int don) {//입금//don은 지역 변수
		Money += don;
		System.out.println(name+"님이 "+Money +"원 입금!");
	}
	
	public void outMoney(int don) {//출금
		if(Money<don) {
			System.out.println(name+"님 잔액부족");
			return;//조건에 맞지않으면 빠져나가라
		}
			Money -= don;//10000-20000
			System.out.println(don +"원 출금!");	
		}
	
	public void getMoney() {//잔액확인
			System.out.println(name+"님의 잔액은 "+ Money +"원 입니다.");
	}
	public static void main(String[]args) {
		
		Bank b1 = new Bank();//Bank 객체 b1을 만들고
		
		b1.name = "홍길동";//b1 의 이름은 홍길동
		
		b1.inputMoney(5000);//홍길동이 5000원을 입금하고 잔액을 확인함
		
		b1.getMoney();//홍길동님의 잔액은 5000원 입니다.
		
		b1.outMoney(3000);//홍길동이 3000원을 출금하고 잔액확인
		
		b1.getMoney();//홍길동님의 잔액은 2000원 입니다
		
		//이순신 고객이 10000원을 입금
		//잔액확인
		
		Bank b2 = new Bank(); //Bank 객체 b2를 만들고
		
		b2.name = "이순신";//b2 의 이름은 이순신
		
		b2.inputMoney(10000);//이순신이 10000원을 입금!
		
		b2.getMoney();//이순신 잔액확인
		
		b2.outMoney(20000);//잔액부족
		
		b2.getMoney();//이순신님 10000원
		
		Bank b3 = new Bank("강감찬",20000);
		b3.outMoney(50000);
		b3.getMoney();
	}
}
