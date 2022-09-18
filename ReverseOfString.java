
import java.util.Scanner;
public class ReverseOfString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word = "PRAVEEN";
		
		for(int i = word.length()-1; i>=0; i--) {
			
			System.out.print(word.charAt(i) + " ");
		}
		
		
		sc.close();

	}

}
