
import java.util.*;
public class KmToMiles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Kilometer: ");
		float km = sc.nextFloat();
		
		float total = 0.621371f * km;
		
		System.out.println(km + " km is equal to " + total + " miles.");
		
		sc.close();

	}

}
