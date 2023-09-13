package p_12_09_2023;

public class Kartica {
    private int popust;
    private String brojKartice;

    Kartica(int popust, String brojKartice) {
        this.popust = popust;
        this.brojKartice = brojKartice;
    }

    public int getPopust() {
        return popust;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }

    public void stampa(){
        System.out.println("popust je: " + this.popust);
        System.out.println("broj kartice je: " +this.brojKartice);
    }
}
