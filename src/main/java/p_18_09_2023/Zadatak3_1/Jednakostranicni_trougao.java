package p_18_09_2023.Zadatak3_1;

public class Jednakostranicni_trougao extends Figura {
    private int sideA;

    public Jednakostranicni_trougao(int sideA) {
        this.sideA = sideA;
    }

    public double surfaceArea() {
        return (sideA * sideA) * 1.73205 / 4;
    }

    public double circumference() {
        return 3*sideA;
    }
}
