package dan2;

public class Main {

	public static void main(String[] args) {
		// 
		
		Box b1 = new Box();
		Box b2 = new Box(10,15,20);
		Box b3 = new Box(10);
		Box b4 = new Box(b2);
		
		b1.zapremina();
		b2.zapremina();
		b3.zapremina();
		b4.zapremina();
		
		b1.initBox(10,15,20);
		b2.initBox(5, 6, 7);
		
		b1.zapremina();
		b2.zapremina();				
		b4.zapremina();
		
		b4.initBox(2, 2, 2);
		b2.zapremina();				
		b4.zapremina();
		
	}

}
