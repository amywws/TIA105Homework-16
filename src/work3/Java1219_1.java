package work3;

import java.util.Scanner;

public class Java1219_1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Input numbers");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		
		if(a+b>c && b+c>a && c+a>b) {
			if(a==b && b==c) {
				System.out.println("正三角形");
			}else if(a==b || b==c || c==a) {
				System.out.println("等腰三角形");
			}else {
				System.out.println("其他三角形");
			}
		}else {
			System.out.println("不是三角形");
		}
		sc.close();
	}

}
