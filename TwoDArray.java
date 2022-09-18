
public class TwoDArray {

	public static void main(String[] args) {
		int flash[][] = new int[2][3];
		flash[0][0] = 100;
		flash[0][1] = 101;
		flash[0][2] = 102;
		flash[1][0] = 103;
		flash[1][1] = 104;
		flash[1][2] = 105;
		
		for (int i = 0; i<flash.length; i++) {
			for (int j = 0; j<flash[i].length; j++) {
				System.out.print(flash[i][j]+" ");
			}
			System.out.println();
			
		}

	}

}
