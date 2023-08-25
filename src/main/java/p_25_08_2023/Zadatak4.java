//Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik za dva prosledjena broja. Brojevi su ulazni parametri funkcije. U gravnom programu pozvati nekoliko puta funkciju sa razlicitim prosledjenim vrednostima.

package p_25_08_2023;

public class Zadatak4 {
    public static void main(String[] args) {
        int broj1 = 2;
        int broj2 = 4;

        matematickeOperacije(broj1, broj2);

        int broj3 = 5;
        int broj4 = 6;
        matematickeOperacije(broj3, broj4);
    }

    public static void matematickeOperacije(int prviBroj, int drugiBroj) {
        int zbir = prviBroj + drugiBroj;
        int razlika = prviBroj - drugiBroj;
        int proizvod = prviBroj * drugiBroj;
        double kolicnik = 1.0 * prviBroj / drugiBroj;
        System.out.println(zbir);
        System.out.println(razlika);
        System.out.println(proizvod);
        System.out.println(kolicnik);
    }
}
