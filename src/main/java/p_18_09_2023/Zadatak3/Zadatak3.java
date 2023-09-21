package p_18_09_2023.Zadatak3;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {
        Jednakostranicni_trougao jednakostranicni_trougao1 = new Jednakostranicni_trougao(5);
        Jednakostranicni_trougao jednakostranicni_trougao2 = new Jednakostranicni_trougao(5);

        Pravougaonik pravougaonik1 = new Pravougaonik(3,4);
        Pravougaonik pravougaonik2 = new Pravougaonik(5,7);
        Pravougaonik pravougaonik3 = new Pravougaonik(8,4);

        ArrayList<Figura> figuras = new ArrayList<Figura>();
        figuras.add(pravougaonik1);
        figuras.add(pravougaonik2);
        figuras.add(pravougaonik3);
        figuras.add(jednakostranicni_trougao1);
        figuras.add(jednakostranicni_trougao2);

        double circumferenceSum = 0;
        double surfaceAreaSum = 0;
        for (int i = 0; i < figuras.size(); i++) {
            System.out.println(figuras.get(i).getClass());
            figuras.get(i).print();
            circumferenceSum = circumferenceSum + figuras.get(i).circumference();
            surfaceAreaSum = surfaceAreaSum + figuras.get(i).surfaceArea();
        }
        System.out.println();
        System.out.println("Circumference sum is " + circumferenceSum);
        System.out.println("Surface area sum is " + surfaceAreaSum);
    }
}
