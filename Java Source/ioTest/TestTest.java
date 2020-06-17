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
			dos.writeUTF("父技1");
			dos.writeUTF("父技2");
			dos.writeUTF("父技3");
			dos.writeUTF("父技4");
			dos.writeUTF("父技5");
			
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
