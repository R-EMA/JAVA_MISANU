package novanitThread;

/*
nit se može napravit i kada klasu Thread proširite novom nasleđenom klasom, a zatim napravite instancu te klase

nova potklasa mora da redefiiše metod run()
*/

public class A extends Thread{
	
	A (String s) {
	    super(s); // poziv nasl.konstr, public Thread(String imeNiti)
	}

	public void run() {
	    for(int i=1; i<=10; i++)
	        System.out.print(" " + i + "." + getName());
	    System.out.println(" NEXT ");
	}

}
