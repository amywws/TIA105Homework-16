package work6;

public class Calculator {

	public Calculator() {

	}

	public int powerXY(int x, int y) throws CalException {

		if (x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義");
		} else if (y < 0) {
			throw new CalException("次方為負值，結果不為整數");
		}else {
			return (int) Math.pow(x, y);
		}
	}
}
