//error code:  URL_MISSMATCH
//
//Primer izvrsenja2:
//Enter actual url: google.com/home
//Enter expected url: google.com/home
//Enter error code: URL_MISSMATCH
//1 Test passed.
//
// Napisati program koji proverava da li je kliknuto u okviru login forme za web stranicu. Korisnik unosi x i y koordinate za T1, T2 i M. Ispisati odgovarajuce poruke.
//
//T1 i T2 su pozicije login forme. M je pozicija na koju je kliknuto
//
//
//
//
//Primer izvrsenja 1:
//Unesite x za T1: 10
//Unesite y za T1: 100
//Unesite x za T2: 100
//Unesite y za T2: 0
//Unestie x za M: 50
//Unesite y za M: 50
//Kliknuto je unutar forme
//
//Primer izvrsenja 2:
//Unesite x za T1: 10
//Unesite y za T1: 100
//Unesite x za T2: 100
//Unesite y za T2: 0
//Unestie x za M: 120
//Unesite y za M: 50
//Nije kliknuto je unutar forme

package d_17_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int xT1 = s.nextInt();
        int yT1 = s.nextInt();
        int xT2 = s.nextInt();
        int yT2 = s.nextInt();
        int xT3 = s.nextInt();
        int yT3 = s.nextInt();
        if (xT3 > xT1 && xT3 < xT2) {
            System.out.println("Kliknuto je unutar forme");
        } else {
            System.out.println("Nije kliknuto je unutar forme");
        }
    }
}
