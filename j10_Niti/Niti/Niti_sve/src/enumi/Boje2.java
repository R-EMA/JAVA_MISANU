package enumi;

public enum Boje2 {
	BELA(30), PLAVA(25), CRVENA(10), ZELENA(10), CRNA(5), MAGNETA(10), ZUTA(10);
	
	private int udeo;
	
	Boje2(int udeo) {
		this.udeo = udeo;
	}
	
	int getUdeo() {
		return udeo;
	}
	

}
