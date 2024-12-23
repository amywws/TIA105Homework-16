package work1;

public class Java1211_5 {
	public static void main(String[] args) {
		int pv=1500000;
		double rate=0.02;
		double x=1+rate;
		double fv=pv*Math.pow(x, 10);
		System.out.println("本利和="+fv+"元");
		
		
	}

}
