//8.Zadatak
//Napisati metodu koja vrsi konverziju rimske(string) u arapske brojeve(int).
//1 - I
//2 - II
//3 - III
//4 - IV
//5 - V
//Kao parametar se unosi vrednost rimkog broja(string) a vraca se arapski (int).
//Ako se unese V vraca se 5. Ako se unese vrednost koja nije podrzana vracamo nulu.

package p_25_08_2023;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesi jedan od brojeva I II III IV V");
        String rimskiBroj = s.next();
        int rezultat = rimskiUArapske(rimskiBroj);
        System.out.println(rezultat);
    }

    public static int rimskiUArapske(String brojRimski) {
        if (brojRimski.equals("I")) {
            return 1;
        } else if (brojRimski.equals("II")) {
            return 2;
        } else if (brojRimski.equals("III")) {
            return 3;
        } else if (brojRimski.equals("IV")) {
            return 4;
        } else if (brojRimski.equals("V")) {
            return 5;
        } else {
            return 0;
        }
    }
}
