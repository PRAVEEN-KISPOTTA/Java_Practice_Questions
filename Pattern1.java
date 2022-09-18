import java.util.Scanner;

public class Pattern1 {
	
	static void pattern(int num) {
		for (int i = 0; i<num; i++) {
			for (int j = 0; j<i+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		
		pattern(a);
		sc.close();

	}

}
