package javaTest;

import java.util.Scanner;

public class Zadatak5 {
	//NAPISATI FUNKCIJU koja racuna koliko se puta neki broj pojavljuje u nizu
	//Proizvoljno napravite niz od 10 brojeva
	//korisnik unosi broj koji zeli da prebroji u nizu
	//Primer niza {2, 12, 432, 21, 2, 7, 12, 2, 21, -2}
	//Primeri ispisa u konzoli
	//Unesite broj koji zelite da prbrojimo u nizu brojeva:
	//2
	//Broj 2 se pojavljuje 3. puta u nasem nizu brojeva
	//Primer ispisa kad se unese broj koji ne postoji u nizu brojeva
	//Unesite broj koji zelite da prbrojimo u nizu brojeva:
	//8
	//Broj 8 se ne pojavljuje u nasem nizu

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] niz = { 2, 12, 432, 21, 2, 7, 12, 2, 21, -2 };
		System.out.println("Unesite broj koji zelite da prebrojimo u nizu brojeva:");
		int unetiBroj = s.nextInt();
		duplikati(niz, unetiBroj);
	}

	public static int duplikati(int[] nizBrojeva, int unetiBroj) {
		int suma = 0;
		for (int i = 0; i < nizBrojeva.length; i++) {
			if (unetiBroj == nizBrojeva[i]) {
				suma++;
			}
		}
		if (suma == 0) {
			System.out.println("Broj " + unetiBroj + "  se ne pojavljuje u nasem nizu.");
		} else {
			System.out.println("Broj " + unetiBroj + "  se pojavljuje " + suma + " puta u nasem nizu.");
		}
		return suma;
	}
}
