//(Za vezbanje)
//Napisati program koji stampa 20 pozicija.
//Za aktivnu poziciju stampa *
//Za neaktivnu pozciju stampa _
//	Korisnik unosi granice za nekativni opseg, unoseci A i B.
//	Primer izvrsenja:
//	Unesite a: 5
//	Unesite b: 10
//            * * * * _ _ _ _ _ _ * * * * * * * * * *
//	Objasnjenje: stampamo _ od 5 do 10 u ostalim situacijama stampamo *

package p_18_08_2023;

import java.util.Scanner;

public class Zadatak10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        String rezultat = "";
        int i;
        String zvezdica = "*";
        String crtica = "_";
        String dodavanje;
        for (i = 1; i < 20; i = i + 1) {
            if (i < a || i > b) {
                dodavanje = zvezdica;
                rezultat = rezultat + dodavanje;
            } else if (i >= a && i <= b) {
                dodavanje = crtica;
                rezultat = rezultat + dodavanje;
            }
        }
        System.out.println(rezultat);
    }
}