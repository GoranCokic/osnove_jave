package p_15_09_2023.Zadatak1;

public class Profesor extends Osoba {
    private String nazivPredmetaKojiPredaje;
    private double iznosPlate;

    public Profesor(String nazivPredmetaKojiPredaje, int iznosPlate, String imeIPrezime, String jmbg) {
        super(imeIPrezime,jmbg);
        this.nazivPredmetaKojiPredaje = nazivPredmetaKojiPredaje;
        this.iznosPlate = iznosPlate;
    }

    public void povecajPlatu(int procenat) {
        this.iznosPlate = this.iznosPlate + this.iznosPlate * procenat / 100.0;
    }
    @Override
    public void stampa() {
        super.stampa();
        System.out.println("Predmet " + this.nazivPredmetaKojiPredaje);
        System.out.println("Plata " + this.iznosPlate);
    }
}
