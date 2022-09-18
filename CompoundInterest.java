
import java.util.*;
public class CompoundInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter initial amount:");
		float P = sc.nextFloat();
		
		System.out.println("Enter rate of interest(%):");
		float r = sc.nextFloat()/100;
		
		System.out.println("Enter number of times:");
		int n = sc.nextInt();
		
		System.out.println("Enter time period:");
		int t = sc.nextInt();
		
		double A = P * Math.pow(1+r/n, n*t);
		
		System.out.println("CI = " + A);
		sc.close();

	}

}
