import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String var = sc.nextLine().trim();
		var = var.toUpperCase();
		var = var.substring(0, 1);
		
		switch (var) {
		case "M":
			System.out.println("Monday");
			break;
		case "T":
			System.out.println("Tuesday");
			break;
		case "W":
			System.out.println("Wednesday");
			break;
		case "t":
			System.out.println("Thursday");
			break;
		case "F":
			System.out.println("Friday");
			break;
		case "S":
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Sunday");
		}
          sc.close();
	}

}
