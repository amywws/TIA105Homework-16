package work5;
import java.util.Random;

public class Q2 {
	public static void randAvg() {
		Random random = new Random();
		int[] numbers = new int[10];
		int sum = 0;
		System.out.println("產生的10個隨機數字為: ");
		for(int i =0; i< 10; i++) {
			numbers[i]= random.nextInt(101);
			System.out.print(numbers[i]+ " ");
			sum += numbers[i];
		}
		double avg = sum / 10.0;
		System.out.println();
		System.out.printf("平均值為: %.2f", avg);
	}
	
	public static void main(String[] args) {
		randAvg();
	}

}
