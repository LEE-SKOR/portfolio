package utilTest;

import java.util.Calendar;

public class CalendarTest {
	public static void printCalendar(String msg, Calendar cal) {
		//��,��,��
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"/"+month+"/"+day);
		//����
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		int d = cal.get(Calendar.DAY_OF_WEEK);
		String yul="";
		switch(d) {
		case Calendar.SUNDAY :yul = "��";break;
		case Calendar.MONDAY :yul = "��";break;
		case Calendar.TUESDAY :yul = "ȭ";break;
		case Calendar.WEDNESDAY :yul = "��";break;
		case Calendar.THURSDAY :yul = "��";break;
		case Calendar.FRIDAY :yul = "��";break;
		case Calendar.SATURDAY :yul = "��";break;
		}
		String[] arr = {"��","��","ȭ","��","��","��","��"};
		
		System.out.println("�迭���� : "+arr[cal.get(Calendar.DAY_OF_WEEK)-1]);		
		System.out.println("switch���� : "+yul);
		System.out.println(Calendar.SATURDAY);
		int ampm = cal.get(Calendar.AM_PM);
		String ampmStr="";
		/*
		if(ampm==Calendar.AM) {
			ampmStr="����";
		}else {		
			ampmStr = "����";
		}*/
		ampmStr = (ampm==Calendar.AM)?"����" : "����";
		int h = cal.get(Calendar.HOUR);
		int hourofDay = cal.get(Calendar.HOUR_OF_DAY);
		int m = cal.get(Calendar.MINUTE);
		int s = cal.get(Calendar.SECOND);
		System.out.println("����ð� : "+ampmStr+" "+h+":"+m+":"+s);
		System.out.println("����ð� : "+hourofDay+":"+m+":"+s);
	}
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		CalendarTest.printCalendar("����",now);
		now.set(1788,0,1);
		CalendarTest.printCalendar("someday",now);

	}

}
