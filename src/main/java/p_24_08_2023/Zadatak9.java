//9.Zadatak
//Napisati program koji ucitava N brojeva koje smesta u niz i NA KRAJU programa ih stampa. Potrebne su dve petlje, u jednoj se desava ucitavanje niza a u drugoj stampanje.
//Primer:
//Unesite N: 10
//Unesite broj: 1
//Unesite broj: 2
//Unesite broj: 3
//Unesite broj: 4
//Unesite broj: 8
//Unesite broj: 9
//Unesite broj: 2
//Unesite broj: 1
//Unesite broj: 7
//Unesite broj: 5
//Niz je:
//1, 2, 3, 4, 8, 9, 2, 1, 7, 5

package p_24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {
        ArrayList<Integer> niz = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int i;
        for (i = 0; i < n; i++) {
            int broj = s.nextInt();
            niz.add(broj);
        }
        for (i = 0; i < n; i++)
            System.out.print(niz.get(i) + ", ");
    }
}
