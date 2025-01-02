package work4;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入西元年(yyyy): ");
		int year = sc.nextInt();
		System.out.print("請輸入月份(mm): ");
		int month = sc.nextInt();
		System.out.print("請輸入日期(dd): ");
		int day = sc.nextInt();

		int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			daysInMonth[1] = 29;
		}
		if (month < 1 || month > 12 || day < 1 || day > daysInMonth[month - 1]) {
			System.out.println("輸入的日期不合法!");
		} else {
			int dayOfYear = 0;
			for (int i = 0; i < month - 1; i++) {
				dayOfYear += daysInMonth[i];
			}
			dayOfYear += day;
			System.out.println("輸入的日期為該年第" + dayOfYear + "天");
		}
		sc.close();
	}

}
