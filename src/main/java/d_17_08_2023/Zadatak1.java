//Napisati program koji ima informacije koje ucitava informacije sa tastature:
//Ime
//Prezime
//godinu rodjenja
//I stampa informaicije u formatu:
//[ime] [prezime] - [startost] god
//
//Primer izvrsenja:
//Ako je ime = Milan, prezime = Jovanovic i godina rodjenja 1995 stapaju se informacije
//Milan Jovanovic - 26 god

package d_17_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ime = s.next();
        String prezime = s.next();
        int godinaRodjenja = s.nextInt();
        System.out.println(ime + prezime + "-" + (2023 - godinaRodjenja + " god"));
    }
}
