package day07;

public class IPTV extends ColorTV{
	protected String ipaddress;
	public IPTV(String ipaddress,int inch, int pixel) {
		super(inch,pixel);
		this.ipaddress = ipaddress;
	}
	public void printProperty() {
		System.out.println("���� IPTV�� "+ipaddress+"�ּ�");
		super.printProperty();
	}
}