package test;
class Person{
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void show() {
		System.out.println(name+" "+age+" ");
		}
	}
		class Student extends Person{
		String major;
		public Student(String name, int age, String major) {
		super(name,age);
		this.major = major;
		}
		public void show() {
			super.show();
			System.out.println(major);
		}
	}
	
	public class Test {
			int y;
	public static void main(String[] args) {
		Person p =new Student("���ڹ�",25,"ȸ���");
		p.show();
		int x=0;//���������� �ݵ�� �ʱⰪ����
		//System.out.println(x);
		Test t = new Test();
		//System.out.println(t.y);//��������� int���̸� 0���� ����
		}
	
	}


