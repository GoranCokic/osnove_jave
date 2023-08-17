package p_17_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        double srednjaVrednost =(a+b+c)/3;
        System.out.println(srednjaVrednost);
    }
}
