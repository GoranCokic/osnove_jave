//Zadatak
//		Kreirati klasu Osoba koja od atributa ima:
// ime i prezime
// jmbg
//konstuktor sa parametrima
//difoltni konstuktor
//metodu stampaj koja stampa podatke u formatu
//			ime prezime, jmbg
//
//
//		Kreirati klasu Student koja nasledjuje klasu Osoba,
//			koja od dodatnih atributa ima:
//broj indeksa
//dug za skolarinu
//konstuktor sa parametrima
//difoltni konstuktor
//metodu uplati skolarinu koja umanjuje dug za prosledjenu vrednost. Metoda prima iznos uplate kao parametar metode.
//Napisati metod stampajStudenta da stampa sve podatke o studentu
//
//
//Kreirati klasu Profesor koja nasledjuje klasu Osoba,
//			koja od dodatnih atributa ima:
//naziv predmeta koji predaje
//iznos plate
//konstuktor sa parametrima
//difoltni konstuktor
//metodu povecaj platu. Metoda kao parametar prima procenat povecanja.
//Napisati metodu stampajProfu da stampa sve podatke o profesoru
//
//
//		U glavnom programu kreirati 2 studenta i 2 profesora.

package p_15_09_2023.Zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {
        Student student1 = new Student("1",100,"marko","123");
        Student student2 = new Student("2", 150,"petar","3434");

        Profesor profesor1 = new Profesor("matematika",300,"Profesor1","jmbg1");
        Profesor profesor2 = new Profesor("biologija",400,"Profesor2","jmbg2");

        profesor1.povecajPlatu(10);
        student1.uplatiSkolarinu(10);

        profesor1.stampa();
        System.out.println("-----");
        student1.stampa();
    }
}
