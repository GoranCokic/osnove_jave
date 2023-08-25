//Napisati metodu koja stampa zvezdicu sa razmakom.
//U glavnom programu je potrebno odstampati sledecu sliku koristeci metode koje smo definisali.
//*  *  *
//*  *
//*

package p_25_08_2023;

public class Zadatak3 {
    public static void main(String[] args) {
        int i;
        for (i = 3; i != 0; i--) {
            int j;
            for (j = i; j != 0; j--) {
                tackica();
            }
            System.out.println();
        }
    }

    public static void tackica() {
        System.out.print("*");
    }
}
