//Zadatak (POGLEDAJ SLIKU)
//Kreirati klasu Proizvod koja ima
//Naziv proizvoda
//kupca/musteriju
//cenu izrade proizvoda
//gettere i settere
//konstruktore
//Metodu za racunanje cene proizvoda, koja racuna cenu proizvoda po formuli:
//cena izrade * 1.9 * (100 - popust na clansku karticu) / 100
//Metodu za stampanje proizvoda u formatu:
//naziv proizvoda - cena
//ime i prezime - broj kartice
//
//Kreirati klasu Kupac koja ima:
//ime i prezime
//clansku kartu
//gettere i settere, clanska karta ne moze da se menja
//konstruktore
//metodu stampaj koja stampa u formatu
//ime i prezime - broj kartice
//
//Kreirati klasu ClanskaKarta koja ima:
//popust (u rasponu od 5 do 10 %)
//broj kartice (npr: 9329-0239)
//gettere i setter
//konstuktore
//
//
//U glavnom programu kreirati objekte i isprobati funkcionalnosti.

package p_12_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        Kartica kartica = new Kartica(5, "9329-0239");
        Kupac kupac = new Kupac("marko", kartica);
        Proizvod proizvod = new Proizvod("sljive", kupac, 100);
        proizvod.racunanjeCeneProizvoda();
        kartica.stampa();
        System.out.println();
        kupac.stampa();
        System.out.println();
        proizvod.stampa();

    }
}
