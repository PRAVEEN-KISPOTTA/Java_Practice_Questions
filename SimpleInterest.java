
//Q. Write a program to input principle, time, and rate (P, T, R) from the user and find Simple Interest.
public class SimpleInterest extends UserInput {

	public static void main(String[] args) {
		
		System.out.println("Enter the value of principle:");
		float principle = sc.nextInt();
		
		System.out.println("Enter the value of rate:");
		float rate = sc.nextInt();
		
		System.out.println("Enter the value of time:");
		int time = sc.nextInt();
		
		float SI = (principle * rate * time) / 100;
		
		System.out.println("The simple interest is:");
		System.out.println(SI);

	}

}
