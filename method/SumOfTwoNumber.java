package method;

import java.util.Scanner;

public class SumOfTwoNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int a = sc.nextInt();
		
		System.out.println("Enter second number:");
		int b = sc.nextInt();
		
		System.out.println("sum is " + sum(a, b));
		sc.close();
		
	}
	static int sum(int a, int b) {
		
		int add = a + b;
		return add;
	}

}
