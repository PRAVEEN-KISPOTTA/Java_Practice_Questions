
//Q. Write a program to print whether a number is even or odd, also take input.
public class EvenOdd extends UserInput {
	
	public static void main(String[] args) {
	
		System.out.print("Enter a number: ");
	int num = sc.nextInt();
	
	if (num%2 == 0) {
		System.out.println(num + " is even number.");
	}else
		System.out.println(num + " is odd number.");
	}

}
