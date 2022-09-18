package recursion;

public class IntroRecursion {
	static void message() {
		System.out.println("Good Morning");
		message1();
	}
	static void message1() {
		System.out.println("Good Morning");
		message2();
	}
	static void message2() {
		System.out.println("Good Morning");
		message3();
	}
	static void message3() {
		System.out.println("Good Morning");
	}

	public static void main(String[] args) {
		message();

	}

}
