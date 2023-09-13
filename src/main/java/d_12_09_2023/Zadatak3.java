package d_12_09_2023;

public class Zadatak3 {
    public static void main(String[] args) {
        Racun racunSaOvogSeSkida = new Racun("123","marko", 100);
        Racun racunNaOvajSeDodaje = new Racun("3434","aleksandar",400);
        Transakcija transakcija = new Transakcija(1,racunSaOvogSeSkida,racunNaOvajSeDodaje, 50);
        racunSaOvogSeSkida.print();
        System.out.println("-------");
        racunNaOvajSeDodaje.print();
        System.out.println("--transakcija---");
        transakcija.stampa();
        System.out.println("--transakcija izvrsena---");
        transakcija.izvrsiTransakciju();
        System.out.println("-------");
        racunSaOvogSeSkida.print();
        System.out.println("-------");
        racunNaOvajSeDodaje.print();
        System.out.println("-------");
    }
}
