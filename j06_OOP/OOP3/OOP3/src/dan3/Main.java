package dan3;

public class Main {

	public static void main(String[] args) {
		// valjak
		
		Valjak v1 = new Valjak(3,5);
		
		System.out.println("Poluprečnik: " + v1.getR());
		System.out.println("Visina: " + v1.getH());
		
		System.out.println("Površina: " + v1.povrsina());
		System.out.println("Zapremina: " + v1.zapremina());
		
		v1.ispisi();
	}

}
