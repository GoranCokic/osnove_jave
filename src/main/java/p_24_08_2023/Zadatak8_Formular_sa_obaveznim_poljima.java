//Napisati program koji validira registracionu formu. Program treba da održava tri niza informacija:
//**Niz polja za registraciju**: Ovaj niz treba da sadrži nazive polja koja se pojavljuju u registracionoj formi.
//
//**Niz obaveznih polja**: Ovaj niz treba da sadrži za svako polje informaciju da li je polje obavezno za popunjavanje ili ne. Ako je odgovarajuća vrednost `true`, to znači da je polje obavezno. Ako je vrednost `false`, polje nije obavezno.
//
//Program treba da radi na sledeći način:
//
// Ispisuje registracionu formu sa nazivima polja iz prvog niza. Pored svakog naziva polja se ispisuje zvezdica (*) ako je odgovarajuća vrednost u trećem nizu `true`.
//
//Napomena: Pretpostavljamo da su oba niza iste dužine i da se podaci o istom polju nalaze na istom indeksu u oba niza
//
//Ako su nizovi:
//inputs = “first name”, “last name”, “email”, “password”, “phone”, “address”
//required = true, true, true, true, false, false
//
//Primer izvrsenja
//first name: * _______________________
//last name: * _______________________
//email: * _______________________
//password: * _______________________
//phone:  _______________________
//address:  _______________________
package p_24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak8_Formular_sa_obaveznim_poljima {
    public static void main(String[] args) {
        ArrayList<String> poljaZaRegistraciju = new ArrayList<String>();
        ArrayList<Boolean> obaveznaPolja = new ArrayList<Boolean>();
        ArrayList<String> uneteVrednosti = new ArrayList<String>();

        poljaZaRegistraciju.add("first name: * ");
        poljaZaRegistraciju.add("last name: * ");
        poljaZaRegistraciju.add("email: * ");
        poljaZaRegistraciju.add("password: * ");
        poljaZaRegistraciju.add("phone: ");
        poljaZaRegistraciju.add("address: ");

        obaveznaPolja.add(true);
        obaveznaPolja.add(true);
        obaveznaPolja.add(true);
        obaveznaPolja.add(true);
        obaveznaPolja.add(false);
        obaveznaPolja.add(false);


        Scanner s = new Scanner(System.in);

        System.out.println("popunite formular");

        System.out.println("polja sa zvezdicom su obavezna, polja bez zvezdica mogu ostati prazna (dakle /)");
        int i;
        for (i = 0; i < poljaZaRegistraciju.size(); i++) {
            System.out.println();
            System.out.print(poljaZaRegistraciju.get(i));
            String unos = s.next();
            if (obaveznaPolja.get(i)) {
                if (unos.equals("/")) {
                    System.out.println("Polje ne moze biti prazno");
                    i--;
                } else {
                    System.out.print(unos);
                    uneteVrednosti.add(unos);
                }
            } else {
                System.out.println(unos);
                uneteVrednosti.add(unos);
            }
        }
        System.out.println("formular je:");
        for (i = 0; i < poljaZaRegistraciju.size(); i++)
            System.out.println(poljaZaRegistraciju.get(i) + uneteVrednosti.get(i));
    }

}
