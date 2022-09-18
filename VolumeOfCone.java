
import java.util.Scanner;
public class VolumeOfCone {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Radius of cone:");
		float radius = sc.nextFloat();
		
		System.out.println("Enter Height of cone:");
		float height = sc.nextFloat();
		
		float volume = (3.141F * radius * radius) * (height / 3);
		
		System.out.println("Volume of cone is " + volume);
		sc.close();

	}

}
