package zadatAK;

public class A implements Runnable {
	
	String ime;
	Thread t;

	A(String ime) {
	    this.ime =  ime;
	    t = new Thread(this, ime);
	    t.start();
	}
	
	public void run() {
	    try {
		    for(int i=1; i<=5; i++) {
		        System.out.println(ime + " = " + i);
		        Thread.sleep(500);
		    }
	    }
	    catch(Exception e) {
	        System.out.println("Izvršena krađa procesa niti");
	    }
	}

}
