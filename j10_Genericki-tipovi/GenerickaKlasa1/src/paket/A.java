package paket;

//primer jednostavne generičke klase
// T je parametar koji će se zameniti stvarnim tipom kada se napravi objekat tipa A

public class A<T> {
	
	T  ob;
	
	A(T o) {
		ob = o;
	}

	public void setOb(T ob) {
		this.ob = ob;	}
	
	public T getOb() {
		return ob;
	}
	
	public void prikaziTip() {
		System.out.println("\nTip T je " + ob.getClass().getName());
	}
	
}
