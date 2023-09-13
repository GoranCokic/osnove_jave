package p_12_09_2023;

public class Proizvod {
    private String nazivProizvoda;
    private Kupac kupac;
    private int cenaIzradeProizovda;
    private double cenaProizvoda;

    Proizvod(String nazivProizvoda, Kupac kupac, int cenaIzradeProizovda) {
        this.nazivProizvoda = nazivProizvoda;
        this.kupac = kupac;
        this.cenaIzradeProizovda = cenaIzradeProizovda;
    }

    public String getNazivProizvoda() {
        return this.nazivProizvoda;
    }

    public void setNazivProizvoda(String nazivProizvoda) {
        this.nazivProizvoda = nazivProizvoda;
    }

    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public int getCenaIzradeProizovda() {
        return cenaIzradeProizovda;
    }

    public void setCenaIzradeProizovda(int cenaIzradeProizovda) {
        this.cenaIzradeProizovda = cenaIzradeProizovda;
    }

    public void racunanjeCeneProizvoda() {
        cenaProizvoda = 1.0 * this.cenaIzradeProizovda * 1.9 * (100.0 - kupac.getKartica().getPopust()/100);
    }

    public void stampa() {
        System.out.println("Proizvod: " + this.nazivProizvoda + " kosta " + this.cenaProizvoda);
        System.out.println("Kupac je: " + this.kupac.getImeIPrezime() + " broj kartice " + this.kupac.getKartica().getBrojKartice());
    }
}
