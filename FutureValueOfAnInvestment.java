
import java.util.Scanner;
public class FutureValueOfAnInvestment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of present amount:");
		int PV = sc.nextInt();
		
		System.out.println("Enter interest paid by the investment:");
		float r = sc.nextFloat()/100 ;
		
		System.out.println("Enter number of period");
		int n = sc.nextInt();
		
		double FV = Math.pow((1 + r), n);
		FV *=PV;
		System.out.println("Future value = " + FV);
		sc.close();

	}

}
