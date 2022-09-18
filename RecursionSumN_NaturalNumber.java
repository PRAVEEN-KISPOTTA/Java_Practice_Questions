
public class RecursionSumN_NaturalNumber {
	
	static int recNum(int n) {
		if (n == 1) {
			return 1;
		}else
			return n + recNum(n-1);
	}

	public static void main(String[] args) {
		System.out.println(recNum(3));

	}

}
