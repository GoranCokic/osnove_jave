// Zadatak 3: Kreiranje klase "Proizvod"
//Napišite klasu "Proizvod" sa atributima: naziv (String) i cena (double). U glavnoj metodi kreirajte 3 objekta ove klase i postavite im vrednosti. Ispisati informacije o proizvodima.

package d_07_09_2023;

public class Zadatak3 {
    public static void main(String[] args) {
        Proizvod proizvod1 = new Proizvod();
        proizvod1.naziv = "krompir";
        proizvod1.cena = 20;

        Proizvod proizvod2 = new Proizvod();
        proizvod2.naziv = "kifla";
        proizvod2.cena = 30;

        Proizvod proizvod3 = new Proizvod();
        proizvod3.naziv = "lubenica";
        proizvod3.cena = 40;

        proizvod1.stampaj();
        proizvod2.stampaj();
        proizvod3.stampaj();
    }
}
