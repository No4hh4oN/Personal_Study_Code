package java_book;

public class Ex19 {
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	double plus(double x, double y) {
		double result = x + y;
		return result;
	}

	public static void main(String[] args) {
		Ex19 calEx20 = new Ex19();
		int res1 = calEx20.plus(5, 10);
		double res2 = calEx20.plus(10.5, 20.3);

		System.out.println(res1);
		System.out.println(res2);
	}
}