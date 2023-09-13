package d_12_09_2023;

public class Ugovor {
    private String datum;
    private FizickoLice prodavac;
    private FizickoLice kupac;
    private int cenaProdajeNekretnine;
    private String adresaNekretnine;

    Ugovor(String datum, FizickoLice prodavac, FizickoLice kupac, int cenaProdajeNekretnine, String adresaNekretnine) {
        this.datum = datum;
        this.prodavac = prodavac;
        this.kupac = kupac;
        this.cenaProdajeNekretnine = cenaProdajeNekretnine;
        this.adresaNekretnine = adresaNekretnine;
    }

    public double koeficientDaLiJeRanijeKupovala() {
        if (kupac.getDaLiJeKupovalaRanije()) {
            return 0.02;
        } else {
            return 0.03;
        }
    }

    public double zaradaAgencije() {
        return 1.0 * 1000 + this.cenaProdajeNekretnine * koeficientDaLiJeRanijeKupovala();
    }
    public void print(){
        System.out.println("Dana " + this.datum + " god sklopljen je ugovor izmedju "
                + this.prodavac.getImeIPrezime() + " i " + this.kupac.getImeIPrezime() +
                " o kupovini nekretnine " + this.adresaNekretnine + " po ceni od " + this.cenaProdajeNekretnine +
                " pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od " + this.zaradaAgencije());
    }
}
