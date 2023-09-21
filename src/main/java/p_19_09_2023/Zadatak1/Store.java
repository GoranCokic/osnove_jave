package p_19_09_2023.Zadatak1;

public class Store extends Building{

    public Store(String adress, double surfaceAreaOfBuilding, int zone) {
        super(adress, surfaceAreaOfBuilding, zone);
    }

    public double calculateTax() {
        return calculateCoefficient() * this.surfaceAreaOfBuilding * 1.3;

    }

    public void print() {
        System.out.println(this.getClass());
        System.out.println("Adress " + this.adress);
        System.out.println("Zone " + this.zone);
        System.out.println("Surface area " + this.surfaceAreaOfBuilding);
    }
}
