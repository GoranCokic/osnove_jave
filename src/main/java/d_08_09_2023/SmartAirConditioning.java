package d_08_09_2023;

public class SmartAirConditioning {
    public String markaKlime;
    public int potrosnjaDokHladi;
    public int potrosnjaDokGreje;
    public int izabranaTemperatura;
    public boolean hladiGreje;

    public void stampa() {
        System.out.println(markaKlime + " - " + hladiGreje + " - " + izabranaTemperatura);
    }

    public int potroseniNovac() {
        int ukupnaPotrosnja;
        if (hladiGreje) { //ako je true onda hladi, ako je false onda greje
            ukupnaPotrosnja = 30 * 15 * potrosnjaDokHladi;
        } else {
            ukupnaPotrosnja = 30 * 15 * potrosnjaDokGreje;
        }

        if (ukupnaPotrosnja > 350) {
            return 350 * 6 + (ukupnaPotrosnja - 350) * 9;
        } else {
            return ukupnaPotrosnja * 6;
        }
    }
}
