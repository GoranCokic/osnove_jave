package d_12_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        FizickoLice prodavac = new FizickoLice("marko","123123", "1124", true);
        FizickoLice kupac = new FizickoLice("aleksandar","2323","54545",false);
        Ugovor ugovor = new Ugovor("12.02.2023",prodavac,kupac,100,"beograd na vodi 1");
        ugovor.print();
    }
}