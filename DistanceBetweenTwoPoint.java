
import java.util.Scanner;
public class DistanceBetweenTwoPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of point 1:");
		int x1 = sc.nextInt();
		
		System.out.println("Enter the value of point 2:");
		int x2 = sc.nextInt();
		
		System.out.println("Enter the value of point 1:");
		int y1 = sc.nextInt();
		
		System.out.println("Enter the value of point 2:");
		int y2 = sc.nextInt();
		
		int sum = ((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2));
		
		double distance = Math.pow(sum, 0.5);
		
		System.out.println("Distance = " + distance);
		sc.close();

	}

}
