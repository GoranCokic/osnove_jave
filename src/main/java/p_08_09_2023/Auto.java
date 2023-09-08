package p_08_09_2023;

public class Auto {
    public String imeIPrezimeVozaca;
    public String markaAutomobila;
    public int brojVrata;
    public int potrosnjaNa100km;
    public int trenutnaBrzina;
    public int godinaProizvodnje;
    public int doKadaJeRegistrovan;
    public int kubikaza;
    public int brojRegistracije;
    public boolean daLiJeUkljucenaKlima;
    public int maksimalnaBrzina;

    public void stampa() {
        System.out.println(this.imeIPrezimeVozaca);
        System.out.println(markaAutomobila + " - " + this.brojVrata + " vrata");
        System.out.println("Sa potrosnjom do " + this.potrosnjaNa100km + " l na 100km");
        System.out.println(trenutnaBrzina + " km/h je trenutna brzina");

    }

    public boolean daLiJePrekoracio(int ogranicenje) {
        return trenutnaBrzina > ogranicenje;
    }

    public double visinaNovcaneKazne(int ogranicenje) {
        return 1000.0 * trenutnaBrzina / ogranicenje;
    }

    public boolean daLiJeAutoOldtajmer() {
        return godinaProizvodnje < 1950;
    }

    public boolean daLiJeIsteklaRegistracija(int trenutniMesec) {
        return trenutniMesec > doKadaJeRegistrovan;
    }

    public double cenaRegistracije() {
        if (kubikaza <= 2000) {
            return kubikaza * 100;
        } else {
            return kubikaza * 100 * 1.3;
        }
    }

    public void dodajGas() {
        trenutnaBrzina = trenutnaBrzina + 10;
        if (trenutnaBrzina > maksimalnaBrzina) {
            trenutnaBrzina = maksimalnaBrzina;
        }
    }

    public void koci() {
        if (trenutnaBrzina > 10) {
            trenutnaBrzina = trenutnaBrzina - 10;
        } else {
            trenutnaBrzina = 0;
        }
    }

    public double trenutnaPotrosnjaAuta() {
        double faktorKlime = 1;
        if (daLiJeUkljucenaKlima) {
            faktorKlime = 1.2;
        }
        return 1.0 * (trenutnaBrzina / 100.0 * potrosnjaNa100km) * faktorKlime;
    }

    public void stampajTablu() {
        double brojCrtica = 1.0 * trenutnaBrzina / maksimalnaBrzina * 100;
        for (int i = 0; i < 100; i++) {
            if (i < brojCrtica) {
                System.out.print("|");
            } else {
                System.out.print(".");
            }
        }
        System.out.println("" + trenutnaBrzina + "/" + maksimalnaBrzina + "km/h");
    }
}
