package method;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		boolean b = true;
		
		for (int i = 2; i*i<= a; i++) {
			if (a%i == 0) {
				b = false;
			}
			
		}
		if(!b) {
			System.out.println(a +" is not prime number.");
		}else
			System.out.println(a + " is a prime number.");
		sc.close();

	}

}
