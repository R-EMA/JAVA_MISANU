package paket;

public class A<T, V> {
	
	T objT;
	V objV;
	
	A(T ot, V ov) {
		objT = ot;
		objV = ov;
	}

	public T getObjT() {
		return objT;
	}

	public void setObjT(T objT) {
		this.objT = objT;
	}

	public V getObjV() {
		return objV;
	}

	public void setObjV(V objV) {
		this.objV = objV;
	}
	
	void prikaziTip() {
		System.out.println("\nTip T je " + objT.getClass().getName());
		System.out.println("Tip V je " + objV.getClass().getName());
	}

}
