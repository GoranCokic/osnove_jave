package d_12_09_2023;

import d_11_09_2023.Book;

public class FizickoLice {
    private String imeIPrezime;
    private String brojLicneKarte;
    private String jmbg;
    private boolean daLiJeKupovalaRanije;

    FizickoLice(String imeIPrezime, String brojLicneKarte, String jmbg, boolean daLiJeKupovalaRanije){
        this.imeIPrezime = imeIPrezime;
        this.brojLicneKarte = brojLicneKarte;
        this.jmbg = jmbg;
        this.daLiJeKupovalaRanije = daLiJeKupovalaRanije;
    }

    public String getImeIPrezime(){
        return this.imeIPrezime;
    }
    public void setImeIPrezime(String imeIPrezime){
        this.imeIPrezime = imeIPrezime;
    }
    public String getBrojLicneKarte(){
        return this.brojLicneKarte;
    }
    public void setBrojLicneKarte(String brojLicneKarte){
        this.brojLicneKarte = brojLicneKarte;
    }
    public String getJmbg(){
        return this.jmbg;
    }
    public boolean getDaLiJeKupovalaRanije(){
        return this.daLiJeKupovalaRanije;
    }
    public void setDaLiJeKupovalaRanije(boolean daLiJeKupovalaRanije){
        this.daLiJeKupovalaRanije = daLiJeKupovalaRanije;
    }
    public void print(){
        System.out.println("Name and surname are: " + this.imeIPrezime +", licence number: " +this.brojLicneKarte);
    }

}
