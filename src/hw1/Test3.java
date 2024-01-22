package hw1;

public class Test3 {
	public static void main(String[] args) { 
//		• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int x = 256559;
		int day = (60 * 60 * 24);
		int hour = (60 * 60);
		int min = 60;
		int totalDay = x / day;
		System.out.println(totalDay + "天");
		int totalHour = (x % (day * totalDay)) / hour;
		System.out.println(totalHour + "小時");
		int totalMin = (x % (totalDay * day + totalHour * hour)) / min;
		System.out.println(totalMin + "分");
		int totalSec = x % (totalDay * day + totalHour * hour + totalMin * min);
		System.out.println(totalSec + "秒");
	}
}
