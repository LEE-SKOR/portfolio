package ioTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			int c;
			fis = new FileInputStream("src\\ioTest\\FileTest.java");
			FileOutputStream fos = new FileOutputStream("output.txt");
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
		while((c=fis.read())!=-1) {
				System.out.print((char)c);
				fos.write(c);;
			}
		}catch(IOException e) {
			System.out.println(e);
		}finally {
			
			try {
				
				fis.close();
			}catch(IOException e) {
				System.out.println(e);
			}catch(NullPointerException e) {
				System.out.println(e);
			}
		}
		System.out.println("end");
		
	}

}
