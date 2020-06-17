package threadTest;

public class SaramRunnable implements Runnable {
	private String name;
	
	public SaramRunnable(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		SaramRunnable sr1 = new SaramRunnable("홍길동");
		SaramRunnable sr2 = new SaramRunnable("이순신");
		SaramRunnable sr3 = new SaramRunnable("강감찬");
		Thread th1 = new Thread(sr1);
		Thread th2 = new Thread(sr2);
		Thread th3 = new Thread(sr3);
		th1.start();
		th2.start();
		th3.start();
	}


	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(name+"이 말한다.");
			try {
				Thread.sleep(1000);//1000ms -> 1초
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
