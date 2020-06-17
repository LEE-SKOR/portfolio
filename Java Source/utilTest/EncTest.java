package utilTest;

public class EncTest {
	
	public String decrypt(String str1) {
		String dap = "";
		for(int i=0; i<str1.length(); i++) {
			if(str1.charAt(i)==' ') {
				dap+=str1.charAt(i);
			}else {
				dap +=(char)(str1.charAt(i)-2);
			}		
	}
		return dap;
	}
	public String encrypt(String msg) {
		String dap = "";
		System.out.println(msg.charAt(0));
		for(int i=0; i<msg.length(); i++) {
			if(msg.charAt(i)==' ') {
				dap+=msg.charAt(i);
			}else {
				dap +=(char)(msg.charAt(i)+2);
		}
			
	}
		return dap;
	}
	public static void main(String[] args) {
		EncTest enc = new EncTest();
		//String msg = "히히 신난다.";
		String msg = "Hi.. Glad to meet you!!";
		System.out.println("암호화 전 : "+msg);
		String str1 = enc.encrypt(msg);
		System.out.println("암호화 후 : "+str1);
		System.out.println("복호화 후 : "+enc.decrypt(str1));
	}
}
