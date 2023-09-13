package p_12_09_2023;

public class Kupac {
    private String imeIPrezime;
    private Kartica kartica;


    public Kupac(String imeIPrezime, Kartica kartica) {
        this.imeIPrezime = imeIPrezime;
        this.kartica = kartica;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }
    public Kartica getKartica(){
        return kartica;
    }
    public void stampa(){
        System.out.println("ime i prezmie kupca je: " + this.imeIPrezime);
        System.out.println("kartica je: " + kartica); //vraca adresu u memoriji
        System.out.println("broj kartice je: " + this.kartica.getBrojKartice());
        System.out.println("popist kartice je: " + this.kartica.getPopust());
    }
}
