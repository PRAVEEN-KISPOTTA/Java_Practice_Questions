
import java.util.Scanner;
public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length of the rectangle:");
		float length = sc.nextFloat();
		
		System.out.println("Enter Breadth of the rectangle:");
		float breadth = sc.nextFloat();
		
		float area = length * breadth;
		
		System.out.println("Area of Rectangle is " + area);
		sc.close();

	}

}
