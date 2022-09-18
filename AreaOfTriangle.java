
import java.util.Scanner;
public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Base of the triangle:");
		float base = sc.nextFloat();
		
		System.out.println("Enter Height of the triangle:");
		float height = sc.nextFloat();
		
		float area = (base * height) / 2;
		
		System.out.println("Area of Triangle is " + area);
		sc.close();

	}

}
