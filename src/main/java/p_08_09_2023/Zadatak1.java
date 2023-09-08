package p_08_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        Zadatak1SlackMessage p = new Zadatak1SlackMessage();
        p.imeIPrezime = "marko";
        p.datum = "12-12-1212";
        p.tekstPoruke = "prvi tekst";

        p.stampanjePodataka();

        System.out.println("--------------");

        p.updateData("prvi novi tekst", "prvi 12 -12-1212 novi datum");
        p.stampanjePodataka();

        System.out.println("--------------");

        Zadatak1SlackMessage q = new Zadatak1SlackMessage();
        q.imeIPrezime = "aleksandar";
        q.datum = "13-13-1313";
        q.tekstPoruke = "drugi tekst";

        q.stampanjePodataka();

        System.out.println("--------------");

        q.updateData("drugi novi tekst", "drugi 13-13-1313 novi datum");
        q.stampanjePodataka();

    }
}
