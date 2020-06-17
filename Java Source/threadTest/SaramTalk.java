package threadTest;

public class SaramTalk {
	private String name;
	
	public SaramTalk(String name) {
		this.name = name;
	}
	public void speak(){
		for(int i=0; i<5; i++) {
			System.out.println(name +" 이 말한다.");
		}
	}

	public static void main(String[] args) {
		SaramTalk s1 = new SaramTalk("홍길동");
		SaramTalk s2 = new SaramTalk("이순신");
		SaramTalk s3 = new SaramTalk("강감찬");
		s1.speak();
		s2.speak();
		s3.speak();
		
	}

}
