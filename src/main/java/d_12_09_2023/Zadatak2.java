package d_12_09_2023;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {
        ArrayList<ZeleniKarton> listaKartona = new ArrayList<ZeleniKarton>();
        listaKartona.add(new ZeleniKarton("student1","1","predmet1","profesor1",5));
        listaKartona.add(new ZeleniKarton("student1","1","predmet2","profesor2",6));
        listaKartona.add(new ZeleniKarton("student1","1","predmet3","profesor3",7));
        listaKartona.add(new ZeleniKarton("student1","1","predmet4","profesor4",8));
        listaKartona.add(new ZeleniKarton("student1","1","predmet5","profesor5",9));

        int zbirOcena = 0;
        int zbirPolozenihOcena = 0;
        int brojac = 0;
        for (int i = 0; i < listaKartona.size(); i++) { //stampa podatke za sve ispite, racuna prosecnu ocenu, i racuna prosecnu ocenu polozenih ispita
            listaKartona.get(i).print();
            System.out.println("-----");
            int ocena = listaKartona.get(i).getOcena();
            zbirOcena = zbirOcena + ocena;
            if (ocena>5){
                zbirPolozenihOcena = zbirPolozenihOcena + ocena;
                brojac++;
            }

        }
        double prosecnaOcena = 1.0 * zbirOcena / listaKartona.size();
        System.out.println("prosecna ocena je " + prosecnaOcena);
        double prosecnaPolozenaOcena = 1.0 * zbirPolozenihOcena / brojac;
        System.out.println("prosecna polozena ocena je " + prosecnaPolozenaOcena);

    }

}
