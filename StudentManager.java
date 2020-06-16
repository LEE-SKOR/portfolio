package com.exam01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class StudentManager {
	static Scanner sc = new Scanner(System.in);
	ArrayList<Student> arr = new ArrayList<Student>();
	File dir,file;
	
	public StudentManager() throws ClassNotFoundException, IOException {
		dir = new File("src\\com\\exam01");
		file = new File(dir,"StudentInfo.txt");
		if(file.exists()) {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			arr =(ArrayList<Student>)ois.readObject();
		} else {
			file.createNewFile();
		}
		
		
	}
	
	
	public static void showMenu() {
	System.out.println("�����ϼ���>>");
	System.out.println("1.�������Է�");
	System.out.println("2.��ü����");
	System.out.println("3.�л�ã��");
	System.out.println("4.����/����");
	}
	
	public void inputData() {
	while(true) {
		System.out.println("�л� �̸�,�а�,�й�,��������� �Է��ϼ���.(�Է��� ,�� �����ϰ� ����� X");
		System.out.println(">>");
		String text = StudentManager.sc.nextLine();
		if(text.toLowerCase().equals("x")) {
			System.out.println("�Է�����");
			break;
		}
		StringTokenizer st = new StringTokenizer(text,",");
		String name = st.nextToken();
		String department = st.nextToken();
		String studentID = st.nextToken();
		double average = Double.parseDouble(st.nextToken());
		arr.add(new Student(name,department,studentID,average));
		}
	}
	public void viewData() {
		for(Student s : arr) {
			System.out.println("�̸� : "+s.getName());
			System.out.println("�а� : "+s.getDepartment());
			System.out.println("�й� : "+s.getStudentID());
			System.out.println("������� : "+s.getAverage());
			System.out.println("--------------------");
		}
	}
	public void searchData() {
		System.out.println("ã�� ��� �̸��� �Է��ϼ���>>");
		String searchName = StudentManager.sc.next();
		Student s = search(searchName);
		if(s==null) {
			System.out.println("ã�� �л� ����.");
			return;
		}
		System.out.println("�̸� : "+s.getName());
		System.out.println("�а� : "+s.getDepartment());
		System.out.println("�й� : "+s.getStudentID());
		System.out.println("������� : "+s.getAverage());
	}
	private Student search(String searchName) {
		for(int i=0; i<arr.size(); i++) {
			if(searchName.equals(arr.get(i).getName())) {
				return arr.get(i);
			}
		}
		return null;
	}

	public void saveData() throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		oos.writeObject(arr);
		System.out.println("����");
		System.exit(0);
		
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		StudentManager sm = new StudentManager();
		while(true) {
			StudentManager.showMenu();
			int num = sc.nextInt();
			sc.nextLine();
			switch(num) {
			case 1 :sm.inputData();break;
			case 2 :sm.viewData();break;
			case 3 :sm.searchData();break;
			case 4 :sm.saveData();
			System.out.println("���α׷� ����");
			System.exit(0);
			default :
			}
		}

	}

}
