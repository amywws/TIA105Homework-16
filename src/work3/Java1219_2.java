package work3;
import java.util.Scanner;
import java.util.Random;
public class Java1219_2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Random ran=new Random();
		int targetNumber= ran.nextInt(10);
		int userGuess= -1;
		while (userGuess != targetNumber) {
			System.out.println("請猜一個0 ~ 9之間的數字: ");
			userGuess= sc.nextInt();
			if(userGuess == targetNumber) {
				System.out.println("答對了!答案就是: "+ userGuess);
			}else {
				System.out.println("猜錯囉");
			}
		}
		sc.close();
	}
}
