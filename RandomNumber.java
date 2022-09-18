
import java.util.Scanner;
import java.util.Random;
public class RandomNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("UserInput = ");
		int a = sc.nextInt();
		
		Random random = new Random();
		System.out.println("ComputerInput = " + random.nextInt(10));
		sc.close();
		
		//************************************************************
		
		for (int i = 0; i<10; i++) {
			System.out.print(random.nextInt(10)+" ");
		}

	}

}
