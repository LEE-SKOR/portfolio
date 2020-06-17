package ioTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class TokenFileTest2 {

	public static void main(String[] args) {
		Scanner sfis = null;
		PrintStream ps =null;
		try {
			sfis = new Scanner(new File("src\\ioTest\\input.txt"));
			ps = new PrintStream("src\\ioTest\\hex.txt");
			while(sfis.hasNext()) {
				String str = sfis.nextLine();
				String[] tmp = str.split(":");
				for(int i=0; i<tmp.length; i++){
					//System.out.print(tmp[i]+"\t");
					int v = Integer.parseInt(tmp[i]);
					System.out.print(Integer.toHexString(v).toUpperCase()+"\t");//16진수로 출력하고, 영어는 대문자로 출력.
					ps.print(Integer.toHexString(v).toUpperCase()+"\t");	
				}
			}		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			sfis.close();
		}
		
			
			
		}
	
	}
