//Napisati program koji ucitava N brojeva od korisnika i sabira samo trocifrene brojeve.
//Unesite N: 5
//Unesite broj: 1
//Unesite broj: 32
//Unesite broj: 121
//Unesite broj: 1333
//Unesite broj: 144
//Suma je: 265

package d_21_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i;
        int suma = 0;
        for (i = 0; i < n; i++) {
            int broj = s.nextInt();
            if ((broj + "").length() == 3) {
                suma = suma + broj;
            }
        }
        System.out.println(suma);
    }
}
