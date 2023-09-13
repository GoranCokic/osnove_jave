package p_11_09_2023;

public class Tacka {
    private int x;
    private int y;

    public Tacka() {
        System.out.println("defaultni konstruktor je pozvan");
    }

    public Tacka(int x, int y) {
        System.out.println(("specijalan konstruktor je pozvan"));
        this.x = x;
        this.y = y;
    }

    public void stampaj() {
        System.out.println("koordinata x je: " + this.x);
        System.out.println("koordinata y je: " + this.y);
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
