import java.util.Scanner;

public class Practice_Set {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		for(;;) {
			
		
			if (a.equals("m")) {
				System.out.print("Hello ");
			}else if(a.equals("n")) {
				System.out.println("Stop");
				break;
			}
		}

	}

}
