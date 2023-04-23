package paketi2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B extends A {
	
	public String prezime;
	
	B(String ime, String prezime ) {
		super(ime);
		this.prezime = prezime;
	}

	public void setPrezime() throws IOException {
		super.setIme();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Prezime: ");
		this.prezime = bf.readLine();
	}
	
	public void vidi() {
		super.vidi();
		System.out.println("Prezime;     " + prezime);
	}
}
