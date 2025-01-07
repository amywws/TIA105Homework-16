package work5;

public class MyRectangleMain {
	public static void main(String[] args) {
		MyRectangle rect1 = new MyRectangle();
		rect1.setWidth(10);
		rect1.setDepth(20);
		System.out.println("第一個長方形面積: " + rect1.getArea());

		MyRectangle rect2 = new MyRectangle(10, 20);
		System.out.println("第二個長方形面積: " + rect2.getArea());
	}
}
