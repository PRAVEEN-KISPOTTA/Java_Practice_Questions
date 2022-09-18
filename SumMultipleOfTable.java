
import java.util.Scanner;
public class SumMultipleOfTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i<=10; i++) {
			
			sum +=num * i;
			System.out.print(sum + " ");
		}
		
		sc.close();

	}

}
