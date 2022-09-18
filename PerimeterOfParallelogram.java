
import java.util.Scanner;
public class PerimeterOfParallelogram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Side value of parallelogram:");
		float side = sc.nextFloat();
		
		System.out.println("Enter Base value of parallelogram:");
		float base = sc.nextFloat();
		
		float perimeter = 2 * (side + base);
		
		System.out.println("Perimeter of parallelogram is " + perimeter);
		sc.close();

	}

}
