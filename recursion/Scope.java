package recursion;

public class Scope {
	static void calling() {
	int a = 2;
	int b = 3;
	String d = "Kispotta";
	
	{
		int c = 4;
		String e ="Praveen " + d;
		System.out.println(e.toUpperCase());
	}
	System.out.println();
	}
	
	static int x = 55;

	public static void main(String[] args) {
		System.out.println(x);
		
		int x = 20;
		System.out.println(x);
		flow();
	}
	static void flow() {
		System.out.println(x);
	}

}
