//Napisati program koji ucitava brojeve a, b i c sa tastature i za svaki broj proverava da li je validan. Ukoliko broj nije validan, ispisuje se greska za svaki broj.
//Broj nije validan ukoliko je broj negativan.

package p_17_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesi broj a: ");
        int a = s.nextInt();
        System.out.println("Unesi broj b: ");
        int b = s.nextInt();
        System.out.println("Unesi broj c: ");
        int c = s.nextInt();
        if(a<0){
            System.out.println("broj a je negativan: " + a);
        }
        if(b<0) {
            System.out.println("broj b je negativan: " + b);
        }
        if(c<0){
            System.out.println("broj c je negativan: " + c);
        }
    }
}
