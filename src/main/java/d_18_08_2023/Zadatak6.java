//(Za vezbanje) Napisati program koji ucitava dimenziju table i stampa je na ekranu.
//Primer izvrsenja:
//Unesite dimenziju table: 5
// _|_|_|_|_|
// _|_|_|_|_|
// _|_|_|_|_|
// _|_|_|_|_|
// _|_|_|_|_|
//
//Primver izvrsenja 2:
//Unesite dimenziju table: 7
// _|_|_|_|_|_|_|
// _|_|_|_|_|_|_|
// _|_|_|_|_|_|_|
// _|_|_|_|_|_|_|
// _|_|_|_|_|_|_|
// _|_|_|_|_|_|_|
// _|_|_|_|_|_|_|

package d_18_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Unos
        int dimenzijaTabele = s.nextInt();
        //Kraj unosa

        //Logika
        int i; //brojac
        for (i = 0; i < dimenzijaTabele; i = i + 1) {
            int b;
            for (b = 0; b < dimenzijaTabele; b = b + 1) {
                System.out.print("_|");
            }
            System.out.println();
        }
    }
}
