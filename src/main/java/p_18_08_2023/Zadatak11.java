package p_18_08_2023;

import java.util.Scanner;

public class Zadatak11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite trajanje videa: ");
        int sekunde = s.nextInt();
        System.out.println("Unesite trenutno vreme videa: ");
        int trenutnoVreme = s.nextInt();
        double pregledanProcenat = 100.0 * trenutnoVreme / sekunde;
        int i;
        String zvezdica = "*";
        String crtica = "-";
        String dodavanje;
        StringBuilder rezultat = new StringBuilder();
        for (i = 1; i < 100; i = i + 1) {
            if (i <= pregledanProcenat) {
                dodavanje = zvezdica;
            } else {
                dodavanje = crtica;
            }
            rezultat.append(dodavanje);
        }
        System.out.println(rezultat);
    }
}