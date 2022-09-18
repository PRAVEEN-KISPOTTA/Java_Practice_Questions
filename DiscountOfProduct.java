
import java.util.Scanner;
public class DiscountOfProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Discount Offer(%):");
		float discount = sc.nextFloat() / 100;
		
		
		System.out.println("Enter Original price:");
		float originalPrice = sc.nextFloat();
		
		float discountedPrice = originalPrice * discount;
		float estimatedPrice = originalPrice - discountedPrice;
		
		System.out.println("Total price: " + estimatedPrice);
		
		sc.close();

	}

}
