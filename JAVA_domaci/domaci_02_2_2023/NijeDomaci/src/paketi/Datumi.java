package paketi;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class Datumi {

	public static void main(String[] args) throws Exception {
		// datum i vreme. osnovne operacije
		
		//lokalni datum i vreme, trenutne vrednosti
		LocalDate d = LocalDate.now();
		LocalTime t = LocalTime.now();
		LocalDateTime dt = LocalDateTime.now();
		LocalDateTime dtm = LocalDateTime.of(2015, 12, 2, 10, 30);
		System.out.println("Datum: " + d);
		System.out.println("Vreme: " + t);
		System.out.println("Datum i Vreme: " + dt);
		System.out.println("Datum i Vreme moje: " + dtm);

		
		//formatiranje izlaza
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy 'at' HH:mm:ss a"); 
		System.out.println("\nDatum i Vreme: " + dtf.format(dt));
		System.out.println("Datum i Vreme moje: " + dtf.format(dtm));

		
		DateTimeFormatter dtfl = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM); 
		System.out.println("\nDatum i Vreme: " + dtfl.format(dt));

		//string kao datum
		String ds = "12-01-2022";
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); //prvi format mora da se poklapa sa stringom
		Date dds = sdf.parse(ds);
		System.out.println("String->Date " + sdf.format(dds));
		sdf.applyPattern("MMMM, dd yyyy");
		System.out.println("String->Date " + sdf.format(dds));
		
		String ds1 = "12.01.2022";
		sdf.applyPattern("dd.MM.yyyy");
		Date dds1 = sdf.parse(ds1);
		System.out.println("String->Date II " + sdf.format(dds1));


		
	}

}
