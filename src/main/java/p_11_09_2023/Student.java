package p_11_09_2023;

public class Student {
    private String ime;
    private String prezime;
    private int brojIndeksa;
    private boolean daLiJeNaBudzetu;

    public String getIme() {
        return this.ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return this.prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public boolean getDaLiJeNaBudzetu() {
        return daLiJeNaBudzetu;
    }

    public void setDaLiJeNaBudzetu(boolean daLiJeNaBudzetu) {
        this.daLiJeNaBudzetu = daLiJeNaBudzetu;
    }

    public void stampa() {
        System.out.println("Ime je: " + this.ime);
        System.out.println("prezime je: " + this.prezime);
        System.out.println("indeks je: " + this.brojIndeksa);
        System.out.println("da li je na budzetu je: " + this.daLiJeNaBudzetu);
    }
}
