//. Napisati program koji ucitava niz A duzine N i broj X. Nakon unosa treba ispisati indekse onih clanova niza koji su jednaki broju X.
//	Primer izvrsenja:
//Unesite N: 5
//Unesite broj: 1
//Unesite broj: 3
//Unesite broj: 7
//Unesite broj: 3
//Unesite broj: 9
//Unesite X: 3
//
//Rezultat: Elementi niza A koji su jednaki broju X imaju indekse: 1, 3

package d_24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        System.out.println("unesite broj clanova niza: ");
        int N = s.nextInt();

        System.out.println("unesite " + N +" brojeva u nizu: ");
        for (int i = 0; i < N; i++) {
            int broj = s.nextInt();
            A.add(broj);
        }
        System.out.println("Unesite broj cije indekse u nizu zelite da nadjete: ");
        int X = s.nextInt();
        String dobriIndexi = "";
        for (int i = 0; i < N; i++) {
            if (A.get(i) == X) {
                dobriIndexi = dobriIndexi + i + ",";
            }
        }
        System.out.println("Rezultat: Elementi niza A koji su jednaki broju X imaju indekse: " + dobriIndexi);
    }
}
