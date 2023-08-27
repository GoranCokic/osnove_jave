//Zadatak
//Napisati funkciju koja vrsi konverziju eura u dinare, rublje ili dolare prema dole navedenoj konverziji. Metoda od parametara prima vrednost u eurima kao i valutu u kojoj je potrebno izvrsiti konverziju (RSD/USD/RUB) a vraca konvertovanu vrednost. U glavnom programu pozvati funkciju za neki od primera.
//Primer poziva funkcija:
//Ako se za vrednost u eurima unese 3 i valuta RSD vraca vrednost 351.6339
//Ako se za vrednost u eurima unese 4.5 i valuta USD vraca vrednost 5.31945
//Primer izvrsenja main programa:
//Unesite vrednost u eurima: 3
//Unesite valutu za konverziju: RSD
//3 EUR je 351.6339 RSD
//Konverzija eura u druge valute:
//1 EUR = 117.5 RSD
//1 EUR = 1.1 USD
//1 EUR = 62.98 RUB

package d_25_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double brojEura = s.nextDouble();
        String valutaUKojuSePretvara = s.next();

        double rezultat = konverzija(brojEura, valutaUKojuSePretvara);
        System.out.println(rezultat);
    }

    public static Double konverzija(double brojEura, String valutaUKojuSePretvara) {
        if (valutaUKojuSePretvara.equals("RSD")) {
            return brojEura * 117.5;
        } else if (valutaUKojuSePretvara.equals("USD")) {
            return brojEura * 1.1;
        } else if (valutaUKojuSePretvara.equals("RUB")) {
            return brojEura * 62.98;
        } else {
            System.out.println("unesite validnu valutu");
            return 0.0;
        }
    }
}
