package ArrayPracticeQuestion;
import java.util.Scanner;

public class AddTwoMatrices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int matrices1[][] = new int[2][3];
		int matrices2[][] = new int[2][3];
		int sum[][] = new int[2][3];
		
		
		System.out.println("Enter matrices 1 value:");
		for (int i = 0; i<matrices1.length; i++) {
			for (int j = 0; j<matrices1[i].length; j++) {
				matrices1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter matrices 2 value:");
		for (int i = 0; i<matrices2.length; i++) {
			for (int j = 0; j<matrices2[i].length; j++) {
				matrices2[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Final matrices is:");
		for (int i = 0; i<matrices1.length; i++) {
			for (int j = 0; j<matrices1[i].length; j++) {
				
				sum[i][j] = matrices1[i][j] + matrices2[i][j];
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();			
		}
		sc.close();
	}

}
