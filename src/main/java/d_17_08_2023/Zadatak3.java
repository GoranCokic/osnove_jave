//Napisati program koji simulira izvrsenja test case-a za redirekciju nakon uspesnog logovanja na sistem. Program sa tastature ucitava actual url stranice, expected url stranice i kod o gresci koja treba da se prikaze ukoliko actual stranica nije kao sto je ocekivano.
//Objasnjenje: Ucitala se login stranica, uneli ste usename i password, kliknuli na login i nakon logina je potrebno da vas stranica redirektuje na google.com/ivalid_login a vas redirektuje npr na google.com/home.
//Napomena: Poruku o gresci unesite kao jednu rec.
//Ukolko je validacija prosla uspesno ispisati 1 Test passed.
//Primer izvrsenja 1:
//Enter actual url: google.com/ivalid_login
//Enter expected url: google.com/home
//Enter error code: URL_MISSMATCH
//Assertion Error: Expected google.com/home but got google.com/ivalid_login, error code:  URL_MISSMATCH
//
//Primer izvrsenja2:
//Enter actual url: google.com/home
//Enter expected url: google.com/home
//Enter error code: URL_MISSMATCH
//1 Test passed.

package d_17_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String actualURL = s.next();
        String expectedURL = s.next();
        String errorCode = "URL_MISSMATCH";
        if (!actualURL.equals(expectedURL)) {
            System.out.println("Assertion Error: Expected " + expectedURL + " but got " + actualURL + ", error code: " + errorCode);
        } else {
            System.out.println("1 Test passed.");
        }
    }
}
