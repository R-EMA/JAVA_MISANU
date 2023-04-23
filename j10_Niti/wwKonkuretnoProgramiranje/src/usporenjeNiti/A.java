package usporenjeNiti;

public class A extends Thread {
	
	public void run() {
	    int i=1;
	    while(i<=10) {
	        System.out.println("i: " + i);
	        
	        //sleep(ms) - privremeno zaustavlja izvršenje na određeno vreme - MS milisekunde
	        //rezultuje usporenim izvršavanjem i odlaganjem početka za navedeno vreme.S
	        //često se javlja izuzetak,  pa je dobro da se obradi
	        //izuzetak je uobičajen kod izvršavanja više niti jer tada nekidrugi izuzetak može da poželi da zauzstavi usporenu nit
	        try {
	            Thread.sleep(1500);
	        }
	        catch(InterruptedException e) {
	        	e.printStackTrace();
	        	System.out.println("Nit je prekinuta.");
	        }	
	        i++;
	    }
	    
	}

}
