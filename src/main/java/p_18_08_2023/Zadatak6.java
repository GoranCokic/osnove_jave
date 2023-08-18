//Napisati porogram koji od korisnika ucitava dva broja M i N i stampa sve brojeve izmedju M i N. Smatrajte da je M manje od N.
//Primer izvrsenja:
//Unesite M: 10
//Unesite N: 15
//10, 11, 12, 13, 14, 15,
//Print da vam bude u jednom redu i sa zarezima!

package p_18_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int i;
        for (i=0; i<=(n-m);i=i+1){
            System.out.print(m+i+",");
        }
    }
}
