//(DOPUNA)
//Napisati main program koji koristi kreiranu metodu tako da stampa sledecu sliku za M. M unosi korisnik. Zadatak resiti koristeci petlju u main metodi.
//Primer izvrsenja:
//Unesite M: 6
//*
//* *
//* * *
//* * * *
//* * * * *
//* * * * * *

package p_25_08_2023;

import java.util.Scanner;

public class Zadatak5_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        stampanjeZvezdica(n);
    }

    public static void stampanjeZvezdica(int n) { // void znaci da metoda/funkcija ne vraca nikakvu vrednost u main
        for (int i = 1; i <= n; i++) {
            for (int j = i; j !=0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
