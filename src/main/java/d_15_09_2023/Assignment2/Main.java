//Zadatak
//Kreirati klasu Karton koja ima:
//tip kartona (crveni, zuti)
//konstuktore za koje mislite da ce vam trebati
//gettere i settere za karton
//
//Kreirati klasu Osoba koja ima:
//ime i prezime
//jmbg
//godinu rodjenja
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere
//metodu stampaj koja stampa u formatu:
//(ime i prezime), (jmbg), (godina rodjenja)
//
//Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//broj (broj koji igrac nosi)
//poziciju koju igra (odbrambeni, napadac, … )
//niz kartona
//kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere za broj, kapiten i poziciju
//metodu dodaj karton, gde se dodaje karton u niz
//metodu koja vraca broj zutih kartona
//metodu koja vraca broj crvenih kartona
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//
//U glavnom programu kreirati igraca i dodati mu nekoliko kartona.

package d_15_09_2023.Assignment2;

public class Main {
    public static void main(String[] args) {
        Card yellow = new Card("yellow");
        Card red = new Card("red");

        Player player1 = new Player("player1","23123",1990,3,"position1",false);

        player1.addCardToPlayer(yellow);
        player1.addCardToPlayer(yellow);
        player1.addCardToPlayer(yellow);
        player1.addCardToPlayer(red);

        player1.print();
    }
}
