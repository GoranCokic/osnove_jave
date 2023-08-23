//(ZA VEZBANJE)Napisati program koji od korisnika ucitava N jednocifrenih brojeva i od njih formira rezultujuci broj kao na primeru
//Unesite N: 5
//Unesite broj: 1
//Unesite broj: 2
//Unesite broj: 0
//Unesite broj: 4
//Unesite broj: 1
//Rezultujuci broj je 12041 (Promenljiva tipa int)

//da napravis "string od broja"

package p_21_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i;
        int suma = 0;

        for (i = 0; i < n; i = i + 1) {
            int broj = s.nextInt();
            suma = suma*10 + broj;
        }
        System.out.println(suma);
    }

}
