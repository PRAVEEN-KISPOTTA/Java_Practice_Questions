

class base{
	base(){
	System.out.println("I'am a base Constructor.");
	}
	base(int a){
		System.out.println("I'am a base Constructor." + a);
	}
}

class derived extends base{
	derived(){
		super(9);
		System.out.println("I'am a derived Constructor.");
	}
}

public class Construction_In_Inheritance {

	public static void main(String[] args) {
		//base b = new base(2);
		derived d = new derived();


	}

}
