package macka;

import java.io.*;

public class Cat {

	private String ime;
	
	Cat() throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Kako se zove mačka? ");
		this.ime = bf.readLine();
	}
	
	public String getIme() {
		return this.ime;
	}
	
}
