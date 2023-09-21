package p_18_09_2023.Zadatak1;

public abstract class PlatnaKartica {
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

    public abstract void izvrsiTransakciju(double skidanje);

    public abstract void stampa();
}
