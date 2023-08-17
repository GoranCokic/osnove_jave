//Napisati program koji proverava da li je broj telefona validan. Program na pocetku ucitava broj telefona korisnika i ispisuje gresku ukoliko telefon nije validan.
//Broj nije validan ukoliko nema +381 ili ako ima kosu crtu (/)

package p_17_08_2023;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite  broj telefona: ");
        String broj = s.next();
        if (!broj.contains("+381") || (broj.contains("/"))) {
            System.out.println("broj nije validan");
        }
    }
}
