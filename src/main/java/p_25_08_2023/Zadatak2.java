//Zadatak
//Napisati dve metode, jedna metoda sluzi za stampanje imena a druga sluzi za stampanje prezimena. U glavnom programu pozvati metode na izvrsenje tako da se 5 puta ispise ime i prezime u istom redu.
//Primer izvrsenja:
//Milan Jovanovic
//Milan Jovanovic
//Milan Jovanovic
//Milan Jovanovic
//Milan Jovanovic

package p_25_08_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 5; i++) {
            imeMetoda();
            System.out.print(" ");
            prezimeMetoda();
        }
    }
        public static void imeMetoda () {
            System.out.print("Ime");
        }
        public static void prezimeMetoda () {
            System.out.println("Prezime");
        }
    }
