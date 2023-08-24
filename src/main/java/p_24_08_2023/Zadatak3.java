//3.Zadatak
//Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i koji zamenjuje vrednosti prvog (na poziciji nula) i zadnjeg elemnta niza.
//Objasnjenje: Ako je niz 2,4,5,6,7 nakon izmene treba da bude 7,4,5,6,2
//Napomena: U zadataku nakon kreiraanja niza, ne treba da se desi kod koji setuje fiksne vrednosti u niz.

package p_24_08_2023;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {
        ArrayList<Integer> niz = new ArrayList<Integer>();

        niz.add(10);
        niz.add(20);
        niz.add(30);
        niz.add(40);
        niz.add(50);

        int prviBroj = niz.get(0);
        int zadnjiIndeks = niz.size() - 1;
        int drugiBroj = niz.get(zadnjiIndeks);
        niz.set(0, drugiBroj);
        niz.set(zadnjiIndeks, prviBroj);
        //gledaj preko debugger-a kako se menja sadrzaj niza
//        int i;
//        for (i = 0; i < niz.size(); i++) {
//            System.out.println(niz.get(i));
//        }
//        izbegavaj stampanje, koristi debugger
    }
}
