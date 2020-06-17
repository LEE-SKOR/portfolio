package threadTest;

public class SaramThread extends Thread {
	private String name;
	
	public SaramThread(String name) {
		this.name = name;
	}
		
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(name +"이 말한다.");
		}
	}

	public static void main(String[] args) {
		SaramThread s1 = new SaramThread("홍길동");
		SaramThread s2 = new SaramThread("이순신");
		SaramThread s3 = new SaramThread("강감찬");
		s1.start();
		s2.start();
		s3.start();
		
	}

}
