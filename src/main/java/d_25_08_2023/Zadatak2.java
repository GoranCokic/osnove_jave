//Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije vraca novu vrednost koja se formira kao na primeru. METODA NISTA NE STAMPA.
//ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

package d_25_08_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        String rezultat = spajanje(a, b);
        System.out.println(rezultat);
    }

    public static String spajanje(int prviBroj, int drugiBroj) {
        return "" + prviBroj + drugiBroj;
    }
}
