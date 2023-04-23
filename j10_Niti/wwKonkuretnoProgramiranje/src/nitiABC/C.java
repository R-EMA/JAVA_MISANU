package nitiABC;

public class C extends Thread {
	
	C(String s) {
		super(s);
	}
	
	public void run() {
		for(int i=1; i<=5; i++)
			System.out.println("C." + this.getName());
	}

}
