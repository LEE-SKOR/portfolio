package day05_object;

public class Good {
	String name,code,maker;
	double discountRate;
	int price;
	
	public Good(String code, String name, String maker, int price) {
		this.name = name;
		this.price = price;
		this.code = code;
		this.maker = maker;
	}
	public int getSellingPrice() {//판매금액 : 원가격 - 할인가격
		return price - (int)(price*discountRate);
	}
	public void updateDiscountRate(double rate) {//할인율
		discountRate = rate;
	}
	
}
