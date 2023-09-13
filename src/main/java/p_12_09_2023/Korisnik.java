package p_12_09_2023;

public class Korisnik {
    private String imeIPrezime;
    private String tipLicene;

    public Korisnik() {
        tipLicene = "basic";
    }

    public Korisnik(String imeIPrezime) {
        this.tipLicene = "basic";
        this.imeIPrezime = imeIPrezime;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public void pretplatiSe(int uplata) {
        if (uplata == 100) {
            this.tipLicene = "pro";
        } else if (uplata == 150) {
            this.tipLicene = "premium";
        }
    }

    public void ponistiPretplatu() {
        this.tipLicene = "basic";
    }

    public int trajanjePoziva() {
        if (this.tipLicene.equals("basic")) {
            return 40;
        } else if (this.tipLicene.equals("pro")) {
            return 240;
        } else if (this.tipLicene.equals("premium")) {
            return 1440;
        }
        return 40;
    }

    public void stampa() {
        System.out.println("Korisnik je: " + this.imeIPrezime);
        System.out.println("Licenca je: " + this.tipLicene);
        System.out.println("Trajanje poziva je: " + trajanjePoziva());
    }
}
