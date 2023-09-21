package p_19_09_2023.Zadatak1;

public abstract class Building {
    protected String adress;
    protected double surfaceAreaOfBuilding;
    protected int zone;

    public Building(String adress, double surfaceAreaOfBuilding, int zone) {
        this.adress = adress;
        this.surfaceAreaOfBuilding = surfaceAreaOfBuilding;
        this.zone = zone;
    }

    public double calculateCoefficient() {
        if (this.zone == 1) {
            return 1.4;
        } else if (this.zone == 2) {
            return 1.1;
        } else if (this.zone == 3) {
            return 1.05;
        } else {
            return 0;
        }
    }

    public abstract double calculateTax();

    public abstract void print();
}
