package recursion;

public class PrintingNumber {
	
//	static void print(int n) {
//		System.out.println(n);
//		print1(2);
//	}
//	static void print1(int n) {
//		System.out.println(n);
//		print2(3);
//	}
//	static void print2(int n) {
//		System.out.println(n);
//		print3(4);
//	}
//	static void print3(int n) {
//		System.out.println(n);
//		print4(5);
//	}
//	static void print4(int n) {
//		System.out.println(n);
//	}
	//**********************************//
//	static void print(int n) {
//		if (n<=5) {
//			System.out.println(n);
//			print(n+1);
//		}
//	}
	//***********************************//
	static void print(int n) {
		if (n == 5) {
			System.out.println(n);
			return;
		}else
			System.out.println(n);
		print(n+1);
	}

	public static void main(String[] args) {
		
		print(1);

	}

}
