package work5Ext_1;

public class Main {
	public static void main(String[] args) {
		
		Pen pencil = new Pencil("Staedtler", 10);
		Pen inkBrush = new InkBrush("Pentel", 40);
		
		System.out.println("Pencil售價: "+ pencil.getPrice());
		pencil.write();
		
		System.out.println("InkBrush售價: "+ inkBrush.getPrice());
		inkBrush.write();
	}
}
