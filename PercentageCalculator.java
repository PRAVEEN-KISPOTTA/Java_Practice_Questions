
import java.util.*;
public class PercentageCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("***MARKS SHOULD BE <= 100***");
		System.out.println("Marks of sub1:");
		byte num1 = sc.nextByte();
		
		System.out.println("Marks of sub2:");
		byte num2 = sc.nextByte();
		
		System.out.println("Marks of sub3:");
		byte num3 = sc.nextByte();
		
		System.out.println("Marks of sub4:");
		byte num4 = sc.nextByte();
		
		System.out.println("Marks of sub5:");
		byte num5 = sc.nextByte();
		
		System.out.println("Total subject marks:");
		int totalMarks = num1 + num2 + num3 + num4 + num5;
		System.out.println(totalMarks);
		
		System.out.print("Percentage:");
		System.out.print((totalMarks*100)/500 + "%");
		sc.close();
	}

}
