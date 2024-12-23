package work2;

public class Java1213_5 {
	public static void main(String[] args) {
		for (int i=1; i<=39; i++) {
			if ((i-4)%10 == 0) {
				continue;
			}
			System.out.print(i+ " ");
		}
		System.out.println( );
		int count=9*3+8;
		System.out.println("總共有"+count+"個");
	}

}
