package method;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		palindrome(a);
		sc.close();

	}
	
	static void palindrome(int a) {
		int b = a;
		int result = 0;
		while(b>0) {
		int temp = b%10;
		b = b/10;
		result = result*10+temp;
		}
		if (a == result) {
			System.out.println("palindrome");
		}else
			System.out.println("Not palindrome");
		
	}

}
