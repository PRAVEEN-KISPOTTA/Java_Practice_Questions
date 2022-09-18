import java.util.Scanner;

public class CharChecker {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		char checker = sc.next().trim().charAt(0);
		
		if (checker >='a' && checker <='z') {
			System.out.println(checker+ " is a Lower case");
		}else if(checker >= 'A' && checker <= 'Z') { 
			System.out.println(checker+ " is a Upper case");
		}else
			System.out.println("please enter valid character.");

	}

}
