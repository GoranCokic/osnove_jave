package p_18_09_2023.Zadatak3_1;

public abstract class Figura {

    public Figura() {
    }

    public abstract double surfaceArea();

    public abstract double circumference();

    public void print() {
        System.out.println("Surface area is " + this.surfaceArea());
        System.out.println("Circumference is " + this.circumference());
    }
}
