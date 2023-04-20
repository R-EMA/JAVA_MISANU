package bajt;

import java.util.Scanner;

/**
 * 
 * @author emma
 * 
 * pretvaranje kB u by
 *
 */
public class MainBy {
		
	public static void main(String[] args) { 
		
		Scanner input = new Scanner(System.in); 
		System.out.print("Unesite veličinu datoteke u kB: "); 
		double x=input.nextDouble(); 
		System.out.println("Veličina izražena u bajtovima je: " + x*1024); 
		
		input.close();
	} 

}
