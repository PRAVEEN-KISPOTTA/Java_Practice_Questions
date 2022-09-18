
public class FibonacciSeries {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		
		int n = 5;
		
//		for (int i = 0 ;i<=n; i++) {
//			System.out.print(a+"\t");
//			int c = a+b;
//			a=b;
//			b=c;
		
		for (int i = 2; i<=n; i++) {
			int c = b;
			b = b + a;
			a = c;
			
			System.out.println(b);
		}
		

	}

}
