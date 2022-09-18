
import java.util.Scanner;
public class VowelOrConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char character = sc.next().charAt(0);
		
		
		if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' ||
				character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
			System.out.println("Vowel");
		}
		else
			System.out.println("Not vowel");

	}

}
