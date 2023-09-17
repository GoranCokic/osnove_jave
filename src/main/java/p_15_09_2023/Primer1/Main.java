package p_15_09_2023.Primer1;

public class Main {
    public static void main(String[] args) {
        Auto a = new Auto();
        a.setRegistracija("NI-2921");
        a.setBrojVrata(5);
        a.setMarka("BMW");
        System.out.println("-----");
        a.stampaj();
        System.out.println("-----");
        a.dodajGas();
        a.dodajGas();
        a.dodajGas();
        a.dodajGas();

        Kamion k = new Kamion();
        k.setRegistracija("NI-9393");
        k.setMarka("FAP");
        k.setNosivost(2000);
        k.stampajKamiion();
        k.dodajGas();
        k.dodajGas();
        k.dodajGas();

        k.koci();


        System.out.println("KRAJ");
    }
}

