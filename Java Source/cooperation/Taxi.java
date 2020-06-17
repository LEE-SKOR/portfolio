package cooperation;

public class Taxi {
	
	private String companyName;//¹ö½º¹øÈ£
	private int passengerCount;//½Â°´¼ö
	private int money;//¼öÀÔ
	
	public Taxi(String companyName) {
		this.companyName = companyName;
	}
	public void take(int money) {//½Â°´ÀÌ µ·À» ³»°í Å¾½Â
		this.money += money;//¼öÀÔÁõ°¡
		passengerCount++;//½Â°´ ¼ö Áõ°¡
	}
	public void showInfo() {
		System.out.println("ÅÃ½Ã "+companyName);
		System.out.println("½Â°´ "+passengerCount);
		System.out.println("¼öÀÔ "+money);
	}
	
}