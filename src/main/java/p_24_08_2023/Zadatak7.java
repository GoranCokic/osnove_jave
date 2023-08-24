//7. Napisati program koji simulira digitalni meni za pasta bar. Program ima dva niza informacija paste i cene. Program stampa meni u formatu
//naziv paste ………………………….cena rsd
//Informacije su uparene po poziciji, to znaci da je:
//pasta na poziciji 0, sa cenom sa pozicije 0
//pasta na poziciji 1, sa cenom sa pozicije 1
//…..
//
//Primer izvrsenja:
//AGLIO E OLIO ………………… 500 rsd
//PRIMAVERA…………………340 rsd
//ARRABBIATA ………………….420 rsd
//NAPOLITANA ………………….440 rsd
//POLLO E SPINACI ………………….550 rsd

package p_24_08_2023;

import java.util.ArrayList;

public class Zadatak7 {
    public static void main(String[] args) {
        ArrayList<String> stvar = new ArrayList<String>();
        ArrayList<Integer> cena = new ArrayList<Integer>();

        stvar.add("AGLIO E OLIO");
        stvar.add("PRIMAVERA");
        stvar.add("ARRABBIATA");
        stvar.add("NAPOLITANA");
        stvar.add("POLLO E SPINACI");

        cena.add(500);
        cena.add(340);
        cena.add(420);
        cena.add(440);
        cena.add(550);

        int i;
        for (i = 0; i < 5; i++) {
            System.out.println(stvar.get(i) + "......" + cena.get(i) + " rsd");
        }

    }
}
