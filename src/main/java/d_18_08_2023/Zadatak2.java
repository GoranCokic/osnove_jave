//Napisati program koji simulira stampanje ocitane licne karte u vise primeraka. Korisnik unosi podatke :
//ime
//prezime
//jmbg
//broj primeraka za stampu
//Primer izvrsenja:
//Unesite ime: Milan
//Unesite prezime: Jovanovic
//Unesite jmbg: 2109238932232
//Unesite broj primeraka za stampu: 3
//
//Primerak 1
//**********************************
//Ime i prezime: Milan Jovanovic
//JMBG: 2109238932232
//**********************************
//
//Primerak 2
//**********************************
//Ime i prezime: Milan Jovanovic
//JMBG: 2109238932232
//**********************************
//
//Primerak 3
//**********************************
//Ime i prezime: Milan Jovanovic
//JMBG: 2109238932232
//**********************************

package d_18_08_2023;

import javax.swing.*;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Unos
        String ime = s.next();
        String prezime = s.next();
        String jmbg = s.next();
        int brojPrimerakaZaStampu = s.nextInt();
        //Kraj unosa

        int i; //brojac
        int a; //brojac
        String imeIPrezimeForma = "Ime i prezime: "; //deo za formu
        String jmbgForma = "JMBG: "; //deo za formu

        //Logika
        int brojZvezdica = (imeIPrezimeForma + ime + " " + prezime).length();
        //System.out.println(brojZvezdica);

        for (i = 0; i < brojPrimerakaZaStampu; i = i + 1) {
            System.out.println("Primerak " + (i + 1));
            for (a = 0; a < brojZvezdica; a = a + 1) {
                System.out.print("*");
            }
            a = 0;
            System.out.println();
            System.out.println(imeIPrezimeForma + ime + " " + prezime);
            System.out.println(jmbgForma + jmbg);
            for (a = 0; a < brojZvezdica; a = a + 1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
