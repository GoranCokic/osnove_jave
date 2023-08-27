//.Zadatak
//Napisati progam koji stampa niz u obrnutom redosledu tj. od zadnjeg elementa do nultog.
//Ako je niz 1,2,4,5,7, stampa se 7,5,4,2,1

package d_24_08_2023;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {
        ArrayList<Integer> niz = new ArrayList<Integer>();

        niz.add(1);
        niz.add(2);
        niz.add(4);
        niz.add(5);
        niz.add(7);

        for (int i = niz.size() - 1; i != -1; i--) {
            System.out.print(niz.get(i) + ",");
        }
    }
}

