
public class VarArgs {
	
	static int num(int ...arr) {
		int sum = 0;
		for(int a : arr) {
			sum +=a;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(num(4,5));
		System.out.println(num(1,2,3));
		System.out.println(num(4,5,6,7,8,9,9));
		System.out.println(num());

	}

}
