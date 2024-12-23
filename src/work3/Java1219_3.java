package work3;
import java.util.Scanner;
import java.util.ArrayList;
public class Java1219_3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("請輸入你不想要的數字(1~9):");
		int dislikedNumber= sc.nextInt();
		if(dislikedNumber< 1 || dislikedNumber> 9) {
			System.out.println("輸入錯誤,請輸入1~9之間的數字!");
			sc.close();
//			return;
		}
	    // 創建 ArrayList 存放可選擇的號碼
        ArrayList<Integer> availableNumbers = new ArrayList<>();

        // 遍歷 1 到 49 的數字，將不包含不想要的數字的號碼加入可選擇的列表
        for (int i = 1; i <= 49; i++) {
            // 如果數字的個位數或十位數包含不喜歡的數字，則排除
            if (!String.valueOf(i).contains(String.valueOf(dislikedNumber))) {
                availableNumbers.add(i);
            }
        }

        // 顯示可選擇的號碼和總數
        System.out.println("你可以選擇的號碼有: " + availableNumbers);
        System.out.println("總共有 " + availableNumbers.size() + " 個號碼可以選擇");

        // 關閉 Scanner
        sc.close();
	}
}
	

