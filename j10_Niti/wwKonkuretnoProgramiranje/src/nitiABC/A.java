package nitiABC;

public class A extends Thread {
	
	A(String s) {
		super(s);
	}
	
	public void run() {
		for(int i=1; i<=5; i++)
			System.out.println("A." + this.getName());
	}

}
