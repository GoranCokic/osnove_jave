package p_25_08_2023;

public class UvodMetode2 {
    public static void main(String[] args) {

        String ime = "Milan";
        String prezime = "Jovanovic";

        printUser(ime, prezime, true); //prosledjujes kao parametar
    }                               //ovo ovde dole su parametri, to je ono sto ulazi u metodu/funkciju, i na taj nacin saljes podatke u metodu

    public static void printUser(String firstName, String lastName, Boolean aktivan) {
        if (aktivan) {
            System.out.println(firstName + " " + lastName);
        }
    }
}
