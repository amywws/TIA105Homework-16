package work3;
import java.util.Scanner;
public class Java1219_3 {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("請輸入你討厭的數字 (1~9)：");

        while (true) {
            int dislikedNumber = s.nextInt();
            if (dislikedNumber >= 1 && dislikedNumber <= 9) {
                checkDislikedNumber(dislikedNumber);
                break;
            }
            System.out.println("未輸入合理範圍，請重新輸入 (1~9)：");
        }
        s.close();
    }

    public static void checkDislikedNumber(int num) {
        int count = 0; 
        for (int i = 1; i <= 49; i++) {
            if (i % 10 != num && i / 10 != num) {
                System.out.print(i+" "); 
                count++;
                }
            }
        System.out.println();
        System.out.println("共"+ count+ "個數字");
    }
}

