package dan1;

public class Main {

	public static void main(String[] args) {
		/* objekat kao parametar */
		
		Krug k1 = new Krug(5);
		
		izracunajPovrsinu(k1); //objekat kao parametar

	}

	public static void izracunajPovrsinu(Krug k) {
		System.out.println("Površina kruga je " + k.povrsina());
	}
}
