package recursion;

import java.util.Arrays;

public class VarArgs {
	static void infinite(int ...num) {
		System.out.println(Arrays.toString(num));
	}

	public static void main(String[] args) {
		infinite(1,2,3,4,5,6,7,7,8,9,0);
		//infinite("Praveen", " Kispotta", " is " + " good.");

	}

}
