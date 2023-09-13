package p_11_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setIme("Goran");
        student1.setPrezime("Cokic");
        student1.setBrojIndeksa(1234);
        student1.setDaLiJeNaBudzetu(true);

        student1.stampa();
    }
}
