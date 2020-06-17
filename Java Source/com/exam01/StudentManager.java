package com.exam01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import ioTest.Friend;
import ioTest.FriendMain;

public class StudentManager {
	ArrayList <Student> arr = new ArrayList();
	File dir,file;
	public StudentManager() throws IOException, ClassNotFoundException {
		dir = new File("src\\ioTest");
		file = new File(dir,"Student.txt");
		if(file.exists()) {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			arr = (ArrayList<Student>)ois.readObject();
		}else {
			file.createNewFile();
		}
	}
	
	private void fileUse() throws FileNotFoundException, IOException {
	Scanner sc = new Scanner(System.in);
	
	while(true) {
		System.out.println("�����ϼ���>>");
		System.out.println("1.������ �Է� 2.��ü���� 3.�л�ã�� 4.����/����");
		int num = sc.nextInt();
		sc.nextLine();
		if(num==1) {
			System.out.println("�̸�>>");
			String name = sc.nextLine();
			System.out.println("�а�>>");
			String department = sc.nextLine();
			System.out.println("�й�>>");
			int studentID = sc.nextInt();
			System.out.println("�������>>");
			double score = sc.nextDouble();
			
			Student s = new Student();
			s.setName(name);
			s.setDepartment(department);
			s.setStudentID(studentID);
			s.setScore(score);
			arr.add(s);
			
			
		}else if(num==2) {
			for(Student s : arr) {
				System.out.println("�̸� : "+s.getName());
				System.out.println("�а� : "+s.getDepartment());
				System.out.println("�й� : "+s.getStudentID());
				System.out.println("���� : "+s.getScore());
				System.out.println();
			}
		}else if(num==3) {
			
			
		}else if(num==4) {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(arr);
			System.out.println("����");
			System.exit(0);
			
		}else {//�Է¿���
			System.out.println("�Է¿���");
			
		}
	}
}
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		StudentManager sm = new StudentManager();
		
		sm.fileUse();
		
		

	}
}
