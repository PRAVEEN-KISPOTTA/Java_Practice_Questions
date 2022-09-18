
public class StringDetectWords {

	public static void main(String[] args) {
		String letter = "My name is  Praveen.";
		
//		boolean checker = letter.equals("  ");
//		boolean checker1 = letter.equals("   ");
		
		int checker = letter.indexOf("  ");
		int checker1 = letter.indexOf("   ");
		
		if (checker != -1) {
			System.out.println(checker+ " Double space");
		}else {
			System.out.println("Not Double space");
		}
		
		if (checker1 != -1) {
			System.out.println(checker1+ " Triple space");
		}else {
			System.out.println("Not Triple space");
		}
		

	}

}
