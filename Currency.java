//Q. Input currency in rupees and output in USD.
public class Currency extends UserInput {

	public static void main(String[] args) {
		
		System.out.print("Enter amount in \nRs ");
		float INR = sc.nextFloat();
		
		float USD = 0.014F * INR;
		
		System.out.println("Amount is \n$ " +USD);

	}

}
