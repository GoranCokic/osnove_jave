//.Zadatak
//Napisati program koji ucitava N brojeva i smesta ih u niz. Zatim, iz niza, broji koliko je parnih brojeva uneto. brojeve unosi korisnik.
//Unesite N: 5
//Unesite broj: 1
//Unesite broj: 3
//Unesite broj: 4
//Unesite broj: 7
//Unesite broj: 8
//U nizu ima 2 parna broja.

package d_24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<Integer> nizBrojeva = new ArrayList<Integer>();

        int n = s.nextInt();
        int parnih = 0;

        for (int i = 0; i < n; i++) {
            int broj = s.nextInt();
            nizBrojeva.add(broj);
            if (broj % 2 == 0) {
                parnih++;
            }
        }
        System.out.println("U nizu ima " + parnih + " parna broja.");
    }
}
