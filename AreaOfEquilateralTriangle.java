
import java.util.Scanner;
public class AreaOfEquilateralTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of side of the triangle:");
		float side = sc.nextFloat();
		
		float area = (1.732F * side * side) / 4;
		
		System.out.println("Area of Equilateral Triangle is " + area);

	}

}
