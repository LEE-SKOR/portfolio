package ioTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileCopy {

	public static void main(String[] args) {
		Scanner sfis = null;
		PrintStream ps =null;
		try {
			sfis = new Scanner(new File("src\\ioTest\\Friend.java"));
			ps = new PrintStream("src\\ioTest\\copy.txt");
			int cnt = 1;
			while(sfis.hasNext()) {
				String str = sfis.nextLine();
				ps.println(cnt+" "+str);
				cnt++;
				}		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			sfis.close();
			ps.close();
		}
		
			
			
		}
	
	}
