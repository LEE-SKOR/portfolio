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
		System.out.println("선택하세요>>");
		System.out.println("1.데이터 입력 2.전체보기 3.학생찾기 4.저장/종료");
		int num = sc.nextInt();
		sc.nextLine();
		if(num==1) {
			System.out.println("이름>>");
			String name = sc.nextLine();
			System.out.println("학과>>");
			String department = sc.nextLine();
			System.out.println("학번>>");
			int studentID = sc.nextInt();
			System.out.println("학점평균>>");
			double score = sc.nextDouble();
			
			Student s = new Student();
			s.setName(name);
			s.setDepartment(department);
			s.setStudentID(studentID);
			s.setScore(score);
			arr.add(s);
			
			
		}else if(num==2) {
			for(Student s : arr) {
				System.out.println("이름 : "+s.getName());
				System.out.println("학과 : "+s.getDepartment());
				System.out.println("학번 : "+s.getStudentID());
				System.out.println("학점 : "+s.getScore());
				System.out.println();
			}
		}else if(num==3) {
			
			
		}else if(num==4) {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(arr);
			System.out.println("종료");
			System.exit(0);
			
		}else {//입력오류
			System.out.println("입력오류");
			
		}
	}
}
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		StudentManager sm = new StudentManager();
		
		sm.fileUse();
		
		

	}
}
