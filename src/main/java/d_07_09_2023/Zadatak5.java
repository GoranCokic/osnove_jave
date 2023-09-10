// Zadatak 5: Kreiranje klase "Oprema"
//Napišite klasu "Oprema" sa atributima: tip (String), marka (String) i cena (double). U glavnoj metodi kreirajte 3 objekta ove klase i postavite im vrednosti unosom sa tasture. Ispisati informacije o opremi.

package d_07_09_2023;


import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Oprema oprema1 = new Oprema();
        System.out.println("Unesite cenu za opremu 1");
        oprema1.cena = s.nextInt();
        System.out.println("Unesite cenu za marku 1");
        oprema1.marka = s.next();
        System.out.println("Unesite cenu za tip 1");
        oprema1.tip = s.next();

        Oprema oprema2 = new Oprema();
        System.out.println("Unesite cenu za opremu 1");
        oprema2.cena = s.nextInt();
        System.out.println("Unesite cenu za marku 1");
        oprema2.marka = s.next();
        System.out.println("Unesite cenu za tip 1");
        oprema2.tip = s.next();

        Oprema oprema3 = new Oprema();
        System.out.println("Unesite cenu za opremu 1");
        oprema3.cena = s.nextInt();
        System.out.println("Unesite cenu za marku 1");
        oprema3.marka = s.next();
        System.out.println("Unesite cenu za tip 1");
        oprema3.tip = s.next();

        oprema1.stampaj();
        oprema2.stampaj();
        oprema3.stampaj();
    }
}
