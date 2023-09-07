//1.Zad
////		Kreirati klasu Racun koja ima
////		broj racuna (npr: 840-23932-323)
////		ime i prezime vlasnika
////		stanje na racunu
////		U mainu kreirati minimum dva racuna sa pratecim podacima i ostampati podatke za svaki objekat.

package p_07_09_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Zadatak1Racun prviRacun = new Zadatak1Racun();
        prviRacun.brojRacuna = "840-23932-323";
        prviRacun.imeIPrezime = "Milan Jovanovic";
        prviRacun.stanjeNaRacunu = 1000.0;
//        System.out.println("" + prviRacun.brojRacuna + prviRacun.imeIPrezime + prviRacun.stanjeNaRacunu);

        Zadatak1Racun drugiRacun = new Zadatak1Racun();
        drugiRacun.brojRacuna = "840-23932-334";
        drugiRacun.imeIPrezime = "Marko Markovic";
        drugiRacun.stanjeNaRacunu = 200.0;
//        System.out.println("" + drugiRacun.brojRacuna + drugiRacun.imeIPrezime + drugiRacun.stanjeNaRacunu);

        Scanner s = new Scanner(System.in);
        System.out.print("unesite sumu za transakciju: ");
        int broj = s.nextInt();

        prviRacun.stanjeNaRacunu = prviRacun.stanjeNaRacunu - broj;
        drugiRacun.stanjeNaRacunu = drugiRacun.stanjeNaRacunu + broj;

        System.out.println(prviRacun.stanjeNaRacunu + " " + drugiRacun.stanjeNaRacunu);
    }
}
