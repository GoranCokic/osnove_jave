package p_15_08_2023;

public class Zadatak4 {
    public static void main(String[] args) {
//Napisati program koji na ekranu stampa podatke u formatu:
//Sifra [SIFRA PROIZVODA]
//[NAZIV PROIZVODA]  - $[CENA] - Popust [POPUST]%
//[BOJA], [VELICINA]
//
//Svaku informaciju za proizvod je potrebno cuvati u okviru zasebne promenljive.
//Primer izvrsenja:
//Sifra x932k20
//Nike Patike - $90 - Popust 13.5%
//Crna, 46.5
        int sifra=123123;
        String nazivProizvoda="ime proizvoda";
        int cena=323;
        double popust = 50.5;
        String boja="zelena";
        String velicina="XL";

        System.out.println("Sifra " + sifra);
        System.out.println(nazivProizvoda + " - $ " + cena + "- Popust " + popust +"%");
        System.out.println(boja+","+velicina);
    }
}
