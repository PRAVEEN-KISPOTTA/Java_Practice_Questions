package method;

import java.util.Scanner;

public class EligibleForVote {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your age:");
		int age = sc.nextInt();
		
		vote(age);
		
		sc.close();

	}
	
	static void vote(int age) {
		if (age>=18 && age<=130) {
			System.out.println("You are eligible to vote.");
		}else
			System.out.println("You are not eligible to vote");
	}

}
