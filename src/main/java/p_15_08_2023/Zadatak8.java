package p_15_08_2023;

public class Zadatak8 {
    public static void main(String[] args) {
//        Napisati program koji racuna povrsinu kvadrata stranice a, i povrsinu kruga poluprecnika r. PI = 3.14. Povrsina kruga je r (na kvadrat) * pi
//        Primer izvrsenja:
//        a: 5
//        Povrsina kvadrata je 25
//        r: 3
//        Povrsina kruga je 28.26
        int a = 5;
        int r = 3;
        double povrsinaKvadrata = a*a;
        double povrsinaKruga = r*r*3.14;
        System.out.println("povrsina kvadrata je " + povrsinaKvadrata);
        System.out.println("povrsina kruga je " + povrsinaKruga);
    }
}
