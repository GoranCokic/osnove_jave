package p_19_09_2023.Zadatak1;

public class House extends Building {
    private int numberOfOccupants;

    public House(String adress, double surfaceAreaOfBuilding, int zone, int numberOfOccupants) {
        super(adress, surfaceAreaOfBuilding, zone);
        this.numberOfOccupants = numberOfOccupants;
    }

    @Override
    public double calculateTax() {
        return calculateCoefficient() * this.surfaceAreaOfBuilding;
    }

    @Override
    public void print() {
        System.out.println(this.getClass());
        System.out.println("Adress " + this.adress);
        System.out.println("Zone " + this.zone);
        System.out.println("Surface area " + this.surfaceAreaOfBuilding);
        System.out.println("Number of occupants " + this.numberOfOccupants);
    }
}
