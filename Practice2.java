
public class Practice2 {

	public static void main(String[] args) {
		int n = 234;
		int multiple = 1;
		int sum = 0;
		
		while(n>0) {
			
			int temp = n % 10;
			n = n / 10;
			
			multiple = multiple * temp;
			sum = sum + temp;
			
		}
		int result = multiple - sum;
		
		System.out.println(result);
		

	}

}
