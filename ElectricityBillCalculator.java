
import java.util.*;
public class ElectricityBillCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter previous reading:");
		float previousReading = sc.nextFloat();
		
		System.out.println("Enter current reading:");
		float currentReading = sc.nextFloat();
		
		float diffUnit = currentReading - previousReading;
		float fixCharge = 75.0F;
		float elecDuty = 0.375F * diffUnit;
		
		float energyCharge = 6.25F * diffUnit;
		float totalAssesment = energyCharge + fixCharge + elecDuty;
		
		System.out.println("Difference Unit: " + diffUnit);
		System.out.println("Energy Charges: " + energyCharge);
		System.out.println("Fix Charges: " + fixCharge);
		System.out.println("Electricity Duty: " + elecDuty);
		System.out.println("Total Assesment: " + totalAssesment);
		sc.close();

	}

}
