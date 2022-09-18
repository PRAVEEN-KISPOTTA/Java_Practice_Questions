import java.util.Scanner;
public class Multiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int multipleOf = sc.nextInt();
		
		for(int i = 10; i>=1; i--) {
			int multiple = multipleOf * i;
			System.out.println(multipleOf + " x " + i + " = "+multiple);
		}
		sc.close();

	}

}
