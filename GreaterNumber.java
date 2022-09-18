//Q. Take 2 numbers as input and print the largest number.
public class GreaterNumber extends UserInput {

	public static void main(String[] args) {
		
		System.out.println("Enter two number:");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1 < num2) {
			System.out.println(num2 + " is greater.");
		}else
			System.out.println(num1 + " is greater.");

	}

}
