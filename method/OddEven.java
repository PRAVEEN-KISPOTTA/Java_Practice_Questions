package method;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		
		oddEven(a);
		
		sc.close();

	}
	
	static void oddEven(int a) {
		if (a%2 == 0) {
			System.out.println(a + " Even number.");
		}
		else
			System.out.println(a + " is Odd number.");
	}

}
