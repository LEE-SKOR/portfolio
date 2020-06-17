package utilTest;

import java.util.Calendar;

public class CalendarTest {
	public static void printCalendar(String msg, Calendar cal) {
		//년,월,일
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"/"+month+"/"+day);
		//요일
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		int d = cal.get(Calendar.DAY_OF_WEEK);
		String yul="";
		switch(d) {
		case Calendar.SUNDAY :yul = "일";break;
		case Calendar.MONDAY :yul = "월";break;
		case Calendar.TUESDAY :yul = "화";break;
		case Calendar.WEDNESDAY :yul = "수";break;
		case Calendar.THURSDAY :yul = "목";break;
		case Calendar.FRIDAY :yul = "금";break;
		case Calendar.SATURDAY :yul = "토";break;
		}
		String[] arr = {"일","월","화","수","목","금","토"};
		
		System.out.println("배열요일 : "+arr[cal.get(Calendar.DAY_OF_WEEK)-1]);		
		System.out.println("switch요일 : "+yul);
		System.out.println(Calendar.SATURDAY);
		int ampm = cal.get(Calendar.AM_PM);
		String ampmStr="";
		/*
		if(ampm==Calendar.AM) {
			ampmStr="오전";
		}else {		
			ampmStr = "오후";
		}*/
		ampmStr = (ampm==Calendar.AM)?"오전" : "오후";
		int h = cal.get(Calendar.HOUR);
		int hourofDay = cal.get(Calendar.HOUR_OF_DAY);
		int m = cal.get(Calendar.MINUTE);
		int s = cal.get(Calendar.SECOND);
		System.out.println("현재시각 : "+ampmStr+" "+h+":"+m+":"+s);
		System.out.println("현재시각 : "+hourofDay+":"+m+":"+s);
	}
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		CalendarTest.printCalendar("현재",now);
		now.set(1788,0,1);
		CalendarTest.printCalendar("someday",now);

	}

}
