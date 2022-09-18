package method;

import java.util.Scanner;

public class ProductOfTwoNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first value:");
		int a = sc.nextInt();
		
		System.out.println("Enter second value:");
		int b = sc.nextInt();
		
		System.out.println("Product of two number is:"+product(a, b));
		sc.close();

	}
	static int product(int a, int b) {
		int x = a * b;
		return x;
	}
}
