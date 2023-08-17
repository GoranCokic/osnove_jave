//(Za vezbanje) Napisati program za potrebe Makao igrice. Korisnik unosi 4 informacije:
//znak karte koja je na stolu
//broj karte koja je na stolu
//znak karte koju igrac zeli da odigra
//broj karte koju igrac zeli da odigra
//	i nakon toga se na ekranu ispisuje da li je potez ispravan. Potez je ispravan ukoliko se karta na stolu i odigrana karta poklapaju po znaku ili broju.
//
//	Znakovi karata: srce, kocka, list, detelina
//	Brojevi karata: 2,3,4,5,6,7,8,9,10,A,J,Q,K
//
//	Primer izvrsenja 1:
//	Znak karte na stolu: srce
//	Broj karte na stolu: A
//	Znak karte koju zelis da odigras: detelina
//	Broja karte koju zelis da odigras: A
//	Potez je validan.
//
//	Primer izvrsenja 2:
//Znak karte na stolu: srce
//	Broj karte na stolu: A
//	Znak karte koju zelis da odigras: srce
//	Broja karte koju zelis da odigras: K
//	Potez je validan.
//
//
//Primer izvrsenja 3:
//Znak karte na stolu: srce
//	Broj karte na stolu: A
//	Znak karte koju zelis da odigras: detelina
//	Broja karte koju zelis da odigras: K
//	Potez nije validan.

package p_17_08_2023;

import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("znak karte koja je na stolu");
        String znakKarteNaStolu = s.next();
        System.out.println("broj karte koja je na stolu");
        String brojKarteNaStolu = s.next();
        System.out.println("znak karte koju igrac zeli da odigra");
        String znakKarteZeli = s.next();
        System.out.println("broj karte koju igrac zeli da odigra");
        String BrojKarteZeli = s.next();
        if ((znakKarteNaStolu.equals(znakKarteZeli))||(brojKarteNaStolu.equals(BrojKarteZeli))){
            System.out.println("potez je validan");
        }else{
            System.out.println("Nije validan");
        }


    }
}
