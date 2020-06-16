package com.exam02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;



public class CapitalTest {
	private HashMap<String,String> map = new HashMap<String,String>();
	static Scanner sc = new Scanner(System.in);
	File dir,file;
	public CapitalTest() {
		dir = new File("src\\com\\exam02");
		file = new File(dir,"CapitalTest.txt");
		map.clear();
		
		try {
			if(!file.exists()) {
				file.createNewFile();
				return;
			}
			Scanner scanner = new Scanner(file);
			while(scanner.hasNext()) {
				String country = scanner.next();
				String capital = scanner.next();
				map.put(country, capital);
			}
			scanner.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void input() {
		System.out.println("현재" + map.size() + "개 나라의 수도 입력");
		while(true) {
			System.out.println("나라와 수도입력(종료는 X)>>");
			String cont = CapitalTest.sc.next();
			if(cont.toUpperCase().equals("X")) break;
			
			if(map.containsKey(cont)) {
				System.out.println("이미 입력한 나라입니다.");
				continue;
			}
			String sudo = CapitalTest.sc.next();
			map.put(cont, sudo);
		}
		
	}
	
	public void quiz() {
		Set<String> set = map.keySet();
		Object[] arr = set.toArray();
		while(true) {
			int n = (int)(Math.random()*map.size());
			
			String city = "";
			try {
				city=(String) arr[n];
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("map이 비어있습니다.");
				return;
			}
		String dosi = map.get(city);
		System.out.println(city + "의 수도는 ? 종료는 x>>");
		String a = CapitalTest.sc.next();
		if(a.toLowerCase().equals("x")) break;
		
		if(a.equals(dosi)) {
			System.out.println("정답입니다.");
		} else {
			System.out.println("오답입니다.");
		}
		
		}
	}
		
		
	
	
	public void save() {
		FileWriter fw = null;
		try {
		 fw = new FileWriter(file); 
		 Set<String>set = map.keySet();
		 Iterator<String>it = set.iterator();
		 while(it.hasNext()) {
			 String key = it.next(); 
			 String value = map.get(key); 
			 fw.write(key); 
			 fw.write(value); 
		 }
		 fw.close();
		 System.out.println("종료");
		 System.exit(0);
		} catch (IOException e){
			e.printStackTrace();
			System.out.println("파일 저장 오류");
		}
		
		
	}
	static public void showMenu()  { 
		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
		System.out.println("1.입력 , 2.퀴즈, 3.파일저장 및 종료 >>");
		
	}
	

	public static void main(String[] args) {
		CapitalTest ca = new CapitalTest();
		while(true) {
			CapitalTest.showMenu();
			int choice = CapitalTest.sc.nextInt();
			switch (choice) {
			case 1 : ca.input(); break;
			case 2 : ca.quiz(); break;
			case 3 : ca.save(); break;
			default : System.out.println("입력오류");
			}
		}
	}

}
