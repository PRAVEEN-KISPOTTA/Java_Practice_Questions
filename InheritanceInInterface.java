

interface planA{
	void clgWork();
	void coding();
}

interface planB extends planA{
	void playGame();
	void watchReels();
}

class doingWork implements planB{
	public void clgWork() {
		System.out.println("Doing some college works");
	}
	
	public void coding() {
		System.out.println("If college work is not there do some coding practice");
	}
	
	public void playGame() {
		System.out.println("Playing games after coding practice");
	}
	public void watchReels() {
		System.out.println("Watching reels in free times");
	}
}
public class InheritanceInInterface {

	public static void main(String[] args) {
		planB plan = new doingWork();
		
		plan.clgWork();
		plan.coding();
		plan.playGame();
		plan.watchReels();

	}

}
