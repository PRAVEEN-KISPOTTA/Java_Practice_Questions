
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		float num = sc.nextFloat();
		
		System.out.println("Enter power value:");
		float power = sc.nextFloat();
		
		double total  = Math.pow(num, power);
		
		System.out.println("Total = " + total);
		sc.close();

	}

}
