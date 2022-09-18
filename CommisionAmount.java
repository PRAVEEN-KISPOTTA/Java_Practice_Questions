
import java.util.Scanner;
public class CommisionAmount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle amount:");
		int principle = sc.nextInt();
		
		System.out.println("Enter Commision amount(%):");
		float commision = sc.nextFloat() / 100;
		
		float aggregateAmount = principle * commision;
		
		System.out.println("Aggregate amount = " + aggregateAmount);
		sc.close();

	}

}
