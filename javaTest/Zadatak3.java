package javaTest;

import java.util.Scanner;

public class Zadatak3 {
	//Napisite program koji, koristeci petlju, racuna zbir unetih brojeva, sve dok korisnik ne unese 0
	//Primer ispisa resenja:
	//Molim vas unesite 1. broj
	//4
	//Trenutni zbir je 4
	//Molim vas unesite 2. broj
	//5
	//Trenutni zbir je 9
	//Molim vas unesite 3. broj
	//0
	//Uneli ste 0 Kraj programa
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int broj = 0;
		int zbir = 0;
		int brojac = 1;

		do {
			System.out.println("Molim vas unesite " + brojac + ". broj: ");
			broj = s.nextInt();
			brojac++;
			zbir += broj;
			if(broj != 0) {
			
			System.out.println("Trenutni zbir je: " + zbir);
			}
		} while (broj != 0);

		System.out.println("Uneli ste 0. Kraj programa.");

	}

}
