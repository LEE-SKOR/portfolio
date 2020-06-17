package cooperation;

public class Subway {
	private String subwayNumber;//ÁöÇÏÃ¶ ¹øÈ£
	private int passengerCount;//½Â°´¼ö
	private int money;//¼öÀÔ
		
	public Subway(String subwayNumber) { 
		this.subwayNumber = subwayNumber;
	}
	public void take(int money) {//½Â°´ÀÌ µ·À» ³»°í Å¾½Â
		this.money += money;//¼öÀÔÁõ°¡
		passengerCount++;//½Â°´ ¼ö Áõ°¡
	}
	public void showInfo() {
		System.out.println("ÁöÇÏÃ¶ "+subwayNumber);
		System.out.println("½Â°´ "+passengerCount);
		System.out.println("¼öÀÔ "+money);
	}
	
}