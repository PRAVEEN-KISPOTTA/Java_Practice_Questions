import java.util.Scanner;

public class NthNumberUsingDoWhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter starting value:");
		int start = sc.nextInt();
		
		System.out.println("Enter ending value:");
		int end = sc.nextInt();
		
		do {
			System.out.print(start+" ");
			start++;
			
		} while(start<end);
		
		sc.close();

	}

}
