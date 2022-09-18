package method;

import java.util.Scanner;

public class PrimeNumberGivenTwoNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
		
		range();
		sc.close();

	}
	static void range() {
		//int temp = 0;
		for (int i = 1; i<=100; i++) {
			int temp = 0;
			
			for (int j = 2; j<=i-1; j++) {
			if (i%j == 0) {
				temp = temp+1;
				//System.out.print(j+" ");
			}
			}
			if (temp == 0) {
				System.out.println(i);
			}else {
				temp = 0;
			}
		}
	}

}
