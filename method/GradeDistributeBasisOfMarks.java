package method;

import java.util.Scanner;

public class GradeDistributeBasisOfMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		
		marks(a);
		sc.close();

	}
	static void marks(int a) {
		if(a>=91 && a<=100) {
			System.out.println("Grade = AA");
		}else if(a>=81 && a<=90) {
			System.out.println("Grade = AB");
		}else if(a>=71 && a<=80) {
			System.out.println("Grade = BB");
		}else if(a>=61 && a<=70) {
			System.out.println("Grade = BC");
		}else if(a>=51 && a<=60) {
			System.out.println("Grade = CD");
		}else if(a>=41 && a<=50) {
			System.out.println("Grade = DD");
		}else if(a<=40) {
			System.out.println("!!Fail!!");
		}else
			System.out.println("Invalid number");
	}

}
