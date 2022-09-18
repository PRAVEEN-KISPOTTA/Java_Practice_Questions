
public class RecursionFibonacciSeries {
	
	static int recfib(int n) {
		if (n == 1) {
			return 0;
		}else if (n == 2) {
			return 1;
		}
		else
			return recfib(n-1) + recfib(n-2);
	}

	public static void main(String[] args) {
		System.out.println(recfib(8));

	}

}
