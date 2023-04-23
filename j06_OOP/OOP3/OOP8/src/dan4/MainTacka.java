package dan4;

public class MainTacka {

	public static void main(String[] args) {
		// tacka u ravni
		
		Tacka t1 = new Tacka();
		Tacka t2 = new Tacka(5);
		Tacka t3 = new Tacka(2,2);
		Tacka t4 = new Tacka(3,4);
		
		t1.info();
		t2.info();
		t3.info();
		t4.info();
		System.out.println("rastojanje t1-t2 = " + t1.rastojanje(t2));
		System.out.println("rastojanje t2-t3 = " + t2.rastojanje(t3));
		System.out.println("rastojanje t3-t1 = " + t3.rastojanje(t1));

	}

}
