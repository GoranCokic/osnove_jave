//2.Zadatak
//Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i menja vrednost elementa na poziciji 3 tako sto je povecava 10 puta.
//Npr: 1,4,5,6,7 => 1,4,5,60,8
//int a = 10;
//a = a * 10;

package p_24_08_2023;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {
        ArrayList<Integer> niz = new ArrayList<Integer>();

        niz.add(10);
        niz.add(20);
        niz.add(30);
        niz.add(40);
        niz.add(50);

        int brojNaIndeksu3 = niz.get(3)*10;
        niz.set(3,brojNaIndeksu3);

        int i;
        for (i=0;i<niz.size();i++){
            System.out.println(niz.get(i));
        }

    }
}
