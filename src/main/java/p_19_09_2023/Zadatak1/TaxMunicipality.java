package p_19_09_2023.Zadatak1;

import java.util.ArrayList;

public class TaxMunicipality {
    private String nameOfCity;
    private ArrayList<Building> arrayOfBuildings;

    public TaxMunicipality(String nameOfCity) {
        this.nameOfCity = nameOfCity;
        this.arrayOfBuildings = new ArrayList<Building>();
    }

    public void addToBuildingsArray(Building building) {
        this.arrayOfBuildings.add(building);
    }

    public Building buildingWithHighestTax() {
        Building b = this.arrayOfBuildings.get(0);
        double highestTax = this.arrayOfBuildings.get(0).calculateTax();
        for (int i = 0; i < this.arrayOfBuildings.size(); i++) {
            if (this.arrayOfBuildings.get(i).calculateTax() > highestTax) {
                highestTax = this.arrayOfBuildings.get(i).calculateTax();
                b = this.arrayOfBuildings.get(i);
            }
        }
        return b;
    }

    public Building buildingWithLowestTax() {
        Building b = this.arrayOfBuildings.get(0);
        double lowestTax = this.arrayOfBuildings.get(0).calculateTax();
        for (int i = 0; i < this.arrayOfBuildings.size(); i++) {
            if (this.arrayOfBuildings.get(i).calculateTax() < lowestTax) {
                lowestTax = this.arrayOfBuildings.get(i).calculateTax();
                b = this.arrayOfBuildings.get(i);
            }
        }
        return b;
    }

    public double calculateTax() {
        double totalTax = 0;
        for (int i = 0; i < arrayOfBuildings.size(); i++) {
            totalTax = totalTax + this.arrayOfBuildings.get(i).calculateTax();
        }
        return totalTax;
    }

    public void print() {
        for (int i = 0; i < arrayOfBuildings.size(); i++) {
            this.arrayOfBuildings.get(i).print();
            System.out.println("Highest tax is " + this.buildingWithHighestTax().calculateTax() + " for building " + this.arrayOfBuildings.get(i).getClass());
            System.out.println("Lowest tax is " + this.buildingWithLowestTax().calculateTax() + " for building " + this.arrayOfBuildings.get(i).getClass());
            System.out.println("Total tax is " + this.calculateTax());
            System.out.println();
        }
    }
}
