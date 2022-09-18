
import java.util.Scanner;
public class FibonacciSeries2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int a = 0;
		int b = 1;
		
		System.out.println("Fabonacci series of " + num +" is:");
		for (int i = 0; i<=num; i++) {
			System.out.print(a+" ");
			int c = a+b;
			a = b;
			b = c;
			
			
		}

	}

}
