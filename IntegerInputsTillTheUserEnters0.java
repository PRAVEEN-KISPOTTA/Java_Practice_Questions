
import java.util.*;
public class IntegerInputsTillTheUserEnters0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 1;
		int sum = 0;
		
		while(num != 0) {
			num = sc.nextInt();
			sum +=num;
		}
		System.out.println(sum);
		sc.close();

	}

}
