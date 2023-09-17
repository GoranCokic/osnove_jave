package p_15_09_2023.Primer1;

public class Kamion extends Vozilo {
    private int nosivost;

    public Kamion() {
        super();
    }

    //konstruktor sa izvedenim parametrima
    public Kamion(String registracija, String marka, int brzina, int nosivost) {
        super(registracija, marka, brzina);
        this.nosivost = nosivost;
    }

    public int getNosivost() {
        return nosivost;
    }

    public void setNosivost(int nosivost) {
        this.nosivost = nosivost;
    }

    public void stampajKamiion() {
        System.out.println("REGISTACIJA: " + this.registracija);
        System.out.println("BRZINA: " + this.brzina);
        System.out.println("MARKA: " + this.marka);
        System.out.println("NOSIVOST: " + this.nosivost);
    }
}
