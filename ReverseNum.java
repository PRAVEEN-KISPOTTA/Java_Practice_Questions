
public class ReverseNum {

	public static void main(String[] args) {
		
		int num = 242589;
		int result = 0;
		
		while (num > 0) {
			int temp = num % 10;
			num = num / 10;
			result = result * 10 + temp;
			
		}
		
		System.out.println(result);

	}

}
