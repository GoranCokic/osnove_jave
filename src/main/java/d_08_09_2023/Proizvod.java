package d_08_09_2023;

public class Proizvod {
    public String naziv;
    public double cena;
    public double tezina;

    public void stampaj() {
        System.out.println("{{" + naziv + "}}, {{" + cena + "}}, {{" + tezina + "}}");
    }

    public void povecajCenu(int povecanje) {
        cena = cena + povecanje;
    }

    public double vratiCenuSaPopustom(int popust) {
        double smanjenaCena = cena - cena * popust / 100;
        return smanjenaCena;
    }

    public int racunajPostarinu() {
        if (tezina <= 100) {
            return 200;
        } else if (tezina > 101 && tezina < 500) {
            return 400;
        } else {
            return 1000;
        }
    }

}
