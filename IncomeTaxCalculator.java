import java.util.*;
public class IncomeTaxCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float salary = sc.nextFloat();
		float tax=0;
		
		if (salary<=250000) {
			tax = tax + 0;
		}
		
		if (salary>250000 && salary<=500000) {
			tax = tax + 0.05F * (salary - 250000);
		}
		
		if (salary>500000 && salary<=1000000) {
			tax = tax + 0.05F * (salary - 250000);
			tax = tax + 0.2F * (salary - 500000);
		}
		
		if (salary>1000000) {
			tax = tax + 0.05F * (salary - 250000);
			tax = tax + 0.2F * (salary - 500000);
			tax = tax + 0.3F * (salary - 100000);
		}
		
		System.out.println(tax);
		

	}

}
