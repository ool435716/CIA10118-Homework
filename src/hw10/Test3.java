package hw10;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("請輸入日期(年月日,例如:20110131): ");
			String regex = "^[0-9]{8}$";
			String s = scanner.next();
			if(s.matches(regex)) {
				System.out.println("欲格式化成(1)年/月/日(2)月/日/年(3)日/月/年: ");
				int num = scanner.nextInt();
				switch (num){
					case 1: {
						SimpleDateFormat sd1 = new SimpleDateFormat("yyyyMMdd");
						SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd");
						try {
							Date d1 = sd1.parse(s);
							System.out.println(sd.format(d1));
						} catch (ParseException e) {
								e.printStackTrace();
						}
						break;
					}
					case 2: {
						SimpleDateFormat sd1 = new SimpleDateFormat("yyyyMMdd");
						SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy");
						try {
							Date d1 = sd1.parse(s);
							System.out.println(sd.format(d1));
						} catch (ParseException e) {
							e.printStackTrace();
						}
						break;
					}
					case 3: {
						SimpleDateFormat sd1 = new SimpleDateFormat("yyyyMMdd");
						SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
						try {
							Date d1 = sd1.parse(s);
							System.out.println(sd.format(d1));
						} catch (ParseException e) {
							e.printStackTrace();
						}
						break;
					}
				}
			}else {
				System.out.println("日期格式不正確，請再輸入一次!");
				continue;
			}
			break;
		}
		
			
		scanner.close();

	}
}
