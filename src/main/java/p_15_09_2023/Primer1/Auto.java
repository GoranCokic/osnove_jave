package p_15_09_2023.Primer1;

public class Auto extends Vozilo {
    private int brojVrata;

    public Auto() {
        super();//ovo uglavnom ne pises jer to intellij podrazumeva
    }

    public Auto(String registracija, String marka, int brzina, int brojVrata) {
        super(registracija,marka,brzina);//ovo uglavnom ne pises jer to intellij podrazumeva
        this.brojVrata = brojVrata;
    }

    public int getBrojVrata() {
        return brojVrata;
    }

    public void setBrojVrata(int brojVrata) {
        this.brojVrata = brojVrata;
    }
    //@Override //ovo je samo za sigurnost da postoji metoda stampaj() u superklasi
    public void stampaj() {
        System.out.println("REGISTACIJA: " + this.registracija);
        System.out.println("BRZINA: " + this.brzina);
        System.out.println("MARKA: " + this.marka);
        System.out.println("BROJ VRATA: " + this.brojVrata);
    }
}
