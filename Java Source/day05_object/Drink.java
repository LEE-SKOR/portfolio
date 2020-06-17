package day05_object;

public class Drink {
	
	String drink;
	int price;
	int cups;

	public Drink(String drink, int price, int cups) {
		this.drink = drink;
		this.price = price;
		this.cups = cups;
	}
	public int getTotal() {
		return price * cups;
	}

		public void getData() {

			System.out.print(drink+"\t");
			System.out.print(price+"\t");
			System.out.print(cups+"\t");
			System.out.print(price*cups+"\n");
			System.out.println("Total "+price*cups);
		}
}
