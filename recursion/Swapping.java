package recursion;

import java.util.Arrays;

public class Swapping {
	
	static void array(int[] num) {
		num[0] = 99;
	}

	public static void main(String[] args) {
		
		int [] arr = {1, 2, 3, 4, 5};
		array(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
