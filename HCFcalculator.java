
import java.util.Scanner;
public class HCFcalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of a:");
		int a = sc.nextInt();
		
		System.out.println("Enter value of b:");
		int b = sc.nextInt();
		
		int HCF = 0;
		
		for (int i = 1; i<=a || i<=b; i++) {
			if (a%i ==0 && b%i == 0)
				HCF = i;
		}
		System.out.println(HCF);
		sc.close();

	}

}
