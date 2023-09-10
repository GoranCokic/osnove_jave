// Zadatak 2: Kreiranje klase "Automobil"
//Napišite klasu "Automobil" sa atributima: marka (String), model (String) i godinaProizvodnje (int). U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti. Ispisati informacije o automobilima.

package d_07_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        Automobil auto1 = new Automobil();
        auto1.marka = "Ford";
        auto1.model = "Focus";
        auto1.godinaProizvodnje = 1995;

        Automobil auto2 = new Automobil();
        auto2.marka = "BMW";
        auto2.model = "S";
        auto2.godinaProizvodnje = 1996;

        Automobil auto3 = new Automobil();
        auto3.marka = "Zastava";
        auto3.model = "Jugo";
        auto3.godinaProizvodnje = 1997;

        auto1.stampaj();
        auto2.stampaj();
        auto3.stampaj();
    }
}
