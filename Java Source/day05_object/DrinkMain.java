package day05_object;

public class DrinkMain {

	public static void main(String[] args) {
		Drink coffee = new Drink("Ä¿ÇÇ",500,3);
		coffee.getData();//Ä¿ÇÇ 500 3 1500
		coffee.getTotal();
		Drink tea = new Drink("³ìÂ÷",800,5);
		tea.getData();//³ìÂ÷ 800 5 4000
		tea.getTotal();
		System.out.println("ÃÑ ÆÇ¸Å±Ý¾× : "+ (coffee.getTotal() + tea.getTotal()));
	
	}

}
