package p_11_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        Tacka tacka1 = new Tacka(); //poziv preko defaultnog konstrukora
        tacka1.setX(10);
        tacka1.setY(20);
        tacka1.stampaj();

        Tacka tacka2 = new Tacka(30,40); //poziv preko specijalnog
        tacka2.stampaj();
    }
}
