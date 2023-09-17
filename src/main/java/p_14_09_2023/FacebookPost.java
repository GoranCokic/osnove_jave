package p_14_09_2023;

import java.util.ArrayList;

public class FacebookPost {
    private String imeIPrezimeKorisnikaKojiJeStavioOglas;
    private String tekstObjave;
    private ArrayList<Reakcija> nizReakcija;

    public FacebookPost(String imeIPrezimeKorisnikaKojiJeStavioOglas,
                        String tekstObjave) {
        this.imeIPrezimeKorisnikaKojiJeStavioOglas = imeIPrezimeKorisnikaKojiJeStavioOglas;
        this.tekstObjave = tekstObjave;
        this.nizReakcija = new ArrayList<Reakcija>();
    }

    public String getImeIPrezimeKorisnikaKojiJeStavioOglas() {
        return imeIPrezimeKorisnikaKojiJeStavioOglas;
    }

    public void setImeIPrezimeKorisnikaKojiJeStavioOglas(String imeIPrezimeKorisnikaKojiJeStavioOglas) {
        this.imeIPrezimeKorisnikaKojiJeStavioOglas = imeIPrezimeKorisnikaKojiJeStavioOglas;
    }

    public String getTekstObjave() {
        return tekstObjave;
    }

    public void setTekstObjave(String tekstObjave) {
        this.tekstObjave = tekstObjave;
    }

    public ArrayList<Reakcija> getNizReakcija() {
        return nizReakcija;
    }

    public void reaguj(Reakcija reakcija) {
        this.nizReakcija.add(reakcija);
    }

    private int brojSrca() {
        int brojac = 0;
        for (int i = 0; i < this.nizReakcija.size(); i++) {
            if (this.nizReakcija.get(i).getTipReakcije().equals("srce")) {
                brojac++;
            }
        }
        return brojac;
    }

    private int brojLajk() {
        int brojac = 0;
        for (int i = 0; i < this.nizReakcija.size(); i++) {
            if (this.nizReakcija.get(i).getTipReakcije().equals("lajk")) {
                brojac++;
            }
        }
        return brojac;
    }

    private int brojSmajli() {
        int brojac = 0;
        for (int i = 0; i < this.nizReakcija.size(); i++) {
            if (this.nizReakcija.get(i).getTipReakcije().equals("smajli")) {
                brojac++;
            }
        }
        return brojac;
    }
}
