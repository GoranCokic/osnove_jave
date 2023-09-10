package d_07_09_2023;

public class Zadatak6 {
    public static void main(String[] args) {

        Vozila vozilo1 = new Vozila();
        vozilo1.marka = "1marka";
        vozilo1.godinaProizvodnje = "1990";
        vozilo1.registarskiBroj = "neki broj";

        Vozaci vozac1 = new Vozaci();
        vozac1.brojVozackeDozvole = "1neka vozacka dozvola";
        vozac1.datumIstekaVozackeDozvole = "1neki datum isteka vozace dozvole";
        vozac1.ime = "vozac1";
        vozac1.prezime = "1vozac";

        Rute ruta1 = new Rute();
        ruta1.duzinaUKilometrima = 10;
        ruta1.ocekivanoVremePutovanja = 5;
        ruta1.polaznaTacka = "grad1";
        ruta1.odrediste = "grad11";
    }
}
