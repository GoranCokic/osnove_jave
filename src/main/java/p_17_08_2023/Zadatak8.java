package p_17_08_2023;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if(a*a+b*b==c*c){
            System.out.println("Trougao je pravougli");
        }else{
            System.out.println("Trougao nije pravougli");
        }
    }
}
