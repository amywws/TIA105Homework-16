package work4;

public class Q3 {
	public static void main(String[] args) {
		String[] planets = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		String vowels = "aeiouAEIOU";
		int vowelCount = 0;
		for(int i = 0; i < planets.length; i++) {
			String planet = planets[i];
		    for(int j = 0; j < planet.length(); j++) {
		    	if (vowels.indexOf(planet.charAt(j)) != -1) {
		    		vowelCount++;
		    	}
		    }
		    
		}
		System.out.println("母音總數: "+ vowelCount);
	}
}
