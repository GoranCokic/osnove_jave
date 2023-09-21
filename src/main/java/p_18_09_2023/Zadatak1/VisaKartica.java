package p_18_09_2023.Zadatak1;

public class VisaKartica extends PlatnaKartica {
    private String ovlascenoLiceDaPodizeNovac;

    VisaKartica(int trenutnaSuma, String brojKartice, int godinaDoKadaVaziKartica, int mesecDoKadaVaziKartica, String ovlascenoLiceDaPodizeNovac) {
        super(trenutnaSuma, brojKartice, godinaDoKadaVaziKartica, mesecDoKadaVaziKartica);
        this.ovlascenoLiceDaPodizeNovac = ovlascenoLiceDaPodizeNovac;
    }

    @Override
    public void izvrsiTransakciju(double skidanje) {
        if (skidanje * 0.18 <= 4) {
            skidanje = skidanje + 4;
        } else {
            skidanje = skidanje * 0.18;
        }
        this.trenutnaSuma = this.trenutnaSuma + skidanje;
    }

    @Override
    public void stampa() {
        System.out.print("Visa Card: " + this.brojKartice);
        System.out.println(this.brojKartice + ", " + this.mesecDoKadaVaziKartica + "/" + this.godinaDoKadaVaziKartica + ", $" + this.trenutnaSuma);
    }
}
