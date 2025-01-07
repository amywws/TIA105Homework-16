package work4;

public class Q3 {

	public static void main(String[] args) {
		String[] planets = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int vowelCount = 0;

		for (int i = 0; i < planets.length; i++) {
			for (int j = 0; j < planets[i].length(); j++) {
				char ch = planets[i].charAt(j);
				switch (ch) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					vowelCount++;
					break;
				default:
					break;
				}
			}
		}

		System.out.println("八大行星名稱中的母音總數為: " + vowelCount);
	}
}
