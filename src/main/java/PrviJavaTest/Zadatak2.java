package PrviJavaTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> nizUdaljenosti = new ArrayList<Integer>();

        System.out.print("Unesite broj dalekovoda: ");
        int brojDalekovodaN = s.nextInt();

        //unos udaljenosti
        String izgled = "|";
        int zbirUdaljenosti = 0;
        for (int i = 0; i < brojDalekovodaN; i++) {
            System.out.print("rastojanje je:");
            int rastojanjeDalekovoda = s.nextInt();
            nizUdaljenosti.add(rastojanjeDalekovoda);
            zbirUdaljenosti = zbirUdaljenosti + rastojanjeDalekovoda;
            izgled = izgled + "..." + rastojanjeDalekovoda + "m...|";
        }
        System.out.println(izgled);

        //provera standarda
        for (int i = 0; i < nizUdaljenosti.size(); i++) {
            if (nizUdaljenosti.get(i) < 50 || nizUdaljenosti.get(i) > 100) {
                System.out.println("Rastojanje na poziciji " + i + ", dužine " + nizUdaljenosti.get(i) + "m nije po standardima Evropske unije.");
            }

        }
        double ukupnaDuzinaKablova = zbirUdaljenosti * 1.5;
        System.out.println("Potrebna dužina kablova za dalekovodnu infrastrukturu je " + ukupnaDuzinaKablova + "m.");
    }
}
