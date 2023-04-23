package paketi2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {
	
	public String ime;
	
	A(String ime ) {
		this.ime = ime;
	}

	public void setIme() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Ime: ");
		this.ime = bf.readLine();
	}
	
	public void vidi() {
		System.out.println("\nIme;     " + ime);
	}
}
