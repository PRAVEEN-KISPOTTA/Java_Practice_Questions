import java.util.Scanner;

public class StringsTampletReplace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String letter = "Dear <|name|>, Thanks a lot.";
		
		System.out.println("Enter your name.");
		String a = sc.nextLine();
		
		System.out.println(letter.replace("<|name|>", a));

	}

}
