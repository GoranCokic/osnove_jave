package PrviJavaTest;

import java.util.Random;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int skriveniBroj = rand.nextInt(50);
        Scanner s = new Scanner(System.in);

        int i = 0;
        boolean igraTraje = true;
        while (i != 5 && igraTraje) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            if (broj > skriveniBroj) {
                System.out.println("Broj je manji");
            } else if (broj < skriveniBroj) {
                System.out.println("Broj je veci");
            } else {
                System.out.println("pogodili ste broj");
                igraTraje = false;
            }
            i++;
            if (i == 5) {
                System.out.println("Kraj igre! Niste pogodili tajni broj u 5 pokušaja.");
            }
        }
    }
}
