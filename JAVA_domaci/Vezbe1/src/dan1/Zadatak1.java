package dan1;

import java.io.*;
import java.text.*;

public class Zadatak1 {

	public static void main(String[] args) throws Exception {
		// if
		// y(x) = abs(x) => x za x >= 0 ili -x za x <0
		
		double x, y;		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("###.###");
		
		System.out.print("Unesite vrednost za x: ");
		x = Double.parseDouble(bf.readLine());
		
		if ( x >= 0 )
			y = x;
		else
			y = -x;
		
		System.out.println("Za uneto X = " + df.format(x) + " dobija se Y = " + df.format(y));
		//System.out.printf("Za uneto X = %7.3f dobija se Y = %7.3f", x, y);

	}

}
