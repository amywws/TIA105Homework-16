package work2;

public class Java1213_1 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 1) {
				continue;
			}
			sum += i;
		}
		System.out.println(sum);
	}
}
