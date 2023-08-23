//Napisati program koji ucitava RIMSKE brojeva od korisnika i na ekranu ispisuje arapsku vrednost sve dok korisnik ne unese KRAJ..
//
//Primer izvrsenja:
//Unesite rimski broj: X
//Arapski: 10
//Unesite rimski broj: C
//Arapski: 50
//Unesite rimski broj: D
//Arapski: 500
//Unesite rimski broj: M
//Arapski: 1000
//Unesite rimski broj: I
//Arapski: 1
//Unesite rimski broj: KRAJ
//Kraj programa.

package d_22_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.print("Unesite rimski broj: ");
            String broj = s.next();
            int brojInt;

            if (broj.equals("I")) {
                brojInt = 1;
                System.out.println("Arapski broj: " + brojInt);
            } else if (broj.equals("V")) {
                brojInt = 5;
                System.out.println("Arapski broj: " + brojInt);
            } else if (broj.equals("X")) {
                brojInt = 10;
                System.out.println("Arapski broj: " + brojInt);
            } else if (broj.equals("L")) {
                brojInt = 50;
                System.out.println("Arapski broj: " + brojInt);
            } else if (broj.equals("C")) {
                brojInt = 100;
                System.out.println("Arapski broj: " + brojInt);
            } else if (broj.equals("D")) {
                brojInt = 500;
                System.out.println("Arapski broj: " + brojInt);
            } else if (broj.equals("M")) {
                brojInt = 1000;
                System.out.println("Arapski broj: " + brojInt);
            } else if (broj.equals("kraj")) {
                end = true;
            }

        }
        System.out.println("Kraj programa.");
    }
}
