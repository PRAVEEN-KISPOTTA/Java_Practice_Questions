

interface camera{
	void takeSelfie();
	void recordVideo();
	default void record4kVideo() {
		System.out.println("4k video recording");
	}
}

interface text{
	String[] sendText();
	void receivedText(String replied);
}

class Phone{
	 void callNo(double number) {
		 System.out.println("calling..." + number);
	 }
}

class smartPhone extends Phone implements camera, text{
	public void takeSelfie() {
		System.out.println("Shutter...");
	}
	public void recordVideo() {
		System.out.println("Recording...");
	}
	public String[] sendText() {
		System.out.println("List of text msg....");
		String[] textMsg = {"flipkart", "amazon", "sbi", "mohan"};
		return textMsg;
	}
	public void receivedText(String replied) {
		System.out.println(replied);
	}
	public void callNo(double number) {
		System.out.println("calling..." + number);
	}
}
public class Interface_Example {

	public static void main(String[] args) {
		smartPhone sc = new smartPhone();
//		sc.takeSelfie();
//		sc.recordVideo();
//		sc.sendText();
//		sc.receivedText("Hii, How are u..?");
//		sc.callNo(993137822);
		
		String[] ar = sc.sendText();
		for(String item:ar) {
			System.out.println(item);
		}

	}

}
