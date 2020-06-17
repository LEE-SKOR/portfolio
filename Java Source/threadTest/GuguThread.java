package threadTest;

public class GuguThread extends Thread{
	private int dan;
	
	public GuguThread(int dan) {
		this.dan=dan;
	}
	public void run() {
		for(int i=1; i<10; i++) {
		System.out.println(dan+"*"+i+"="+dan*i);
		}
		
	}

	public static void main(String[] args) {
		GuguThread g1 = new GuguThread(5);
		g1.start();
		GuguThread g2 = new GuguThread(7);
		g2.start();
		GuguThread g3 = new GuguThread(3);
		g3.start();

	}

}
