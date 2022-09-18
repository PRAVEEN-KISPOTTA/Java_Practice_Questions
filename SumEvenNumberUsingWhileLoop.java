import java.util.Scanner;
public class SumEvenNumberUsingWhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 0; i<num; i++) {
			sum +=2*i;
			System.out.print(sum+" ");
		}
		
		sc.close();

	}

}
