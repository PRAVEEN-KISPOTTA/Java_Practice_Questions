import java.util.Scanner;
public class Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String var = sc.nextLine();
		var = var.toLowerCase();
		System.out.println(var);
		var = var.substring(0,1);
		System.out.println(var);
		
		sc.close();

	}

}
