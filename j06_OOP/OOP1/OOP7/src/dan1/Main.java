package dan1;

public class Main {

	public static void main(String[] args) {
		/* primena dva konstruktora */
		
		Krug k1 = new Krug();
		Krug k2 = new Krug(10);
		
		System.out.println("Površina kruga k1 iznosi " + k1.povrsina());
		System.out.println("Površina kruga k2 iznosi " + k2.povrsina());		

	}

}
