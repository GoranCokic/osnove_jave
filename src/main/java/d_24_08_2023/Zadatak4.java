//.Zadatak
//Napisati program koji ucitava niz A duzine N, i koji nakon unosa niz A stampa sve elemente niza koji su veci od nule.
//Primer izvrsenja:
//Unesite N: 5
//Unesite broj: 1
//Unesite broj: -4
//Unesite broj: 3
//Unesite broj: -7
//Unesite broj: 9
//
//Brojevi veci od nule u nizu A su: 1, 3, 9,

package d_24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        ArrayList<Integer> A = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {
            int broj = s.nextInt();
            A.add(broj);
        }
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) > 0) {
                System.out.print(A.get(i) + ",");
            }
        }
    }
}
