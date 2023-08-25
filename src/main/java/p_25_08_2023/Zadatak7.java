//7. Napisati metodu koja proverava da li je trougao pravougli. Metoda prima stranice trougla i hipotenuzu trougla. Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
//Trougao je pravougli ukoliko je a*a+b*b=c*c

package p_25_08_2023;

public class Zadatak7 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        String result = isNormal(a, b, c);
        System.out.println(result);
    }

    public static String isNormal(int a, int b, int c) {
        if (a * a + b * b == c * c) {
            return "jeste";
        } else {
            return "nije";
        }
    }
}
