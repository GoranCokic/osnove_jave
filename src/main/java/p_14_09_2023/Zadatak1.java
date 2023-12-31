//Zadatak
//
//Kreirati klasu Sastojak koja ima:
//naziv
//cenu
//gettere i settere
//konstruktore
//metodu za stampanje koja stampa  podatke u formatu:
//naziv - cena.din
//
//	Kreirati klasu Pasta koja ima:
//niz sastojaka
//metodu za dodavanje sastojka
//defaultni konstruktor
//metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
//metodu za stampu koja stampa podatke u formatu:
//Pasta je sa sastojcima:
//naziv - cena.din
//naziv - cena.din
//naziv - cena.din
//Cena paste je <sracunata cena paste>.din
//
//U glavnom programu kreirati objekte i testirati funkcionalnosti
//
//
//(ostavite za kraj) metodu za brisanje sastojka. U metodu se salje naziv sastojka koji se brise.

package p_14_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        Pasta pasta = new Pasta();

        Sastojak sastojak1 = new Sastojak("prvi sastojak", 20);
        Sastojak sastojak2 = new Sastojak("drugi sastojak", 30);
        Sastojak sastojak3 = new Sastojak("treci sastojak", 40);

        pasta.dodajSastojak(sastojak1);
        pasta.dodajSastojak(sastojak2);
        pasta.dodajSastojak(sastojak3);

        System.out.println("---------");
        sastojak1.stampa();
        System.out.println("---------");
        pasta.stampa();
        System.out.println("---------");
        pasta.obrisiSastojak("prvi sastojak");
        System.out.println("---------");
        pasta.stampa();
        System.out.println("---------");
    }
}
