//Napisati klasu Student koja ima
//
//broj indeksa
//ime i prezime
//tip studija (osnovne, master, doktorske)
//niz ispita
//konstuktore koje mislite da ce vam trebati
//gettere i settere za indeks, ime i prezime, tip studija
//getter za niz predmeta
//metodu dodaj ispit u niz ispita
//metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//metodu stampaj koja stampa u formatu:
//(broj indeksa) - (ime i prezime) - (tip studija)
//Predmeti:
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//Prosecna ocena: (prosecna ocena)
//
//
//Napisati klasu Ispit koja ima
//naziv predmeta
//ocenu (u rasponu od 5 do 10)
//Ime i prezime profesora koji predaje predmet
//konstuktore koje mislite da ce vam trebati
//gettere i settere za sve atribute
//metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//metodu koja stampa ispit u formatu:
//(naziv predmeta) - (profesor) - (ocena)

package d_14_09_2023.Assignment1;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("1","student1","undergrad");
        student1.addExamToExamsArray(new Exam("subject1",6,"professor1"));
        student1.addExamToExamsArray(new Exam("subject2",5,"professor2"));
        student1.addExamToExamsArray(new Exam("subject3",10,"professor3"));

        Student student2 = new Student("2","student2","phd");
        student2.addExamToExamsArray(new Exam("subject1",6,"professor1"));
        student2.addExamToExamsArray(new Exam("subject2",8,"professor2"));
        student2.addExamToExamsArray(new Exam("subject3",10,"professor3"));

        student1.print();
        System.out.println("------");
        student2.print();
    }
}
