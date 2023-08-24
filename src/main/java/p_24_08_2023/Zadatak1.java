//Zadatak
//Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i prikazuje sumu nultog i zadnjeg elementa tog niza.

package p_24_08_2023;

import java.util.ArrayList;
//import java.util.Random;

public class Zadatak1 {
    public static void main(String[] args) {
        ArrayList<Integer> niz = new ArrayList<Integer>();
        //Random broj = new Random();

        niz.add(10);
        niz.add(20);
        niz.add(30);
        niz.add(40);
        niz.add(50);

        int lastIndex = niz.size()-1;
        int suma = niz.get(0) + niz.get(lastIndex); //ovo je zbir prvog i poslednjeg



//        int i;
//        for (i=0;i<5;i++){
//            niz.add(i);
////            niz.add(broj.nextInt(10));
//        }
//        int suma=0;
//        suma=niz.get(0)+niz.get(niz.size()-1);
//        System.out.println(suma);
    }
}
