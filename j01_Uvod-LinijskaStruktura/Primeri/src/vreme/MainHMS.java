package vreme;

import java.util.Scanner;

/**
 * 
 * @author emma
 *
 * izraz "hh:mm:ss" pretvarau sekunde
 * 
 */

public class MainHMS {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite sate: ");
		int s = input.nextInt();
		System.out.print("Unesite minute: ");
		int m = input.nextInt();
		System.out.print("Unesite sekunde: ");
		int sec = input.nextInt();
		System.out.print("Vreme izraženo u sekundama je: " + (s * 3600 + m * 60 + sec));
		input.close();
	}
}