package p_14_09_2023;

import java.util.ArrayList;

public class Pasta {
    private ArrayList<Sastojak> nizSastojaka;

    Pasta() {
        this.nizSastojaka = new ArrayList<Sastojak>();
    }

    public void dodajSastojak(Sastojak sastojak) {
        this.nizSastojaka.add(sastojak);
    }

    public int cenaPaste() {
        int cenaPaste = 0;
        for (int i = 0; i < this.nizSastojaka.size(); i++) {
            cenaPaste = cenaPaste + this.nizSastojaka.get(i).getCena();
        }
        return cenaPaste;
    }

    public void stampa() {
        for (int i = 0; i < this.nizSastojaka.size(); i++) {
            System.out.println("Sastojak " + this.nizSastojaka.get(i).getNaziv() + " cena " + this.nizSastojaka.get(i).getCena() + ".din");
        }
        System.out.println("Cena paste je " +  cenaPaste() + ".din");
    }

    //NAKON bRISANJA SASTOJKA CEO NIZ CE SE POMERITI U LEVO ZA 1 PA CE DOCI DO PRESKAKANJA
    public void obrisiSastojak(String nazivSastojka){
        for (int i = 0; i < this.nizSastojaka.size(); i++) {
            if (this.nizSastojaka.get(i).getNaziv().equals(nazivSastojka)){
                nizSastojaka.remove(i);
            }
        }
    }
}
