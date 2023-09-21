package p_19_09_2023.Zadatak1;

public class ResidentialBuilding extends Building {
    private int numberOfApartments;

    public ResidentialBuilding(String adress, double surfaceAreaOfBuilding, int zone, int numberOfApartments) {
        super(adress, surfaceAreaOfBuilding, zone);
        this.numberOfApartments = numberOfApartments;
    }


    public double calculateTax() {
        return calculateCoefficient() * this.surfaceAreaOfBuilding * this.numberOfApartments;
    }

    public void print() {
        System.out.println(this.getClass());
        System.out.println("Adress " + this.adress);
        System.out.println("Zone " + this.zone);
        System.out.println("Surface area " + this.surfaceAreaOfBuilding);
        System.out.println("Number of apartments " + this.numberOfApartments);
    }
}
