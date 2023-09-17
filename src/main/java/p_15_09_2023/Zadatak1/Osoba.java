package p_15_09_2023.Zadatak1;

public class Osoba {
    protected String imeIPrezime;
    protected String jmbg;

    Osoba(){

    }

    public Osoba(String imeIPrezime, String jmbg) {
        this.imeIPrezime = imeIPrezime;
        this.jmbg = jmbg;
    }

    public void stampa() {
        System.out.println(this.imeIPrezime + ", " + this.jmbg);
    }
}
