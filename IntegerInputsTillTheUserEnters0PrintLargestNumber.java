
import java.util.*;
public class IntegerInputsTillTheUserEnters0PrintLargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int larger = num;
		int smaller = num;
		System.out.println("Enter a number:");
		while(num != 0) {
			num = sc.nextInt();
			if(num > larger) {
				larger = num;
			}else if(num < smaller && smaller !=0) {
				smaller = num;
			}else {
				System.out.println("invalid number");
			}
		}
		System.out.println("Larger number: "+larger);
		System.out.println("Smaller number: "+smaller);
		sc.close();

	}

}
