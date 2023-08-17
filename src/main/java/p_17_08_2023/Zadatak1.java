//Napisati program koji sa tastature ucitava ime, prezime, broj telefona, email  i jmbg korisnika prikazuje u formatu:
//[Ime] [Prezime] - [JMBG]
//Broj Tel: [Broj telefona],
//Email: [Email],
//
//Unesite ime: Milan
//Unesite prezime: Jovanovic
//Unesite broj: +209329832
//Unesite email: milan@gmail.com
//Unesite jmbg: 329032938923
//
//Milan Jovanovic - 329032938923
//Broj tel:  +209329832
//Email: milan@gmail.com

package p_17_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vase ime: ");
        String ime = s.next();
        System.out.println("Unesite vase prezime: ");
        String prezime = s.next();
        System.out.println("Unesite vas broj telefona: ");
        int brojTelefona = s.nextInt();
        System.out.println("unesite vas mejl: ");
        String email = s.next();
        System.out.println("unesite vas jmbg: ");
        int jmbg = s.nextInt();
        System.out.println(ime + prezime + "-" + jmbg);
        System.out.println("Broj Tel: " + brojTelefona);
        System.out.println("Email:" + email);
    }
}
