// Zadatak 4: Kreiranje klase "Film"
//Napišite klasu "Film" sa atributima: naslov (String), godinaIzdanja (int) i reziser (String). U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti unosom sa tastature. Ispisati informacije o filmovima.

package d_07_09_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Film film1 = new Film();
        System.out.println("Unesite naslov filma 1");
        film1.naslov = s.next();
        System.out.println("Unesite godinu izdanja 1");
        film1.godinaIzdanja = s.nextInt();
        System.out.println("Unesite reziser 1");
        film1.reziser = s.next();

        Film film2 = new Film();
        System.out.println("Unesite naslov filma 2");
        film2.naslov = s.next();
        System.out.println("Unesite godinu izdanja 2");
        film2.godinaIzdanja = s.nextInt();
        System.out.println("Unesite reziser 2");
        film2.reziser = s.next();

        Film film3 = new Film();
        System.out.println("Unesite naslov filma 3");
        film3.naslov = s.next();
        System.out.println("Unesite godinu izdanja 3");
        film3.godinaIzdanja = s.nextInt();
        System.out.println("Unesite reziser 3");
        film3.reziser = s.next();

        film1.stampaj();
        film2.stampaj();
        film3.stampaj();
    }
}
