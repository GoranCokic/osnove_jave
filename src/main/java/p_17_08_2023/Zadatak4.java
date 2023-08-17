//Napisati program koji ispisuje da li je broj b manji od broja a. A i B unosimo sa tastature.
//Primer izvrsenja:
//Unesite a: 1
//Unesite b: 4
//
//Primer izvrsenja 2:
//Unesite a: 5
//Unesite b: 2
//B je manje.

package p_17_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if (a>b) {
            System.out.println("b je manje od a");
        } else {
            System.out.println("b je vece od a");
        }

    }
}
