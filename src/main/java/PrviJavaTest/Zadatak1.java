package PrviJavaTest;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite min visinu: ");
        int minVisina = s.nextInt();
        System.out.println("Unesite max visinu: ");
        int maxVisina = s.nextInt();
        System.out.println("Unesite grad: ");
        String grad = s.next();
        System.out.println("Unesite min starost: ");
        int minStarost = s.nextInt();
        System.out.println("Unesite max starost: ");
        int maxStarost = s.nextInt();
        System.out.println("Unesite boju kose: ");
        String bojaKose = s.next();
        System.out.println("Da li treba da ima bradu: (true/false)");
        boolean daLiTrebaBrada = s.nextBoolean();

        System.out.println("visina je: ");
        int visina = s.nextInt();
        System.out.println("mesto je: ");
        String mesto = s.next();
        System.out.println("starost je: ");
        int starost = s.nextInt();
        System.out.println("boja kose je: ");
        String kosa = s.next();
        System.out.println("da li nosi bradu: (true/false)");
        boolean imaBradu = s.nextBoolean();

        int brojac = 0;
        if (visina >= minVisina && visina <= maxVisina) {
            brojac++;
        }
        if (grad.equals(mesto)) {
            brojac++;
        }
        if (starost >= minStarost && starost <= maxStarost) {
            brojac++;
        }
        if (kosa.equals(bojaKose)) {
            brojac++;
        }
        if (daLiTrebaBrada == imaBradu) {
            brojac++;
        }
        if (brojac >= 3) {
            System.out.println("Pronašli ste svog idealnog muškarca!");
        } else {
            System.out.println("Muškarac ne ispunjava vaše zahteve.");
        }
    }
}
