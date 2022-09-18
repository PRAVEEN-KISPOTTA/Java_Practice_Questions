
public class OddNumber {

	public static void main(String[] args) {
		for(int i = 0; i<4; i++) {
			
			for(int j = 4; j>i; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k<=4; k++) {
				System.out.print("*");
			}System.out.print(" ");
			
			for(int l =0; l<i; l++) {
				System.out.print("  ");
			}
			for(int m = 0; m<=4; m++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
