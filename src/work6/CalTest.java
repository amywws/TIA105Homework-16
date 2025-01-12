package work6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();
		
		while (true) {
			try {
				System.out.println("請輸入x的值: ");
				String xInput = sc.nextLine();
				int x = Integer.parseInt(xInput);
				
				System.out.println("請輸入y的值: ");
				String yInput = sc.nextLine();
				int y = Integer.parseInt(yInput);
				
				int result = cal.powerXY(x, y);
				System.out.println(x +"的" + y +"次方= "+ result);
				break;
				
			} catch (NumberFormatException e) {
				System.out.println("輸入格式不正確，請輸入整數");
				
			} catch (CalException e) {
				e.printStackTrace();
			}
			
		}
		
		sc.close();
	}
}
