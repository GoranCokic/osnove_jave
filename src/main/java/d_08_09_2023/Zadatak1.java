//Napisati klasu Proizvod koja ima atribute
//naziv proizvoda (String)
//cenu proizvoda (double)
//težinu proizvoda u gramima. (double)
//	i metode:
//stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu. Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost je cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
//racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe. Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:
//za tezinu do 100g, postarina iznosi 200din
//za tezinu od 101g do 500g, postarina iznosi 400din
//za tezinu preko 500g, postarina iznosi 1000din
//
//U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.

package d_08_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        double smanjenaCena;

        Proizvod proizvod1 = new Proizvod();
        proizvod1.tezina = 100;
        proizvod1.cena = 30;
        proizvod1.naziv = "perec";

        Proizvod proizvod2 = new Proizvod();
        proizvod2.tezina = 250;
        proizvod2.cena = 150;
        proizvod2.naziv = "burek";

        proizvod1.stampaj();
        proizvod2.stampaj();

        proizvod1.povecajCenu(10);
        proizvod1.stampaj();
        System.out.println("cena sa popustom: " + proizvod1.vratiCenuSaPopustom(10));
        System.out.println("Postarina je: " + proizvod1.racunajPostarinu());


        System.out.println("drugi deo");
        proizvod2.povecajCenu(10);
        proizvod2.stampaj();
        System.out.println("cena sa popustom: " + proizvod2.vratiCenuSaPopustom(10));
        System.out.println("Postarina je: " + proizvod2.racunajPostarinu());


    }
}
