//Zadatak
//Kreirati klasu Sastojak koja ima:
//naziv sastojka
//cenu
//gettere i settere
//konstuktore
//
//
//--U glavnom programu kreirati 3 sastojka.
// U glavnom programu kreirati niz sastojaka ucitavajuci ih od korisnika. Ucitavaju se N sastojaka i na kraju odstampati niz. Koristeci ArrayList-e

package p_12_09_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        ArrayList<Sastojak> listaSastojaka = new ArrayList<Sastojak>();
        Scanner s = new Scanner(System.in);
        System.out.print("koliko sastojaka ima: ");
        int N = s.nextInt(); //treba da bude 3
        for (int i = 0; i < N ; i++) {
            System.out.print("Unesite ime sastojka: ");
            String sastojak = s.next();
            System.out.print("Unesite cenu sastojka: ");
            int cena = s.nextInt();
            listaSastojaka.add(new Sastojak(sastojak,cena));
        }
        for (int i = 0; i < listaSastojaka.size(); i++) {
            System.out.println("ime sastojka je: " + listaSastojaka.get(i).getNaziv() + " cena sastojka je " + listaSastojaka.get(i).getCena());

        }
    }
}
