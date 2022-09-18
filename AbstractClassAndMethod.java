
abstract class parent{
	public parent() {
		System.out.println("mai constructor hu parent class ka");
	}
	
	public void sayHello() {
		System.out.println("Hii");
	}
	
	abstract public void name();
	abstract public void rollNo();
	abstract public void DOB();
}

class parent2 extends parent{
	@Override
	public void name() {
		System.out.println("praveen kispotta");
	}
	@Override
	public void rollNo() {
		System.out.println("18ece408");
	}
	@Override
	public void DOB() {
		System.out.println("17/01/1999");
	}
}

abstract class parent3 extends parent{
	public void ph() {
		System.out.println("Sssss");
	}
}

public class AbstractClassAndMethod {

	public static void main(String[] args) {
		parent2 detail = new parent2();
		detail.name();
		detail.rollNo();
		detail.DOB();

	}

}
