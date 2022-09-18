package method;

import java.util.Scanner;

public class LargestNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value 1:");
		int a = sc.nextInt();
		
		System.out.println("Enter value 2:");
		int b = sc.nextInt();
		
		System.out.println("Enter value 3:");
		int c = sc.nextInt();
		
		System.out.println(max(a, b, c) + " is greater number.");
		
		System.out.println(min(a, b, c) + " is smaller number.");
		sc.close();

	}
	static int max(int a, int b, int c) {
		int greater = a;
		if (b>greater) {
			greater = b;
		}
		if (c>greater) {
			greater = c;
		}
		return greater;
	}
	
	static int min(int a, int b, int c) {
		int smaller = a;
		if (b<smaller) {
			smaller = b;
		}
		if (c<smaller) {
			smaller = c;
		}
		return smaller;
	}
}
