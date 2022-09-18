
import java.util.Scanner;
public class FactorialOfANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int fact = 1;
		
		for (int i = 1; i<=num; i++) {
			fact *=i;
			
		}
		System.out.print("Factorial of "+num + " is: "+fact);

	}

}
