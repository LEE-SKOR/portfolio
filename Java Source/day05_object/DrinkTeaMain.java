package day05_object;

public class DrinkTeaMain {

	public static void main(String[] args) {
		Drink[]arr = new Drink[100];			
		
		//Ä¿ÇÇ 	500 3 1500
		//Drink d1 = new Drink("Ä¿ÇÇ",500,3);
		//³ìÂ÷ 	800 5 4000
		//Drink d2 = new Drink("³ìÂ÷",800,5);
		//Ä«Æä¶ó¶¼ 1500 5 7 7500
		//Drink d3 = new Drink("Ä«Æä¶ó¶¼",1500,7);
		
		arr[0] = new Drink ("Ä¿ÇÇ",500,3);
		arr[1] = new Drink ("³ìÂ÷",800,5);
		arr[2] = new Drink ("Ä«Æä¶ó¶¼",1500,5);
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==null)break;
			arr[i].getData();
			sum +=arr[i].getTotal();
			
		}
		//ÃÑ ÆÇ¸Å¾×
		System.out.println("ÃÑ ÆÇ¸Å¾× : "+sum);
	}
}