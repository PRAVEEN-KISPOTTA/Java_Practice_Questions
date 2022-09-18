
import java.util.Scanner;
public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of Radius:");
		float radius = sc.nextFloat();
		
		float area = 3.14159F * (radius * radius);
		
		System.out.println("Area of Circle is " + area);
		sc.close();

	}

}
