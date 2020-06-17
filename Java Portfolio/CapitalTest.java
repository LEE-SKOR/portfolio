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
		System.out.println("����" + map.size() + "�� ������ ���� �Է�");
		while(true) {
			System.out.println("����� �����Է�(����� X)>>");
			String cont = CapitalTest.sc.next();
			if(cont.toUpperCase().equals("X")) break;
			
			if(map.containsKey(cont)) {
				System.out.println("�̹� �Է��� �����Դϴ�.");
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
				System.out.println("map�� ����ֽ��ϴ�.");
				return;
			}
		String dosi = map.get(city);
		System.out.println(city + "�� ������ ? ����� x>>");
		String a = CapitalTest.sc.next();
		if(a.toLowerCase().equals("x")) break;
		
		if(a.equals(dosi)) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("�����Դϴ�.");
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
		 System.out.println("����");
		 System.exit(0);
		} catch (IOException e){
			e.printStackTrace();
			System.out.println("���� ���� ����");
		}
		
		
	}
	static public void showMenu()  { 
		System.out.println("**** ���� ���߱� ������ �����մϴ�. ****");
		System.out.println("1.�Է� , 2.����, 3.�������� �� ���� >>");
		
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
			default : System.out.println("�Է¿���");
			}
		}
	}

}
