//Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
/// / / / /
//Napomena: Metoda nista ne vraca.

package d_25_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String karakterZaStampu = s.next();
        int n = s.nextInt();
        stampanje(karakterZaStampu, n);
    }

    public static void stampanje(String karakter, int brojPonavljanja) {
        for (int i = 0; i < brojPonavljanja; i++) {
            System.out.print(karakter);
        }
    }
}
