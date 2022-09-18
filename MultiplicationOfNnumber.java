import java.util.Scanner;

public class MultiplicationOfNnumber {
	
	static void multiplication(int num) {
		for (int i = 1; i<=10; i++) {
			System.out.println(num + " x " + i + " = " + num * i);
		}		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		multiplication(a);
		sc.close();
	}

}
