//Napisati program koji proverava uparenost zagrada. Korisnik unosi matematicku formulu sve dok ne unese znak =. Korisnik unosi svaki karakter jednacine posebno i na kraju programa se ispisuje da li su sve zagrade uparene.
//	Formula koja se koristi u primeru je: (2 * ( 1 + 3))=
//	Primer izvrsenja:
//	Unos: (
//	Unos: 2
//	Unos: *
//	Unos: (
//	Unos: 1
//	Unos: +
//	Unos: 3
//	Unos: )
//	Unos: )
//	Unos: =
//	Zagrade su uparene
//	(Objasnjenje: Imamo isti broj otvorenih i zatvorenih zagrada)
//
//	Primer izvrsenja 2:
//	Unos: (
//	Unos: 2
//	Unos: *
//	Unos: (
//	Unos: 1
//	Unos: +
//	Unos: 3
//	Unos: )
//	Unos: =
//	Zagrade nisu uparene
//	(Objasnjenje: fali poslednja zagrada iz formule)

package d_22_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean isFinished = false;
        int closed = 0;
        int open = 0;
        while (!isFinished) {
            System.out.println("Unos: ");
            String input = s.next();

            if (input.contains("(")) {
                open++;
            } else if (input.contains(")")) {
                closed++;
            }
            if (input.contains("=") && open != closed) {
                isFinished = false;
                System.out.println("Zagrade nisu uparene.");
            } else if (input.contains("=") && open == closed) {
                isFinished = false;
                System.out.println("Imamo isti broj otvorenih i zatvorenih zagrada.");

            }
        }
    }
}