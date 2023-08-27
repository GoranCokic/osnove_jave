//Zadatak
//Napisati metodu koja stampa podatke o korisniku u formatu:
//JMBG: [jmbg]
//Ime: [ime]
//Prezime: [prezime]
//God. rodjenja: [god]
//Aktivan: [true/false]
//Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.Metoda nista ne vraca.

package d_25_08_2023;

public class Zadatak3 {
    public static void main(String[] args) {
        int JMBG = 123123;
        String ime = "adfsa";
        String prezime = "asdafd";
        int godRodjenja = 12332;
        boolean aktivan = false;
        metodaKojaStampaStvari(JMBG, ime, prezime, godRodjenja, aktivan);
    }

    public static void metodaKojaStampaStvari(int jmbg, String ime, String prezime, int godinaRodjenja, boolean aktivan) {
        System.out.println("JMBG: " + jmbg);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("God. rodjenja: " + godinaRodjenja);
        System.out.println("Aktivan: " + aktivan);
    }
}

