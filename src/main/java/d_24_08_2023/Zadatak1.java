//.Zadatak
//Napisati program koji u sebi ima definisan niz od 10 broja (brojevi su proizvoljni) i koji menja vrednost elementa na pozciji K. K i novu vrednost unosi korisnik.
//Primer:
//Unesite pozicjiu od 0 do 9: 3
//Unesite novu vrednost: 11
//Element na 3. poziciji treba na kraju da ima vrednost 11 u vasem programu.

package d_24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        ArrayList<Integer> nizBrojeva = new ArrayList<Integer>();

        nizBrojeva.add(11);
        nizBrojeva.add(12);
        nizBrojeva.add(13);
        nizBrojeva.add(14);
        nizBrojeva.add(15);
        nizBrojeva.add(16);
        nizBrojeva.add(17);
        nizBrojeva.add(18);
        nizBrojeva.add(19);
        nizBrojeva.add(20);

        Scanner s = new Scanner(System.in);
        int kIndex = s.nextInt();
        int novaVrednost = s.nextInt();

        nizBrojeva.set(kIndex,novaVrednost);
    }
}
