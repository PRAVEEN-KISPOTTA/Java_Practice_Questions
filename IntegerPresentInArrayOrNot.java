package ArrayPracticeQuestion;

import java.util.Scanner;
public class IntegerPresentInArrayOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num[] = {1,2,3,4,5,6,7,8};
		int search = sc.nextInt();
		boolean isArray = false;
		for (int i = 0; i<num.length; i++) {
			if (search == num[i]) {
				isArray = true;
				break;
		}
		}
		if (isArray) {
			System.out.println("Number is present");
		}
		else
			System.out.println("Number is not present");
		sc.close();
	}

}
