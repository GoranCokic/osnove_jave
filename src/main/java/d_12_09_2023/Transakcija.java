package d_12_09_2023;

public class Transakcija {
    private int idTransakcije;
    private Racun racunSaOvogSeSkida;
    private Racun racunNaOvajSeDodaje;
    private double vrednostZaPrenos;

    Transakcija(int idTransakcije,
                Racun racunSaOvogSeSkida,
                Racun racunNaOvajSeDodaje,
                double vrednostZaPrenos) {
        this.idTransakcije = idTransakcije;
        this.racunSaOvogSeSkida = racunSaOvogSeSkida;
        this.racunNaOvajSeDodaje = racunNaOvajSeDodaje;
        this.vrednostZaPrenos = vrednostZaPrenos;
    }

    public double provizijaTransakcije() {
        if (this.vrednostZaPrenos < 4500) {
            return 45;
        } else {
            return vrednostZaPrenos * 1.1;
        }
    }

    public void izvrsiTransakciju() {
        double a = this.racunSaOvogSeSkida.getTrenutnoStanjeNaRacunu();
        double b = this.racunNaOvajSeDodaje.getTrenutnoStanjeNaRacunu();
        double c = this.vrednostZaPrenos;
        if (a < (c + provizijaTransakcije())) {
            System.out.println("Nema dovoljno sredstava");
        } else {
            this.racunNaOvajSeDodaje.uplatiNaRacun(c);
            this.racunSaOvogSeSkida.skiniSaRacuna(c + provizijaTransakcije());
        }
    }
    public void stampa(){
        System.out.println("Racun sa kojeg se salje: " + this.racunSaOvogSeSkida.getImeIPrezimeOsobe() + " - " + this.racunSaOvogSeSkida.getBrojRacuna());
        System.out.println("Racun na koji se salje: " + this.racunNaOvajSeDodaje.getImeIPrezimeOsobe() + " - " + this.racunNaOvajSeDodaje.getBrojRacuna());
    }
}
