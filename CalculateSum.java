package ArrayPracticeQuestion;
import java.util.Scanner;

public class CalculateSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float num[] = new float[5];
		num[0] = sc.nextFloat();
		num[1] = sc.nextFloat();
		num[2] = sc.nextFloat();
		num[3] = sc.nextFloat();
		num[4] = sc.nextFloat();
		float sum = 0;
		
		for (float element:num) {
			sum +=element;
		}
		System.out.println(sum);
		sc.close();

	}

}
