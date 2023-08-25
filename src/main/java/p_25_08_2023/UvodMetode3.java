package p_25_08_2023;

public class UvodMetode3 {
    public static void main(String[] args) {
        String ime = "Milan";
        String prezime = "Jovanovic";

        String x = getUser(ime, prezime); //prosledjujes kao parametar
        System.out.println(x);
    }                               //ovo ovde dole su parametri, to je ono sto ulazi u metodu/funkciju, i na taj nacin saljes podatke u metodu

    // int, double, String, char, boolean, ... , ArrayList<String> , ... , void
    public static String getUser(String firstName, String lastName) { //String mora da returnuje string, int MORA da returnuje int, void MORA DA NEMA RETURN
        return firstName +" " + lastName; //kad stoji nesto drugo umesto void, MORA DA STOJI RETURN statement
        //return UVEK VRACA JEDNU VREDNOST
    }
}
