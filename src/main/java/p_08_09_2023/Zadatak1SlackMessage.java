package p_08_09_2023;

public class Zadatak1SlackMessage {
    public String tekstPoruke;
    public String imeIPrezime;
    public String datum;

    public void stampanjePodataka() { //ova metoda nema prosledjene parametre jer su ti parametri automatski dostupni
        System.out.println(this.imeIPrezime + " - " + this.datum);
        System.out.println(this.tekstPoruke);
    }

    public void updateData(String noviTekst, String noviDatum) {
        tekstPoruke = noviTekst;
        datum = noviDatum;
    }
}
