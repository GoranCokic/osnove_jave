package p_17_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite dan");
        int dan = s.nextInt();
        System.out.println("unesite mesec");
        int mesec = s.nextInt();
        System.out.println("unesite godinu");
        int godina = s.nextInt();
        System.out.println(dan+""+mesec+""+godina);
    }
}
