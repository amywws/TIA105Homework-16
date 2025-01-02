package work4;

public class Q6 {
	public static void main(String[] args) {
        int[][] scores = {
            {10, 35, 40, 100, 90, 85, 75, 70},  
            {37, 75, 77, 89, 64, 75, 70, 95},   
            {100, 70, 79, 90, 75, 70, 79, 90},  
            {77, 95, 70, 89, 60, 75, 85, 89},   
            {98, 70, 89, 90, 75, 90, 89, 90},   
            {90, 80, 100, 75, 50, 20, 99, 75}   
        };
       
        int[] highScoreCount = new int[8];
        for (int i = 0; i < scores.length; i++) {
            int maxScore = findMax(scores[i]); 
            for (int j = 0; j < scores[i].length; j++) {
                if (scores[i][j] == maxScore) {
                    highScoreCount[j]++;
                }
            }
        }
        System.out.println("每位同學考取最高分的次數：");
        System.out.print("{ ");
        for (int i = 0; i < highScoreCount.length; i++) {          
        	System.out.print(highScoreCount[i]+" ");       	
        }
        System.out.print(" }");
}
	
	 private static int findMax(int[] examScores) {
	        int max = examScores[0];
	        for (int i = 0; i < examScores.length; i++) {
	            if (examScores[i] > max) {
	                max = examScores[i];
	            }
	        }
	        return max;
	    }
}
