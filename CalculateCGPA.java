
import java.util.Scanner;
public class CalculateCGPA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float sum = 0;
		
		for (int i = 1; i<6; i++) {
			System.out.println("Enter marks of subject " + i + ": ");
			int marks = sc.nextInt();
			
			sum +=marks;
		}
		sum = (sum/500) * 100;
		float cgpa = sum / 9.5F;
		System.out.println("Percentage = " +sum + "\nCGPA = " + cgpa );
		sc.close();

	}

}
