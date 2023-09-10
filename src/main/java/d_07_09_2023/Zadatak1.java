// Zadatak 1: Kreiranje klase "Student"
//Napišite klasu "Student" koja ima sledeće atribute: ime (String), brojIndeksa (int) i fakultet (String). Kreirajte 2-3 objekta ove klase u glavnoj metodi i postavite im vrednosti. Ispisati informacije o studentima.

package d_07_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.brojIndeksa = 1;
        student1.fakultet = "frst college";
        student1.ime = "first name";

        Student student2 = new Student();
        student2.brojIndeksa = 2;
        student2.fakultet = "second college";
        student2.ime = "second name";

        Student student3 = new Student();
        student3.brojIndeksa = 3;
        student3.fakultet = "third college";
        student3.ime = "third name";

        student1.stampaj();
        student2.stampaj();
        student3.stampaj();
    }
}
