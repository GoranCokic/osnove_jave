//Napisati program koji od korisnika ucitava N brojeva  i ispisuje sumu tih brojeva. N nam kaze koliko broja ce korisnik da unese.
//Primer izvrsenja:
//Unesite N: 3
//Unesite broj: 1
//Unesite broj: 4
//Unesite broj: 9
//Suma je 14.

package p_21_08_2023;

import java.util.Scanner;

public class Zadatak5{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i;
        int suma=0;

        for(i=0;i<n;i=i+1){
            int broj = s.nextInt();
            suma=suma+broj;
        }
        System.out.println(suma);
    }
}
