package work4;
import java.util.Scanner;
public class Q4 {
	public static void main(String[] args) {
		int[][] employees = {
				{25,500}, {19, 1500}, {27, 1000}, {34, 800}, {42, 2000}
		};
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入預借的金額: ");
		int amount = sc.nextInt();
		int count = 0;
		System.out.println("有錢可借的員工編號: ");
		for(int i = 0; i < employees.length; i++) {
			if(employees[i][1] >= amount) {
				System.out.print(employees[i][0] + " ");
				count++;
			}
		}
		System.out.println("共" + count + "人!");
		sc.close();
	}
}
