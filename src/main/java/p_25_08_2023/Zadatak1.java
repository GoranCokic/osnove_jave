//Zadatrak
//Napisati metodu koja stampa ime i prezime i u glavnom programu pozvati metodu na izvrsenje 5 puta.

package p_25_08_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 5; i++) {
            printPracticeMethod();
        }
    }

    public static void printPracticeMethod() {
        System.out.println("Ime Prezime");
    }
}
