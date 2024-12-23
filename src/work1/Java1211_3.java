package work1;

public class Java1211_3 {
	public static void main(String[] args) {
		int num=256559;
		int day=num/60/60/24;
		int hr=num/60/60%24;
		int min=num/60%60;
		int sec=num%60;
		
		System.out.println("256559秒是"+day+"天"+hr+"小時"+min+"分"+sec+"秒");
	}

}
