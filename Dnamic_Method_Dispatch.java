
class tata{
	public void colour() {
		System.out.println("The color of car is white...!");
	}
	public void engine() {
		System.out.println("This car is petrol engine.");
	}
}
class mahindra extends tata{
	public void colour() {
		System.out.println("The color of car is black");
	}
	public void seater() {
		System.out.println("This is 7 seater car.");
	}
}

public class Dnamic_Method_Dispatch {

	public static void main(String[] args) {
		tata detail = new mahindra();
		
		detail.colour();

	}

}
