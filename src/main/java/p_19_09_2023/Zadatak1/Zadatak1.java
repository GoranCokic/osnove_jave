package p_19_09_2023.Zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {
        TaxMunicipality taxMunicipality = new TaxMunicipality("some city");

        taxMunicipality.addToBuildingsArray(new House("adress1", 100, 2, 5));
        taxMunicipality.addToBuildingsArray(new House("adress2", 150, 3, 2));
        taxMunicipality.addToBuildingsArray(new ResidentialBuilding("adress3", 500, 1, 10));
        taxMunicipality.addToBuildingsArray(new ResidentialBuilding("adress4", 1000, 1, 15));
        taxMunicipality.addToBuildingsArray(new Store("adress5", 100, 2));

        System.out.println();
        taxMunicipality.print();
        System.out.println("----");
        taxMunicipality.buildingWithHighestTax().print();
        System.out.println("----");
        taxMunicipality.buildingWithLowestTax().print();
        System.out.println("----");

    }
}
