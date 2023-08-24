package p_24_08_2023;

import java.util.ArrayList;

public class Nizevi {
    public static void main(String[] args) {
        ArrayList<String> cars= new ArrayList<String>();
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.size(); //vraca duzinu niza isto kao sto string.length() vraca duzinu

        cars.get(0); //uzimas element iz niza sa nultog indeksa
        cars.set(2,"Nissan"); //postavi nissan umesto Ford na drugom indeksu

        //ArrayList<Referentni tip> ovde ne moze biti primitivan tip. Npr niz BROJEVA se pise kao ArrayList<Integer> brojevi = new ArrayList<Integer>();
        //ArrayList<String> rec = new ArrayList<String>();
        //ArrayList<Character>
        //ArrayList<Double>
        //ArrayList<Boolean>
        //OVO SU SVE KLASE odnosno WRAPPERI

        System.out.println("Kraj");
    }
}
