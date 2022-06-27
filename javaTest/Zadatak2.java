package javaTest;

import java.util.Scanner;

public class Zadatak2 {
	//Napisati program koji racuna potrosnju goriva
	//Korisnik unosi distancu i tip vozila, a program ispisuje koliko ce goriva biti potroseno
	//Motor trosi 5 litara goriva na 100 kilometara, automobil trosi 7 litara na 100 kilometara,
	//kombi trosi 11 litara na 100km, dok kamion trosi 15 litara na 100km
	//Primeri ispisa u konzoli:
	//Molim vas unesite distancu u kilometrima:
	//134
	//Molim vas unesite tip vozila: 
	//Kombi
	//Kombi na 134.0 km potrosi 14.74 litara goriva
	//Primer ispisa kad se unese pogresno vozilo
	        
	//Molim vas unesite distancu u kilometrima:
	//133
	//Molim vas unesite tip vozila: 
	//Tenk
	//Uneli ste pogresan tip vozila

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Molim vas unesite distancu u kilometrima: ");
		double distanca = s.nextDouble();
		System.out.println("Molim vas unesite tip vozila: ");
		String tipVozila = s.next();
		double potrosnja = 1;

		if (tipVozila.equalsIgnoreCase("Motor")) {
			potrosnja = ((distanca * 5) / 100);
			System.out.println(tipVozila + " na " + distanca + " trosi " + potrosnja + " litara goriva.");
		} else if (tipVozila.equalsIgnoreCase("Automobil")) {
			potrosnja = ((distanca * 7) / 100);
			System.out.println(tipVozila + " na " + distanca + " trosi " + potrosnja + " litara goriva.");
		} else if (tipVozila.equalsIgnoreCase("Kombi")) {
			potrosnja = ((distanca * 11) / 100);
			System.out.println(tipVozila + " na " + distanca + " trosi " + potrosnja + " litara goriva.");
		} else if (tipVozila.equalsIgnoreCase("Kamion")) {
			potrosnja = ((distanca * 15) / 100);
			System.out.println(tipVozila + " na " + distanca + " trosi " + potrosnja + " litara goriva.");
		} else {

			System.out.println("Uneli ste pogresan tip vozila.");
		}
	}

}
