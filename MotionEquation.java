
import java.util.*;
public class MotionEquation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int u = sc.nextInt();
		int a = sc.nextInt();
		int s = sc.nextInt();
		
		float motion = (float)(v*v - u*u) / (float)(2*a*s);
		
		System.out.println(motion);

	}

}
