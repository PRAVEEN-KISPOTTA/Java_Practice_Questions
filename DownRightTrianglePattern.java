import java.util.Scanner;
public class DownRightTrianglePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int star = sc.nextInt();
		for(int i = 0; i<star; i++) {
			for(int j = star; j>i; j--) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();

	}

}
