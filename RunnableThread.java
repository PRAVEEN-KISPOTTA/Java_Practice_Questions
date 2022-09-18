
class MyThread3 implements Runnable{
	public void run() {
		int i = 0;
		while(i<20){
			System.out.println("I am thread 1.");
			i++;
		}
	}
}

class MyThread4 implements Runnable{
	public void run() {
		int i = 0;
		while(i<20) {
			System.out.println("I am thread 2.");
			i++;
		}
		
	}
}

public class RunnableThread {

	public static void main(String[] args) {
		MyThread3 sc1 = new MyThread3();
		Thread t1 = new Thread(sc1);
		
		MyThread4 sc2 = new MyThread4();
		Thread t2 = new Thread(sc2);
		
		t1.start();
		t2.start();

	}

}
