//Zadatak
//Kreirati klasu TestStep koja od privatnih atributa ima:
//opis
//actual vrednost
//expected vrednost
//errorMessage
//konstuktor koji postavlja sve atribute
//getere za sve elemente
//settere nemamo
//metodu validate koja proverava da li su actual i expected vrednosti jednake i ukoliko jesu metoda vraca true u suprotnom vraca false
//metodu za stampu koja stampa test step u formatu:
//|  Opis |
//| Status(failed ili passed) | Error message (ako je test step failovao)
//
//
//	Kreirati klasu TestCase koja od privatnih atributra ima:
//ID
//naziv
//niz test koraka
//metodu addTestStep koja dodaje test step u niz
//metodu koja vraca broj test stepova koji su failovali (oni kod kojih actual vrednost nije jednaka sa expected)
//metodu koja vraca stanje testcase-a. Ukoliko nema koraka koji su failovali metoda vraca “PASSED” u suprotnom “FAILED”
//metoda koja stampa status test case-a u formatu
//ID - Naziv
//|  Opis  |
//|  Status(failed ili passed) | Error message (ako je test step failovao)
//|  Opis  |
//|  Status(failed ili passed) | Error message (ako je test step failovao)
//|  Opis  |
//|  Status(failed ili passed) | Error message (ako je test step failovao)
//ukupan broj koraka / broj test caseva koji su faulovali
//Stanje test case-a (PASSED ILI FALED)
//
//
//
//
//
//
//
//
//
//
//
//
//PRIMER TEST CASE-a (Objasnjenja idu u zagradama):
//ID - Validate Login Form
//| Open app |
//| passed | (actual=””, expected=””)
//| Check if login link is visible |
//| passed |  (actual=”visible”, expected=”visible”)
//| Click on login link |
//| passed | (actual=””, expected=””)
//| Click on login link |
//| passed | (actual=””, expected=””)
//| Check if form is visible |
//| passed | (actual=”visible”, expected=”visible”)
//| Enter username |
//| passed |  (actual=””, expected=””)
//| Enter password |
//| passed |  (actual=””, expected=””)
//| Check if login button is visible |
//| failed | Login button is not visible  (actual=”visible”, expected=”invisible”)
//| Click on login button |
//| passed |  (actual=””, expected=””)
//| User should be logged |
//| failed | User is not logged|  (actual=”logged”, expected=”not logged”)
//| Page should be /home |
//| failed | User should be redirected to home page (actual=”/login”, expected=”/home”)
//11 / 3
//TEST CASE FAILED

package p_14_09_2023.Zadatak5;

public class Zadatak5 {
    public static void main(String[] args) {
        TestStep testStep1 = new TestStep("klikni a", "dobro je", "dobro je", "");
        TestStep testStep2 = new TestStep("klikni b", "nije dobro", "dobro je", "");
        TestStep testStep3 = new TestStep("klikni c", "dobro je", "dobro je", "");

        TestCase testCase = new TestCase("1","prvi test case");


        testStep1.stampa();
        testStep2.stampa();
        testStep3.stampa();
        System.out.println("---------");
        testCase.dodajTestStep(testStep1);
        testCase.dodajTestStep(testStep2);
        testCase.dodajTestStep(testStep3);
        testCase.stampa();
    }
}
