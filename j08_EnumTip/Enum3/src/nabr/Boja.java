package nabr;

public enum Boja {

	Crvena(200), Zelena(150), Plava(100), Crna(250), Bela(179), Žuta(124);

	private int udeo;

	Boja(int u) {
		udeo = u;
	}

	int getUdeo() {
		return udeo;
	}

}
