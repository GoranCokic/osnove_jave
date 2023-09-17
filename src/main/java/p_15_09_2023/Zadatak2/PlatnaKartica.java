package p_15_09_2023.Zadatak2;

public class PlatnaKartica {
    protected double trenutnaSuma;
    protected String brojKartice;
    protected int godinaDoKadaVaziKartica;
    protected int mesecDoKadaVaziKartica;

    public PlatnaKartica(int trenutnaSuma, String brojKartice, int godinaDoKadaVaziKartica, int mesecDoKadaVaziKartica) {
        this.trenutnaSuma = trenutnaSuma;
        this.brojKartice = brojKartice;
        this.godinaDoKadaVaziKartica = godinaDoKadaVaziKartica;
        this.mesecDoKadaVaziKartica = mesecDoKadaVaziKartica;
    }

    //zasada bez gettera

    public void dodajSredstva(double uplata) {
        this.trenutnaSuma = this.trenutnaSuma + uplata;
    }

    public void izvrsiTransakciju(double skidanje) {
        this.trenutnaSuma = this.trenutnaSuma - skidanje;
    }

    public void stampa() {
        System.out.println(this.brojKartice + ", " + this.mesecDoKadaVaziKartica + "/" + this.godinaDoKadaVaziKartica + ", $" + this.trenutnaSuma);
    }
}
