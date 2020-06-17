package threadTest;

public class GuguRunnable implements Runnable{
	private int dan;
	
	public GuguRunnable(int dan) {
		this.dan = dan;
	}

	public static void main(String[] args) {
		GuguRunnable g1 = new GuguRunnable(5);
		GuguRunnable g2 = new GuguRunnable(7);
		GuguRunnable g3 = new GuguRunnable(3);
		Thread th1 = new Thread(g1);
		Thread th2 = new Thread(g2);
		Thread th3 = new Thread(g3);
		th1.start();
		th2.start();
		th3.start();

	}

	@Override
	public void run() {
		for(int i=1; i<10; i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
