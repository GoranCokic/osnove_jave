//4.Zadatak
//Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i koji prikazuje element na poziciji K. K unosi korisnik i smatrajte da unosi u opsegu od 0 do 4.
//Primer:
//Unesite pozicjiu: 2
//Na pozicji 2 je vrednost 7.

package p_24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        ArrayList<Integer> niz = new ArrayList<Integer>();

        niz.add(10);
        niz.add(20);
        niz.add(30);
        niz.add(40);
        niz.add(50);

        Scanner s = new Scanner(System.in);
        int input = s.nextInt();

        System.out.println("Na poziciji " + input + " je vrednost " + niz.get(input));
    }
}
