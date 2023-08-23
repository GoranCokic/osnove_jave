//Napisati program koji od korisnika ucitava N brojeva i sabira samo parne brojeve. Na kraju programa prikazati sumu.
//Primer izvrsenja:
//Unesite N: 5
//Unesite broj: 1
//Unesite broj: 2
//Unesite broj: 9
//Unesite broj: 6
//Unesite broj: 8
//Suma parnih brojeva je 16
//Objasnjenje: 2 + 6 + 8 = 16

package d_21_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i;
        int suma = 0;
        for (i = 0; i < n; i++) {
            int broj = s.nextInt();
            if (broj % 2 == 0) {
                suma = suma + broj;
            }
        }
        System.out.println(suma);
    }
}
