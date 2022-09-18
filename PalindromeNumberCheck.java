
import java.util.Scanner;
public class PalindromeNumberCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int num1 = num;
		int result = 0;
		while(num1>0) {
			int temp = num1%10;
			num1 = num1/10;
			result = result * 10 + temp;
		}
		if (result == num) {
		System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palindrome");
		sc.close();

	}

}
