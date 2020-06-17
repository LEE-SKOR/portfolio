package cooperation;

public class Bus {
	private int busNumber;//¹ö½º¹øÈ£
	private int passengerCount;//½Â°´¼ö
	private int money;//¼öÀÔ
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	public void take(int money) {//½Â°´ÀÌ µ·À» ³»°í Å¾½Â
		this.money += money;//¼öÀÔÁõ°¡
		passengerCount++;//½Â°´ ¼ö Áõ°¡
	}
	public void showInfo() {
		System.out.println("¹ö½º "+busNumber);
		System.out.println("½Â°´ "+passengerCount);
		System.out.println("¼öÀÔ "+money);
	}
	
}
