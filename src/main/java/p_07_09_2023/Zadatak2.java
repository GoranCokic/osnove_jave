package p_07_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        Zadatak2SlackMessage prvaPoruka = new Zadatak2SlackMessage();
        prvaPoruka.imeIPrezime = "prvi covek";
        prvaPoruka.datumIVreme = "22-12-1990";
        prvaPoruka.tekstPoruke = "mala poruka";
        System.out.println("" + prvaPoruka.imeIPrezime + " - " + prvaPoruka.datumIVreme);
        System.out.println(prvaPoruka.tekstPoruke);
        System.out.println();

        Zadatak2SlackMessage drugaPoruka = new Zadatak2SlackMessage();
        drugaPoruka.imeIPrezime = "drugi covek";
        drugaPoruka.datumIVreme = "44-2-2000";
        drugaPoruka.tekstPoruke = "velika poruka";
        System.out.println("" + drugaPoruka.imeIPrezime + " - " + drugaPoruka.datumIVreme);
        System.out.println(drugaPoruka.tekstPoruke);
    }
}
