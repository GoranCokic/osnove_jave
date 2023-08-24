//5.Zadatak
//Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i racuna i stampa sumu svih brojeva niza.
//Primer: Ako je niz 1,2,4,5,7
//Stampa se, suma = 19

package p_24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        ArrayList<Integer> niz = new ArrayList<Integer>();

        niz.add(10);
        niz.add(20);
        niz.add(30);
        niz.add(40);
        niz.add(50);

        int i;
        int suma = 0;
        for (i = 0; i < niz.size(); i++) {
            if (i == (niz.size() - 1)) {
                System.out.println(niz.get(i));
                System.out.println();
            } else {
                System.out.print(niz.get(i) + ",");
            }
            suma = suma + niz.get(i);
        }
        System.out.println("suma je " + suma);
    }
}
