//(Za vezbanje) Napisati program koji vrsi mesanje niza. Niz je duzine 10, proizvoljnih brojeva.
//Mesanje niza se vrsi tako sto se 8 puta vrsi zamena dva random elementa iz niza.
//primer jedne zamene:
//Ako je niz
//1,2,3,4,5,6,7,8,9,10
//i prvi random indeks je 4 a drugi random indeks je 6
//1,2,3,4,7,6,5,8,9,10

package p_24_08_2023;

import java.util.ArrayList;
import java.util.Random;

public class Zadatak6 {
    public static void main(String[] args) {
        ArrayList<Integer> niz = new ArrayList<Integer>();

        niz.add(1);
        niz.add(2);
        niz.add(3);
        niz.add(4);
        niz.add(5);
        niz.add(6);
        niz.add(7);
        niz.add(8);
        niz.add(9);
        niz.add(10);

        Random broj = new Random();

        int i;
        for (i = 0; i < 8; i++) {
            int prviIndex = broj.nextInt(9);
            int drugiIndex = broj.nextInt(9);
            int prviBroj = niz.get(prviIndex);
            int drugiBroj = niz.get(drugiIndex);
            niz.set(prviIndex, drugiBroj);
            niz.set(drugiIndex, prviBroj);
            //proveravaj stanje niza sa debuggerom
        }
    }
}
