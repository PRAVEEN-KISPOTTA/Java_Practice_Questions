package method;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		
		prime(a);
		
		sc.close();

	}
	
	static void prime(int a) {
		boolean flag = true;
		for (int i = 2; i*i<=a; i++) {
			if (a%i == 0) {
				flag = false;
				break;
			}
		}
		if(!flag) {
			System.out.println(a + " is not prime number.");
		}
		else
			System.out.println(a + " is prime number.");	
		
	}
		

}
