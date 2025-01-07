package work5;

public class Q5 {

	public static String genAuthCode() {
		// 定義包含大小寫字母與數字的字元陣列
		char[] characters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
				'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7',
				'8', '9' };

		String authCode = ""; // 用於存儲驗證碼

		// 隨機選取 8 個字元
		for (int i = 0; i < 8; i++) {
			int index = (int) (Math.random() * characters.length); // 使用 Math.random 生成隨機索引
			authCode += characters[index]; // 將字元拼接到驗證碼字串中
		}

		return authCode;
	}

	public static void main(String[] args) {
		// 測試驗證碼生成
		String authCode = genAuthCode();
		System.out.println("本次隨機產生驗證碼為：");
		System.out.println(authCode);
	}
}
