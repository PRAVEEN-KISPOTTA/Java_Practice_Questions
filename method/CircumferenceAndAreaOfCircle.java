package method;

import java.util.Scanner;

public class CircumferenceAndAreaOfCircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of Radius:");
		float r = sc.nextFloat();
		
		radius(r);
		sc.close();

	}
	
	static void radius(float r) {
		System.out.println("Circumference of Circle is " + 2 * (3.14 * r));
		System.out.println("Area of Circle is " + 3.14 * (r * r));
	}

}
