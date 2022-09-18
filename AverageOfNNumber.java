
import java.util.Scanner;
public class AverageOfNNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum = 0;
		float num2;
		
		for (int i = 1; i<=num; i++) {
			
			System.out.println("Enter " + i +" number:");
			num2 = sc.nextInt();
			sum +=num2;
		}
		
		float average = sum / num;
		System.out.println("Average Number = " + average);
		
		sc.close();

	}

}
