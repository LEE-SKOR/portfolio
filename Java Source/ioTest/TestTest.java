package ioTest;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestTest {

	public static void main(String[] args) throws FileNotFoundException {
		try(FileOutputStream fos = new FileOutputStream("data2.txt");
				DataOutputStream dos = new DataOutputStream(fos)){
			dos.writeUTF("����1");
			dos.writeUTF("����2");
			dos.writeUTF("����3");
			dos.writeUTF("����4");
			dos.writeUTF("����5");
			
		} catch (IOException e) {
			e.printStackTrace();
		
		}try(FileInputStream fis = new FileInputStream("data2.txt");
				DataInputStream dis = new DataInputStream(fis)){
			
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
