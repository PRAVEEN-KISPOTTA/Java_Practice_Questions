package method;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		
		System.out.println(fact(a));
		sc.close();
		

	}
	
	static int fact(int a) {
		if (a==1 || a == 0) {
			return 1;
		}
		int b = 1;
		for (int i = 2; i<=a; i++) {
			b *= i;
		}
		return b;
	}

}
