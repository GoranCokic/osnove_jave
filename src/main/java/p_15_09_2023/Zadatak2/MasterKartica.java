package p_15_09_2023.Zadatak2;

public class MasterKartica extends PlatnaKartica {

    MasterKartica(int trenutnaSuma, String brojKartice, int godinaDoKadaVaziKartica, int mesecDoKadaVaziKartica) {
        super(trenutnaSuma, brojKartice, godinaDoKadaVaziKartica, mesecDoKadaVaziKartica);
    }

    @Override
    public void izvrsiTransakciju(double skidanje) {
        this.trenutnaSuma = this.trenutnaSuma + skidanje * 1.05;
    }

    public void naplatiOdrzavanje(){
        this.trenutnaSuma = trenutnaSuma - 2;
    }

    @Override
    public void stampa() {
        System.out.print("Master Card: " + this.brojKartice);
        super.stampa();
    }
}
