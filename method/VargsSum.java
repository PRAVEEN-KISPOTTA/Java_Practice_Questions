package method;

import java.util.Arrays;
import java.util.Scanner;

public class VargsSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		sum(a);
		

	}
	static void sum(int...args) {
		System.out.println(Arrays.toString(args));
	}

}
