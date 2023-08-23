//Zadatak
//Napisati program koji od korisnika ucitava brojeve sve dok ne unesu makar po jedan broj od 1 do 4.
//Primer:
//Unesite broj:1
//Unesite broj:2
//Unesite broj:2
//Unesite broj:3
//Unesite broj:0
//Unesite broj:5
//Unesite broj:3
//Unesite broj:4
//Kraj programa
//
//Objasnjenje: Od svakih 1, 2, 3 i 4 je unet po jedan.

package p_22_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean uslov = true;
        boolean jedinica = false;
        boolean dvojka = false;
        boolean trojka = false;
        boolean cetvorka = false;
        while (uslov) {
            int broj = s.nextInt();
            if (broj == 1) {
                jedinica = true;
            } else if (broj == 2) {
                dvojka = true;
            } else if (broj == 3) {
                trojka = true;
            } else if (broj == 4) {
                cetvorka = true;
            }
            if (jedinica && dvojka && trojka && cetvorka) {
                uslov = false;
            }
        }
    }
}
