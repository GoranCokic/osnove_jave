package d_12_09_2023;

public class Racun {
    private String brojRacuna;
    private String imeIPrezimeOsobe;
    private double trenutnoStanjeNaRacunu;

    Racun(String brojRacuna,
          String imeIPrezimeOsobe,
          double trenutnoStanjeNaRacunu) {
        this.brojRacuna = brojRacuna;
        this.imeIPrezimeOsobe = imeIPrezimeOsobe;
        this.trenutnoStanjeNaRacunu = trenutnoStanjeNaRacunu;
    }

    public String getBrojRacuna() {
        return this.brojRacuna;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public String getImeIPrezimeOsobe() {
        return this.imeIPrezimeOsobe;
    }

    public void setImeIPrezimeOsobe(String imeIPrezimeOsobe) {
        this.imeIPrezimeOsobe = imeIPrezimeOsobe;
    }

    public double getTrenutnoStanjeNaRacunu() {
        return this.trenutnoStanjeNaRacunu;
    }

    private void setTrenutnoStanjeNaRacunu(int trenutnoStanjeNaRacunu) {
        this.trenutnoStanjeNaRacunu = trenutnoStanjeNaRacunu;
    }

    public void uplatiNaRacun(double uplata) {
        this.trenutnoStanjeNaRacunu = this.trenutnoStanjeNaRacunu + uplata;
    }

    public void skiniSaRacuna(double skidanje) {
        this.trenutnoStanjeNaRacunu = this.trenutnoStanjeNaRacunu - skidanje;
    }

    public void print() {
        System.out.println("Osoba " + this.imeIPrezimeOsobe + " - broj racuna " + this.brojRacuna);
        System.out.println("stanje na racunu je: " + this.trenutnoStanjeNaRacunu + " rsd");
    }
}
