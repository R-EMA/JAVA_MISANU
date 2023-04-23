package zadatAK;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//join() - čeka da se druga nit izvrši

		A a1 = new A("Prva nit");
		System.out.println("Prva nit se izvršava: " + a1.t.isAlive());

		A a2 = new A("Prva nit");
		System.out.println("Druga nit se izvršava: " + a2.t.isAlive());

		A a3 = new A("Prva nit");
		System.out.println("Treća nit se izvršava: " + a3.t.isAlive());

		try {
		    a1.t.join();
		    a2.t.join();
		    a3.t.join();
		}
		catch(Exception e) {
		    System.out.println("izuzetak " + e);
		}

		System.out.println("Prva nit se izvršava: " + a1.t.isAlive());
		System.out.println("Druga nit se izvršava: " + a2.t.isAlive());
		System.out.println("Treća nit se izvršava: " + a3.t.isAlive());

	}

}
