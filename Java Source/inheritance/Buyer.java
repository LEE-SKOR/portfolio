package inheritance;

import java.util.ArrayList;

public class Buyer {
	private int money;
	private int point;
	//Product[] arr = new Product[10];
	ArrayList<Product> list = new ArrayList<>();
	int cnt;
	
	//ArrayList사용
	public Buyer(int money) {
		this.money = money;
	}
	
	//구매하기
	public void buy(Product p) {
		list.add(p);
		money -= p.price;
		point +=p.bonusPoint;
		
	}
	//구매내역
	public void showInfo() {
		for(int i=0; i<list.size(); i++) {
			System.out.println("구매 리스트 : "+list.get(i));
			System.out.println(list.get(i).price);
		}
		System.out.println("잔액 : "+money);
		System.out.println("보너스 포인트 : "+point);
	}

}
