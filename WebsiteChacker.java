import java.util.*;
public class WebsiteChacker {

	public static void main(String[] args) {
		Scanner website = new Scanner(System.in);
		
		System.out.println("Enter website URL:");
		String web = website.nextLine();
		
		if (web.endsWith(".com")) {
			
			System.out.println("This is Commercial website.");
		}
		else if (web.endsWith(".org")) {
			
			System.out.println("This is Orgainzation website.");
		}
		else if (web.endsWith(".in")) {
			
			System.out.println("This is Indian website.");
		}
		else
			
			System.out.println("Invalid input");
		website.close();

	}

}
