//Napisati program koji sa tastature ucitava broj N i operaciju koja se izvrsava nad njim. Na kraju programa se ispisuje nova vrednost promenljive N.
//Ukoliko se za operaciju unese uvecaj, to uvecava promenljivu N za 1.
//Ukoliko se za operaciju unese smanji, to smanjuje promenljivu N za 1.
//
//	Primer izvrsenja:
//	Unesite N: 10
//	Unesite akciju: uvecaj
//	Nova vrednost za N je 11

package p_18_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj n: ");
        int n = s.nextInt();
        System.out.println("Unesite operaciju 'uvecaj' ili 'umanji': ");
        String operacija = s.next();
        if (operacija.equals("uvecaj")){
            n=n+1;
        }
        if (operacija.equals("umanji")){
            n=n-1;
        }
        System.out.println("N broj je: " + n);
    }
}
