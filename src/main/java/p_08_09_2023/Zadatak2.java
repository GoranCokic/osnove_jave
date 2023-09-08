package p_08_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.imeIPrezimeVozaca = "Milan Jovanovic";
        auto1.markaAutomobila = "BMW";
        auto1.brojVrata = 4;
        auto1.potrosnjaNa100km = 10;
        auto1.trenutnaBrzina = 200;
        auto1.godinaProizvodnje = 2000;
        auto1.doKadaJeRegistrovan = 6;
        auto1.kubikaza = 900;
        auto1.daLiJeUkljucenaKlima = true;
        auto1.maksimalnaBrzina = 240;


        auto1.stampa();

        System.out.println(auto1.daLiJePrekoracio(100));

        System.out.println("kazna je: " + auto1.visinaNovcaneKazne(100));

        System.out.println("Da li je auto oldtajmer (true/false) " + auto1.daLiJeAutoOldtajmer());

        int trenutniMesec = 7;
        System.out.println("Da li je istekla registracija (true/false) " + auto1.daLiJeIsteklaRegistracija(trenutniMesec));

        System.out.println(auto1.cenaRegistracije());

        auto1.dodajGas();
        auto1.dodajGas();
        auto1.dodajGas();
        System.out.println("Trenutna brzina je: " + auto1.trenutnaBrzina);
        auto1.koci();
        System.out.println("Trenutna brzina je: " + auto1.trenutnaBrzina);

        System.out.println("Trenutna potrosnja je: " + auto1.trenutnaPotrosnjaAuta());

        System.out.println("ovo iza je tabla");
        auto1.stampajTablu();
    }
}
