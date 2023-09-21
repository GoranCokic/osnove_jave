package p_18_09_2023.Zadatak3;

public class Pravougaonik extends Figura{
    private int sideA;
    private int sideB;

    public Pravougaonik(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double surfaceArea() {
        return sideA * sideB;
    }

    public double circumference() {
        return 2 * sideA + 2 * sideB;
    }
}