
import java.util.*;
public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int result = 0;
		int power = sc.nextInt();
		int temp;
		int originalNumber;
		originalNumber = num;
		
		while(originalNumber != 0) {
		    temp = originalNumber%10;
			originalNumber = originalNumber / 10;
			result = (int) (result + Math.pow(temp, power));
		}
		
		if(num==result) {
		System.out.println("Armstrong");
		}else
			System.out.println("Not Armstrong");
		sc.close();

	}

}
