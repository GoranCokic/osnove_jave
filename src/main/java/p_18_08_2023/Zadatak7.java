//Napisati program koji od korisnika ucitava jacinu zvuka (od 0 do 10) i stampa slikicu za zvuk sa brojem crtica koje je korisnik uneo.
//Primer izvrsenja;
//Unesite jacinu zvuka: 8
//< | | | | | | | |
//
//(Dopuna za vezbanje)
//Ukoliko je jacina zvuka 0 stampa se slika </ (simulacija za mute) u sprotnom < | | | (sa brojem crtica jacinom zvuka)

package p_18_08_2023;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int jacinaZvuka = s.nextInt();
        int i;
        String znakJacine = "|";
        String rezultat = "<";
        if (jacinaZvuka != 0) {
            for (i = 0; i < jacinaZvuka; i++) {
                rezultat = rezultat + znakJacine;
            }
            System.out.println(rezultat);
        } else {
            System.out.println(rezultat + "/");
        }

    }
}
