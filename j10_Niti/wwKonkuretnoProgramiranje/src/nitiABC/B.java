package nitiABC;

public class B extends Thread {
	
	B(String s) {
		super(s);
	}
	
	public void run() {
		for(int i=1; i<=5; i++)
			System.out.println("B." + this.getName());
	}

}
