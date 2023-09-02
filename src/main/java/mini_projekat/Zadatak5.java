//**Zadatak: Generisanje Random Passworda sa Specijalnim Karakterom**
//
//Kako biste saznali više o generisanju random brojeva u programiranju, preporučujemo da istražite sledeći link: random koristeci Random class. Ovaj resurs će vam pružiti detaljnije razumevanje kako programi generišu slučajne brojeve i kako ih možete koristiti u različitim situacijama.
//
//Napišite program koji simulira automatsko generisanje random passworda. Korisnik će uneti željenu dužinu passworda, a program će kreirati i ispisati password koji zadovoljava te parametre. Ovaj zadatak zahteva implementaciju različitih metoda za generisanje karaktera i passworda.
//generisiRandomKarakter: Ova metoda generiše i vraća random karakter. Metoda koristi niz stringova sa elementima koji predstavljaju mala slova, velika slova i brojeve (niz je sa fiksnim vrednostima). Random bira jedan element iz niza i vraća ga kao povreatnu vrednost (string). Ova metoda nema ulazne parametre.
//generisiRandomSpecijalanKarakter: Ova metoda generiše i vraća random specijalan karakter. Metoda koristi niz stringova sa elementima `@`, `#`, `&`, `*` i `!` (niz je sa fiksnim vrednostima). Random bira jedan element iz niza i vraća ga kao string. Ova metoda nema ulazne parametre.
//
//Napomena: Metode generisiRandomSpecijalanKarakter generisiRandomKarakter nemaju nikakvu stampu u sebi!
//
//Glavni program:
//   - Korisnik unosi dužinu passworda i informaciju da li treba sadržati specijalan karakter.
//   - Koristeći metodu `generisiPassword`, program generiše i ispisuje password.
//
//Primer izvršenja 1:
//Unesite dužinu passworda: 10
//Da li želite da sadrži specijalan karakter: true
//Generisan password: eD9Kx0e@
//
//Primer izvršenja 2:
//Unesite dužinu passworda: 10
//Da li želite da sadrži specijalan karakter: false
//Generisan password: eCxdwEeFEx

package mini_projekat;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite duzinu vaseg generisanog passworda: ");
        int duzinaPassworda = s.nextInt();

        System.out.println("Da li password treba da sadrzi specijalne karaktere? (true/false): ");
        boolean daLiTrebajuSpecijalniKarakteri = s.nextBoolean();

        String tvojPassword = generisiPassword(duzinaPassworda, daLiTrebajuSpecijalniKarakteri);
        System.out.println(tvojPassword);
    }

    public static String generisiRandomSpecijalanKarakter() {
        String[] specijalniKarakter = {"@", "#", "&", "*", "!"};
        SecureRandom rand = new SecureRandom();
        int number = rand.nextInt(specijalniKarakter.length);
        return specijalniKarakter[number]; //vraca jedan stringkarakter od niza ovde gore
    }

    public static String generisiRandomKarakter() {
        String alphabet = "qwertyuiopasdfghjklzxcvbnm";
        String validCharactersForPassword = alphabet + alphabet.toUpperCase() + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 0;
        String[] validCharactersForPasswordList = validCharactersForPassword.split("");
        SecureRandom rand = new SecureRandom();
        int number = rand.nextInt(validCharactersForPassword.length());
        return validCharactersForPasswordList[number]; //vraca jedan od stringkaraktera iz niza
    }

    public static String generisiPassword(int brojKarakteraUPasswordu, boolean daLiSuPotrebniSpecijalniKarakteri) {
        ArrayList<String> passwordList = new ArrayList<String>();
        for (int i = 0; i < brojKarakteraUPasswordu; i++) {
            passwordList.add(generisiRandomKarakter());
        }

        SecureRandom rand = new SecureRandom();
        int number = rand.nextInt(brojKarakteraUPasswordu);

        if (daLiSuPotrebniSpecijalniKarakteri) {
            passwordList.set(number, generisiRandomSpecijalanKarakter());
        }

        StringBuilder password = new StringBuilder();
        for (String s : passwordList) {
            password.append(s);
        }
        return password.toString();
    }
}
